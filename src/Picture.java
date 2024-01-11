public class Picture
{
    private Square wall, wall2, wall3, wall4, wall5;
    private Square window, window2, innerWindow, innerWindow2, roofExtend, roofExtend2, roofExtend3, garage, garage2, garageLine, sky;
    private Triangle roof, roof2, roof3, roofWhite, roofWhite2 ;
    private Circle moon, moonCover, star, star1;
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
        wall5 = new Square();
        window = new Square();
        window2 = new Square();
        innerWindow = new Square();
        innerWindow2 = new Square();
        roofExtend = new Square();
        roofExtend2 = new Square();
        roofExtend3 = new Square();
        sky = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        roof3 = new Triangle();
        roofWhite2 = new Triangle();
        roofWhite = new Triangle();
        moon = new Circle();
        moonCover = new Circle();
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


            sky.changeColor("nightSky");
            sky.changeSize(1000);
            sky.moveHorizontal(-350);
            sky.moveVertical(-190);
            sky.makeVisible();

            roofExtend.changeColor("brick");
            roofExtend.changeSize(60);
            roofExtend.moveHorizontal(159);
            roofExtend.moveVertical(-19);
            roofExtend.makeVisible();

            roofExtend2.changeColor("brick");
            roofExtend2.changeSize(60);
            roofExtend2.moveHorizontal(120);
            roofExtend2.moveVertical(-19);
            roofExtend2.makeVisible();

            roofExtend3.changeColor("brick");
            roofExtend3.changeSize(60);
            roofExtend3.moveHorizontal(80);
            roofExtend3.moveVertical(-19);
            roofExtend3.makeVisible();

            wall4.changeColor("cream");
            wall4.moveHorizontal(140);
            wall4.moveVertical(20);
            wall4.changeSize(160);
            wall4.makeVisible();

            wall5.changeColor("cream");
            wall5.moveHorizontal(120);
            wall5.moveVertical(20);
            wall5.changeSize(160);
            wall5.makeVisible();


            roof3.changeColor("brick");
            roof3.changeSize(70, 280);
            roof3.moveHorizontal(320);
            roof3.moveVertical(-40);
            roof3.makeVisible();

            wall3.changeColor("creamDark");
            wall3.moveHorizontal(-31);
            wall3.moveVertical(20);
            wall3.changeSize(160);
            wall3.makeVisible();

            roofWhite2.changeColor("white");
            roofWhite2.changeSize(60, 330);
            roofWhite2.moveHorizontal(90);
            roofWhite2.moveVertical(-45);
            roofWhite2.makeVisible();

            roof2.changeColor("darkBrick");
            roof2.changeSize(120, 330);
            roof2.moveHorizontal(90);
            roof2.moveVertical(-110);
            roof2.makeVisible();

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

            moon.changeColor("white");
            moon.changeSize(60);
            moon.moveHorizontal(-120);
            moon.moveVertical(-60);
            moon.makeVisible();

            moonCover.changeColor("nightSky");
            moonCover.changeSize(60);
            moonCover.moveHorizontal(-150);
            moonCover.moveVertical(-60);
            moonCover.makeVisible();




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

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");

    }
}
