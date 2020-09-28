
import processing.core.PApplet;
import processing.data.Table;

import java.io.BufferedReader;

public class Data {
    PApplet p;
String name;
String year;
String deaths;
Data(PApplet p,String n,String y,String d){
    name=n;
    year=y;
    deaths=d;
}
void fixDeaths(){
    if(deaths.equalsIgnoreCase("")){
        deaths="0";
    }
}

}
