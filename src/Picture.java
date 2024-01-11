public class Picture
{
    private Square wall, wall2, wall3, wall4;
    private Square window, window2, innerWindow, innerWindow2;
    private Triangle roof, roof2, roof3, roofWhite, roofWhite2 ;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        wall2 = new Square();
        wall3 = new Square();
        wall4 = new Square();
        window = new Square();
        window2 = new Square();
        innerWindow = new Square();
        innerWindow2 = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        roof3 = new Triangle();
        roofWhite2 = new Triangle();
        roofWhite = new Triangle();
        sun = new Circle();
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

            roof3.changeColor("brick");
            roof3.changeSize(60, 250);
            roof3.moveHorizontal(180);
            roof3.moveVertical(-60);
            roof3.makeVisible();

            roof2.changeColor("darkBrick");
            roof2.changeSize(120, 330);
            roof2.moveHorizontal(50);
            roof2.moveVertical(-110);
            roof2.makeVisible();

            wall3.changeColor("creamDark");
            wall3.moveHorizontal(-90);
            wall3.moveVertical(20);
            wall3.changeSize(160);
            wall3.makeVisible();

            wall.changeColor("cream");
            wall.moveHorizontal(-220);
            wall.moveVertical(20);
            wall.changeSize(160);
            wall.makeVisible();

            wall2.changeColor("cream");
            wall2.moveHorizontal(-180);
            wall2.moveVertical(20);
            wall2.changeSize(160);
            wall2.makeVisible();


            window.changeColor("white");
            window.moveHorizontal(-165);
            window.moveVertical(50);
            window.changeSize(60);
            window.makeVisible();

            innerWindow.changeColor("teal");
            innerWindow.moveHorizontal(-159);
            innerWindow.moveVertical(55);
            innerWindow.changeSize(50);
            innerWindow.makeVisible();

            window2.changeColor("white");
            window2.moveHorizontal(-140);
            window2.moveVertical(50);
            window2.changeSize(60);
            window2.makeVisible();

            innerWindow2.changeColor("teal");
            innerWindow2.moveHorizontal(-135);
            innerWindow2.moveVertical(55);
            innerWindow2.changeSize(50);
            innerWindow2.makeVisible();

            roofWhite.changeColor("white");
            roofWhite.changeSize(60, 250);
            roofWhite.moveHorizontal(-20);
            roofWhite.moveVertical(-56);
            roofWhite.makeVisible();

            roof.changeColor("brick");
            roof.changeSize(60, 250);
            roof.moveHorizontal(-20);
            roof.moveVertical(-60);
            roof.makeVisible();


            sun.changeColor("yellow");
            sun.moveHorizontal(30);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;


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
