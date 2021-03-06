import processing.core.PApplet;

import java.util.ArrayList;

public class Broker {
    PApplet p;


    ArrayList<Data> dataList = new ArrayList<>();
    void loadData(){
        String name;
        String[] rows = p.loadStrings("csv-deaths-natural-disasters.csv");
        String[] header = rows[0].split(",");


            for(int i =1;i<rows.length;i++) {
            String[] cells = p.split(rows[i],",");
            for(int j = 2;j<cells.length;j++) {
                ;
                name = cells[1];
                String deaths = cells[j];
                dataList.add(new Data(p,name,header[j],deaths));
                p.println(header[j]);
            }

        }
    }
    public int getData(String year, String land){
        int d=0;
        for(int i = 0; i < dataList.size(); i++){
            Data data = dataList.get(i);
            if( land.equalsIgnoreCase(data.name) && year.equalsIgnoreCase(data.year)){
                d = Integer.parseInt(data.deaths); }
        }
        return d;

    }
}
