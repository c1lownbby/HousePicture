public class Picture
{
    private Square wall, wall2;
    private Square window;
    private Triangle roof;
    private Circle sun, window2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        wall2 = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        window2 = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.changeColor("pink");
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(160);
            wall.makeVisible();


            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();

            roof.changeColor("pink");
            roof.changeSize(60, 160);
            roof.moveHorizontal(40);
            roof.moveVertical(-60);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(30);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;

            window2.changeColor("white");
            window2.moveHorizontal(30);
            window2.moveVertical(-80);
            window2.makeVisible();
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
