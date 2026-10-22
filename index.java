class Tile
{
    int x, y;
    color color;

    boolean spread;

    Tile(int x, int y, int color)
    {
        this.x = x;
        this.y = y;
        this.color = color;

        spread = false;
    }
    void Display()
    {
        fill(color);
        if (!show) noStoke();
        else stroke(180);

        rect(x * 20, y * 20, 20, 20);
    }
}

Tile grid[][] = new Tile[25][25];

color colors[] = {
    color(165, 42, 42),
    color(255, 0, 0),
    color(255, 165, 0),
    color(255, 255, 0)
    color(0. 150, 0)
    color(0, 0, 255)
    color(255, 0, 200)
    color(100)
    color(255)
};

color selected = color(255);
boolean show = true;