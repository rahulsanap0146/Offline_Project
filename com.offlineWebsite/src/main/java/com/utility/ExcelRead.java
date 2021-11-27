package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ExcelRead {
	public static List<String> readExcelFile(String filepath, int sheetNo) throws IOException {
		File inputWorkbook = new File(filepath);
		Workbook w;
		String data = null;
		List<String> excelList = new ArrayList<String>();
		try {
			w = Workbook.getWorkbook(inputWorkbook);

			Sheet sheet = w.getSheet(sheetNo);

			for (int j = 0; j < sheet.getColumns(); j++) {
				for (int i = 1; i < sheet.getRows(); i++) {
					Cell cell = sheet.getCell(j, i);
					CellType type = cell.getType();
					if (type == CellType.LABEL) {
						data = cell.getContents();
						System.out.println(data);
						excelList.add(data);
					}

					/*
					 * if (type == CellType.NUMBER) {
					 * System.out.println(cell.getContents()); }
					 */
				}
			}
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return excelList;
	}

	public static void main(String[] args) throws IOException {
		readExcelFile(System.getProperty("user.dir")+"/src/test/resources/Data.xls", 6);

	}
}
