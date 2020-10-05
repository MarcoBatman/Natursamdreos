import processing.core.PApplet;

public class Box {
    PApplet p;
    int posx;
    int posy;
    int width;
    int height;
    int type;
    boolean clicked;
    String input ="";
    Box(PApplet p,int x,int y,int w,int h,int type){
        this.p=p;
        this.posx=x;
        this.posy=y;
        this.width=w;
        this.height=h;
        this.type=type;
    }

    void clicked(){
        if(p.mouseX>posx&&p.mouseX<posx+width&&p.mouseY>posy&&p.mouseY<posy+height){
            clicked=true;
        }else{
            clicked=false;
        }
    }

    void draw(){

        if (type ==1){
        p.fill(255);
        p.rect(posx,posy,width,height);
        p.fill(0);
        p.textSize(30);
        p.text("County",posx-110,posy+40);
        p.text(input,posx+10,posy+40);}

        if(type == 2){
            p.fill(255);
            p.rect(posx,posy,width,height);
            p.fill(0);
            p.textSize(30);
            p.text("Year",posx-110,posy+40);
            p.text(input,posx+10,posy+40);}
        if(clicked){
            p.rect(posx+width+50,posy+height/3,40,height/3);
            p.triangle(posx+width+50,posy,posx+width+50,posy+height,posx+width+20,posy+height/2);
        }

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
