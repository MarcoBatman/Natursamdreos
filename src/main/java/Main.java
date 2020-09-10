import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    Broker broker = new Broker();
    @Override
    public void settings() {
        super.settings();
    }

    @Override
    public void setup() {
        super.setup();
        broker.p = this;
    broker.loadData();
    }

    @Override
    public void draw() {

    }
}