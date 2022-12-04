package com.Utilities;

import com.CustomModels.BillDetailWithProductDetailCustomModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class ExportExcel {

    public void excel(List<BillDetailWithProductDetailCustomModel> list, String nameSheet) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet(nameSheet);// creating a blank sheet
            int rownum = 0;
            int count = 0;
            for (BillDetailWithProductDetailCustomModel billDetailWithProductDetailCustomModel : list) {
                count++;
                Row row = sheet.createRow(rownum++);
                createList(billDetailWithProductDetailCustomModel, row, count);

            }

            FileOutputStream out = new FileOutputStream(new File("ThongKeSanPham.xlsx")); // file name with path
            workbook.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void createList(BillDetailWithProductDetailCustomModel billDetailWithProductDetailCustomModel, Row row, int count) // creating cells for each row
    {

        Cell cell = row.createCell(0);
        cell.setCellValue(count);

        cell = row.createCell(1);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getMaSP());

        cell = row.createCell(2);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getTenSP());

        cell = row.createCell(3);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getLoaiSP());

        cell = row.createCell(4);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getMauSac());

        cell = row.createCell(5);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getKichCo());

        cell = row.createCell(6);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getChatLieu());

        cell = row.createCell(7);
        cell.setCellValue(billDetailWithProductDetailCustomModel.getSoLuong());
    }
}
