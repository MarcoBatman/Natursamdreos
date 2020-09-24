import processing.core.PApplet;

public class Box {
    PApplet p;
    int posx;
    int posy;
    int width;
    int height;
    Box(PApplet p,int x,int y,int w,int h){
        this.p=p;
        this.posx=x;
        this.posy=y;
        this.width=w;
        this.height=h;
    }

    void clicked(){
        if(p.mouseX>posx&&p.mouseX<posx+width&&p.mouseY>posy&&p.mouseY<posy+height){
            p.println("bruh");
        }

    }

    void draw(){
        p.rect(posx,posy,width,height);
    }

}
