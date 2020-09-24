import processing.core.PApplet;

public class Box {
    PApplet p;
    int posx;
    int posy;
    int width;
    int height;
    boolean clicked;
    String input ="";
    Box(PApplet p,int x,int y,int w,int h){
        this.p=p;
        this.posx=x;
        this.posy=y;
        this.width=w;
        this.height=h;
    }

    void clicked(){
        if(p.mouseX>posx&&p.mouseX<posx+width&&p.mouseY>posy&&p.mouseY<posy+height){
            clicked=true;
        }else{
            clicked=false;
        }
    }

    void draw(){
        p.fill(255);
        p.rect(posx,posy,width,height);
        p.fill(0);
        p.text(input,posx,posy+50);
    }

    void writing(char key){

        if(clicked){
            if(key==p.BACKSPACE&&input.length()>0){
                input =input.substring(0,input.length()-1);
            }else if(key!=p.BACKSPACE){
                input = input + key;
            }
        }
    }
}
