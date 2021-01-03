import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import 

public class InitStations {
    Vector<Integer> stations = new Vector<Integer>();
    Vector<Integer> edge = new Vector<Integer>();

    public InitStations(int n) {
        new InitStations(n);
        this.initStations(n);
    }

    public InitStations(List<Map> dataList) {
        new InitStations(dataList);
        this.initStations(dataList);
    }

    //手工创建站点信息
    public void initStations(int n) {
        for (int i = 0; i < n; ++i) {
            try {
                //输入起始站、终点站、站点间的票价（以','分隔开）
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

    //从表格输入站点信息
    public void initStations() {
        File file = new File("D:/Program/vscode/Java/maven/other/info_station.xlsx");
        try {
            InputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            
        } catch (Exception e) {
            //TODO: handle exception
        }
       
    }

    public static void main(String args[]) {

    }

}
