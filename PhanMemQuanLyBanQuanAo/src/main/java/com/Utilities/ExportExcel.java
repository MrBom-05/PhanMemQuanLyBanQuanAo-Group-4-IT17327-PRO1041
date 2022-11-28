package com.Utilities;

import com.CustomModels.ProductDetailCustomModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class ExportExcel {

    public void excel(List<ProductDetailCustomModel> list, String nameSheet) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet(nameSheet);// creating a blank sheet
            int rownum = 0;
            int count = 0;
            for (ProductDetailCustomModel productDetailCustomModel : list) {
                count++;
                Row row = sheet.createRow(rownum++);
                createList(productDetailCustomModel, row, count);

            }

            FileOutputStream out = new FileOutputStream(new File("ThongKeSanPham.xlsx")); // file name with path
            workbook.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void createList(ProductDetailCustomModel productDetailCustomModel, Row row, int count) // creating cells for each row
    {

        Cell cell = row.createCell(0);
        cell.setCellValue(count);

        cell = row.createCell(1);
        cell.setCellValue(productDetailCustomModel.getMaSP());

        cell = row.createCell(2);
        cell.setCellValue(productDetailCustomModel.getTenSP());

        cell = row.createCell(3);
        cell.setCellValue(productDetailCustomModel.getLoaiSP());

        cell = row.createCell(4);
        cell.setCellValue(productDetailCustomModel.getMauSac());

        cell = row.createCell(5);
        cell.setCellValue(productDetailCustomModel.getKichCo());

        cell = row.createCell(6);
        cell.setCellValue(productDetailCustomModel.getChatLieu());

        cell = row.createCell(7);
        cell.setCellValue(productDetailCustomModel.getSoLuong());
    }
}
