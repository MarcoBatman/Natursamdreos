import processing.core.PApplet;

import java.util.ArrayList;

public class Broker {
    PApplet p;


    ArrayList<Data> list = new ArrayList<Data>();
    void loadData(){
        String navn;
        String[] rows = p.loadStrings("csv-deaths-natural-disasters.csv");
        String[] header = rows[0].split(",");
        for(int i =1;i<rows.length;i++) {
            String[] cells = p.split(rows[i],",");
            for(int j = 2;j<cells.length;j++){

                navn=cells[1];
                int deaths = Integer.parseInt(cells[j]);
                p.println( deaths);
            }
        }
    }
}
