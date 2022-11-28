package com.Utilities;

import com.Models.Promotion;
import com.Services.Implements.PromotionServiceImplement;
import com.Services.PromotionService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExportExcel {
    PromotionService promotionService = new PromotionServiceImplement();

    public static void main(String args[]) {
        List<Promotion> list = new ArrayList<Promotion>();


        try {
            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet("Sheet1");// creating a blank sheet
            int rownum = 0;
            for (Promotion promotion : list) {
                Row row = sheet.createRow(rownum++);
                createList(promotion, row);

            }

            FileOutputStream out = new FileOutputStream(new File("NewFile.xlsx")); // file name with path
            workbook.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void createList(Promotion promotion, Row row) // creating cells for each row
    {
        Cell cell = row.createCell(0);
        cell.setCellValue(promotion.getCode());

        cell = row.createCell(1);
        cell.setCellValue(promotion.getName());


    }
}
