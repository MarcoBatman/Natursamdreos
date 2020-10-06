import processing.core.PApplet;

public class Graph {
    PApplet p;
    int posx, posy;
    int sum;
    int j;
    int k;

    Graph(PApplet p, int x, int y) {
        this.p = p;
        this.posx = x;
        this.posy = y;

    }

    void draw(Broker b, Box year, Box country) {
        p.fill(0);
        p.rect(posx, posy + 600, 1730, 5);
        p.rect(posx, posy, 5, 600);
        if (j % 3 == 0 && k < 114) {
            int yearint = 2014 - k;
            String yearstring = "" + yearint;
            sum += b.getData(yearstring, country.input);
            k++;
        }
        for (int i = 0; i <= k; i++) {
            int yearint = 2014 - i;
            String yearstring = "" + yearint;
            p.fill(0);
            if (year.input.equalsIgnoreCase(yearstring))
                p.fill(255, 0, 0);
            p.textSize(10);
            p.pushMatrix();
            p.rotate((float) 1.57079633);
            p.text(2014 - i, 910, -25 - i * 15);
            p.popMatrix();
            p.ellipse(27 + i * 15, posy + 600 - b.getData(yearstring, country.input) / 2, 10, 10);
        }
        p.fill(0);
        if (k >= 114)
            p.fill(0, 0, 255);
        p.rect(1800, 900, 20, -sum / 100);
        p.text("Sum /100", 1790, 920);
        j++;
    }
}


