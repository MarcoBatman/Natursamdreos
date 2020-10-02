import processing.core.PApplet;

public class Graph {
    PApplet p;
    int posx,posy;
    Graph(PApplet p,int x,int y){
       this.p=p;
       this.posx=x;
       this.posy=y;
    }
    void draw(Broker b,Box year, Box country){
        p.fill(0);
        p.rect(posx,posy+600,800,5);
        p.rect(posx,posy,5,600);
        for(int i = 0;i<=114;i++){
            p.textSize(10);
            p.pushMatrix();
            p.rotate((float) 1.57079633);
        p.text(2014-i,910,-25-i*15);
        p.popMatrix();
        int yearint = 2014-i;
        String yearstring = ""+yearint;
            p.ellipse(25+i*15,posy+600-b.getData(yearstring,country.input)/2,5,5);
        }
    }
}
