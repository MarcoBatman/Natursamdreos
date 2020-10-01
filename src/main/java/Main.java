import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    Broker broker = new Broker();
    Box boxCountry = new Box(this, 200, 100, 300, 50,1);
    Box boxYear = new Box(this,200,200,300,50,2);

    @Override
    public void settings() {
        super.settings();
        size(600, 600);
    }

    @Override
    public void setup() {

        super.setup();
        broker.p = this;
        broker.loadData();
        for (int i = 0; i < broker.dataList.size(); i++) {
            // println(broker.dataList.get(i).name + " " + broker.dataList.get(i).year + " " +broker.dataList.get(i).deaths);
            println(broker.dataList.get(i).name);
        }

    }

    @Override
    public void draw() {
        clear();
        background(255, 255, 0);
        for(int i = 0;i<broker.dataList.size();i++)
        broker.dataList.get(i).fixDeaths();
        boxCountry.draw();
        boxYear.draw();
        broker.getData(boxYear.input,boxCountry.input);
       // println(boxYear.input);
       
    text("Deaths: " + broker.getData(boxYear.input,boxCountry.input),200,500);

    }

    @Override
    public void mousePressed() {
        boxCountry.clicked();
        boxYear.clicked();

    }

    @Override
    public void keyTyped() {

        boxCountry.writing(key);
        boxYear.writing(key);
    }
}