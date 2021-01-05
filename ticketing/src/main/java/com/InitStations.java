package com;
import com.utils.IO;
import java.util.Vector;

public class InitStations {
    Vector<Integer> stations = new Vector<Integer>();
    Vector<Integer> edge = new Vector<Integer>();

    public InitStations(String filePath) {
        this.initStations(filePath);
    }
    
    /**
     * 初始化每个站点及站点间的权值（票价） 
     * @param filePath 初始化站点信息的文件路径
     */
    public void initStations(String filePath) {
       IO io = new IO(filePath);
       io.readFile();
    }
    

}
