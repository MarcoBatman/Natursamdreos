import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }
    Graph graph = new Graph(this,10,300);
    Broker broker = new Broker();
    Box boxCountry = new Box(this, 200, 50, 600, 50,1);
    Box boxYear = new Box(this,200,110,600,50,2);

    @Override
    public void settings() {
        super.settings();
        size(1920, 1000);
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
        graph.draw(broker,boxYear,boxCountry);
        graph.animation(broker,boxYear,boxCountry);
        fill(0);
        textSize(20);
    text("Deaths: " + broker.getData(boxYear.input,boxCountry.input),1000,150);

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

    @Override
    public void keyReleased() {
        graph.k=0;
        graph.j=0;
        graph.sum=0;
    }
}