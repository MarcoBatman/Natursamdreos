import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    Broker broker = new Broker();
    Box box = new Box(this,100,100,400,400);
    @Override
    public void settings() {
        super.settings();
        size(600,600);
    }

    @Override
    public void setup() {

        super.setup();
        broker.p = this;
    broker.loadData();
        for(int i =0;i<broker.dataList.size();i++){
            println(broker.dataList.get(i).name + " " + broker.dataList.get(i).year + " " +broker.dataList.get(i).deaths);
        }
    }

    @Override
    public void draw() {
        clear();
        box.draw();
        println(box.input);

    }

    @Override
    public void mousePressed() {
        box.clicked();

    }

    @Override
    public void keyTyped() {
        box.writing(key);
    }
}