package org;

import java.io.*;
import java.util.Vector;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InitStations {
    Vector<Integer> stations = new Vector<Integer>();
    Vector<Integer> edge = new Vector<Integer>();

    public InitStations(int n) {
        this.initStations(n);
    }

    public InitStations(String filePath, String sheetName) {
        this.initStations(filePath, sheetName);
    }

    // 手工创建站点信息
    public void initStations(int n) {
        for (int i = 0; i < n; ++i) {
            try {
                // 输入起始站、终点站、站点间的票价（以','分隔开）
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String str = in.readLine();
                System.out.println(str.getClass());
                // str = Integer.valueOf(in.readLine());
                // stations.add();
                // edge.add();

            } catch (IOException e) {
                // TODO: handle exception
            }
        }
    }

    /**
     * 从表格获取站点信息
     * 
     * @param filePath  csv路径
     * @param sheetName sheet表名
     */
    public void initStations(String filePath) {
        File csv = new File(filePath);
        try {
            BufferedReader textFile = new BufferedReader(new FileReader(csv));
            String lineData = "";
            while ((lineData = textFile.readLine()) != null)
                System.out.println(lineData);
            textFile.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("file read/write wrong");
        }

    }

    /**
     * 根据行和列索引获取单元格的数据
     * 
     * @param sheet
     * @param row
     * @param columm
     * @return
     */
    public String getExcelDateByIndex(XSSFSheet sheet, int row, int column) {
        XSSFRow row1 = sheet.getRow(row);
        String cell = row1.getCell(column).toString();
        return cell;
    }

}
