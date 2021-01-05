package com.utils;

import java.io.*;

public class IO {
    String filePath;
    public IO(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 读入表，返回每个属性的列
     * 
     */
    public void readFile() {
        File csv = new File(filePath);
        try {
            //文本的行数通过回车符来进行判定
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

    public void writeFile() {
        try {
            BufferedWriter writeText = new BufferedWriter(new FileWriter(filePath));
            // writeText.write(s, off, len);
            writeText.flush();
            writeText.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    } 

    


}
