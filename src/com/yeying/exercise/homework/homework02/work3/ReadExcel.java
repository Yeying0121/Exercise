package com.yeying.exercise.homework.homework02.work3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
    public static void readExcel(File file) {
        try {
            InputStream inputStream = new FileInputStream(file);
            Workbook xssfworkbook = null;
            xssfworkbook  = new XSSFWorkbook(inputStream);
            Sheet xssfSheet = xssfworkbook.getSheetAt(0);
            int firstRowIndex = xssfSheet.getFirstRowNum();
            int lastRowIndex = xssfSheet.getLastRowNum();
            for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex ++){
                Row row = xssfSheet.getRow(rIndex);
                if(row != null){
                    int firstCellIndex = row.getFirstCellNum();
                    int lastCellIndex = row.getLastCellNum();
                    for(int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex ++){
                        Cell cell = row.getCell(cIndex);
                        //createCell(xssfworkbook,row,cIndex,HorizontalAlignment.CENTER);
                        String value = "";
                        if(cell != null){
                            value = cell.toString();
                            System.out.print(value+"\t");
                        }
                    }
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File file = new File("F:/毕设相关/高血压知识整理/叶莹_高血压防治指南知识整理_1.0.xlsx");
        readExcel(file);
    }
}
