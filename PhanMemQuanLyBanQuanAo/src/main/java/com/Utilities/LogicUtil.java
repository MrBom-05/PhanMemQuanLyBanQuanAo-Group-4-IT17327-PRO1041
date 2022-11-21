package com.Utilities;

import static com.Utilities.CreateQR.generateQRcode;
import com.Views.TrangChu;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.digest.DigestUtils;

public class LogicUtil {

    //Check email có tồn tại không
    private static int hear(BufferedReader in) throws IOException {
        String line = null;
        int res = 0;

        while ((line = in.readLine()) != null) {
            String pfx = line.substring(0, 3);
            try {
                res = Integer.parseInt(pfx);
            } catch (Exception ex) {
                res = -1;
            }
            if (line.charAt(3) != '-') {
                break;
            }
        }

        return res;
    }

    private static void say(BufferedWriter wr, String text) throws IOException {
        wr.write(text + "\r\n");
        wr.flush();
        return;
    }

    private static ArrayList getMX(String hostName) throws NamingException {
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial",
                "com.sun.jndi.dns.DnsContextFactory");
        DirContext ictx = new InitialDirContext(env);
        Attributes attrs = ictx.getAttributes(hostName, new String[]{"MX"});
        Attribute attr = attrs.get("MX");

        if ((attr == null) || (attr.size() == 0)) {
            attrs = ictx.getAttributes(hostName, new String[]{"A"});
            attr = attrs.get("A");
            if (attr == null) {
                throw new NamingException("No match for name '" + hostName + "'");
            }
        }

        ArrayList res = new ArrayList();
        NamingEnumeration en = attr.getAll();

        while (en.hasMore()) {
            String x = (String) en.next();
            String f[] = x.split(" ");
            if (f[1].endsWith(".")) {
                f[1] = f[1].substring(0, (f[1].length() - 1));
            }
            res.add(f[1]);
        }
        return res;
    }
//    System.out.println(isAddressValid("herogamings96977@gmail.com"));

    public boolean isAddressValid(String address) {
        int pos = address.indexOf('@');
        if (pos == -1) {
            return false;
        }
        String domain = address.substring(++pos);
        ArrayList mxList = null;
        try {
            mxList = getMX(domain);
        } catch (NamingException ex) {
            return false;
        }
        if (mxList.isEmpty()) {
            return false;
        }
        for (int mx = 0; mx < mxList.size(); mx++) {
            boolean valid = false;
            try {
                int res;
                Socket skt = new Socket((String) mxList.get(mx), 25);
                BufferedReader rdr = new BufferedReader(new InputStreamReader(skt.getInputStream()));
                BufferedWriter wtr = new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()));

                res = hear(rdr);
                if (res != 220) {
                    throw new Exception("Invalid header");
                }
                say(wtr, "EHLO orbaker.com");

                res = hear(rdr);
                if (res != 250) {
                    throw new Exception("Not ESMTP");
                }

                say(wtr, "MAIL FROM: <tim@orbaker.com>");
                res = hear(rdr);
                if (res != 250) {
                    throw new Exception("Sender rejected");
                }

                say(wtr, "RCPT TO: <" + address + ">");
                res = hear(rdr);

                say(wtr, "RSET");
                hear(rdr);
                say(wtr, "QUIT");
                hear(rdr);
                if (res != 250) {
                    throw new Exception("Address is not valid!");
                }

                valid = true;
                rdr.close();
                wtr.close();
                skt.close();
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            } finally {
                if (valid) {
                    return true;
                }
            }
        }
        return false;
    }

    //Gửi mã về email
    public Integer codeVerification(String email, int random) {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(prop,
                new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("kynnph27937@gmail.com", "gokaskttduykyvay");
            }
        });
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("Google"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );

            message.setSubject("Tạo tài khoản ID [" + String.valueOf(random) + "]");
            message.setText("Chào bạn đã đến với phần mềm Quản Lý Bán Hàng của chúng tôi");
            Transport.send(message);
            System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    // Mã hóa password
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            String myHash = DatatypeConverter.printHexBinary(messageDigest).toUpperCase();
            return myHash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean kiemTraMatKhau(String password, String code) {
        return getMD5(password).equals(code);
    }

    public String taoMaHoa(String password) {
        String md5Hex = DigestUtils.md5Hex(password).toUpperCase();
        return md5Hex;
    }

    public void taoMaQR(String code) {
        
        //path where we want to get QR Code  
        String path = "D:\\PhanMemQuanLyBanQuanAo-Group-4-IT17327-PRO1041\\PhanMemQuanLyBanQuanAo\\QRCodeStaff\\" + code + ".png";
        //Encoding charset to be used  
        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
        //generates QR code with Low level(L) error correction capability  
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        try {
            //invoking the user-defined method that creates the QR code
            generateQRcode(code, path, charset, hashMap, 200, 200);//increase or decrease height and width accodingly   
        } catch (WriterException | IOException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
