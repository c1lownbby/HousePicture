public class Picture
{
    private Square wall, wall2, wall3, wall4, wall5;
    private Square ground,  concrete, concrete2, concrete3, ground2, window, window2, window3, window4, innerWindow, innerWindow2,innerWindow3, innerWindow4, innerWindow5, innerWindow6, innerWindow7, innerWindow8, innerWindow9, innerWindow10, innerWindow11, innerWindow12, innerWindow13, roofExtend, roofExtend2, roofExtend3, garage, garage2, garage3, garage4, garage5, garage6, garageLine, fence, fence2, fence3, fence4, fence5, fence6,fence7, fence8, fence9, fence10, fence11, fence12, fence13, fence14, fence15, fence16, fence17, fence18, fence19, fence20, fence21, fence22, fence23, fence24, fence25, fence26, fence27, fence28, fence29, fence30, fence31, fence32, fence33, fence34, fence35, door, door2, sky;
    private Triangle concrete4, roof, roof2, roof3, roofWhite, roofWhite2 ;
    private Circle bush, bush2, bush3, bush4, bush5, bush6, bush7, bush8, bush9, bush10, bush11, bush12, bush13, bush14, bush15, bush16, bush17, bush18, bush19, moon, moonCover, star, star1, star2, star3, star4, star5, star6, star7, star8, star9, star10, star11, star12, star13;

    private Person cristina;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        cristina = new Person();
        wall = new Square();
        wall2 = new Square();
        wall3 = new Square();
        wall4 = new Square();
        wall5 = new Square();
        window = new Square();
        window2 = new Square();
        window3 = new Square();
        window4 = new Square();
        innerWindow = new Square();
        innerWindow2 = new Square();
        innerWindow3 = new Square();
        innerWindow4 = new Square();
        innerWindow5 = new Square();
        innerWindow6 = new Square();
        innerWindow7 = new Square();
        innerWindow8 = new Square();
        innerWindow9 = new Square();
        innerWindow10 = new Square();
        innerWindow11 = new Square();
        innerWindow12 = new Square();
        innerWindow13 = new Square();
        roofExtend = new Square();
        roofExtend2 = new Square();
        roofExtend3 = new Square();
        garage = new Square();
        garage2 = new Square();
        garage3 = new Square();
        garage4 = new Square();
        garage5 = new Square();
        garage6 = new Square();
        garageLine = new Square();
        fence = new Square();
        fence2 = new Square();
        fence3 = new Square();
        fence4 = new Square();
        fence5 = new Square();
        fence6 = new Square();
        fence7 = new Square();
        fence8 = new Square();
        fence9 = new Square();
        fence10 = new Square();
        fence11 = new Square();
        fence12 = new Square();
        fence13 = new Square();
        fence14 = new Square();
        fence15 = new Square();
        fence16 = new Square();
        fence17 = new Square();
        fence18 = new Square();
        fence19 = new Square();
        fence20 = new Square();
        fence21 = new Square();
        fence22 = new Square();
        fence23 = new Square();
        fence24 = new Square();
        fence25 = new Square();
        fence26 = new Square();
        fence27 = new Square();
        fence28 = new Square();
        fence29 = new Square();
        fence30 = new Square();
        fence31 = new Square();
        fence32 = new Square();
        fence33 = new Square();
        fence34 = new Square();
        fence35 = new Square();
        door = new Square();
        door2 = new Square();
        sky = new Square();
        ground = new Square();
        ground2 = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        roof3 = new Triangle();
        roofWhite2 = new Triangle();
        roofWhite = new Triangle();
        concrete = new Square();
        concrete2 = new Square();
        concrete3 = new Square();
        concrete4 = new Triangle();
        moon = new Circle();
        moonCover = new Circle();
        star = new Circle();
        star1 = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        star8 = new Circle();
        star9 = new Circle();
        star10 = new Circle();
        star11 = new Circle();
        star12 = new Circle();
        star13 = new Circle();
        bush = new Circle();
        bush2 = new Circle();
        bush3 = new Circle();
        bush4 = new Circle();
        bush5 = new Circle();
        bush6 = new Circle();
        bush7 = new Circle();
        bush8 = new Circle();
        bush9 = new Circle();
        bush10 = new Circle();
        bush11 = new Circle();
        bush12 = new Circle();
        bush13 = new Circle();
        bush14 = new Circle();
        bush15 = new Circle();
        bush16 = new Circle();
        bush17 = new Circle();
        bush18 = new Circle();
        bush19 = new Circle();
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

            ground.changeColor("redRocks");
            ground.changeSize(1000);
            ground.moveHorizontal(-350);
            ground.moveVertical(160);
            ground.makeVisible();


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

            garage.changeColor("white");
            garage.moveHorizontal(160);
            garage.moveVertical(80);
            garage.changeSize(100);
            garage.makeVisible();

            garageLine.changeColor("grey");
            garageLine.moveHorizontal(170);
            garageLine.moveVertical(90);
            garageLine.changeSize(80);
            garageLine.makeVisible();

            garage2.changeColor("white");
            garage2.moveHorizontal(160);
            garage2.moveVertical(85);
            garage2.changeSize(40);
            garage2.makeVisible();

            garage3.changeColor("white");
            garage3.moveHorizontal(220);
            garage3.moveVertical(85);
            garage3.changeSize(40);
            garage3.makeVisible();

            garage4.changeColor("white");
            garage4.moveHorizontal(200);
            garage4.moveVertical(85);
            garage4.changeSize(40);
            garage4.makeVisible();

            garage5.changeColor("white");
            garage5.moveHorizontal(200);
            garage5.moveVertical(128);
            garage5.changeSize(52);
            garage5.makeVisible();

            garage6.changeColor("white");
            garage6.moveHorizontal(160);
            garage6.moveVertical(128);
            garage6.changeSize(52);
            garage6.makeVisible();


            roof3.changeColor("brick");
            roof3.changeSize(70, 280);
            roof3.moveHorizontal(320);
            roof3.moveVertical(-40);
            roof3.makeVisible();

            fence2.changeColor("white");
            fence2.moveHorizontal(-20);
            fence2.moveVertical(20);
            fence2.changeSize(160);
            fence2.makeVisible();

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

            door.changeColor("brown");
            door.moveHorizontal(-3);
            door.moveVertical(100);
            door.changeSize(40);
            door.makeVisible();

            door2.changeColor("brown");
            door2.moveHorizontal(-3);
            door2.moveVertical(60);
            door2.changeSize(40);
            door2.makeVisible();

            window3.changeColor("white");
            window3.moveHorizontal(65);
            window3.moveVertical(50);
            window3.changeSize(50);
            window3.makeVisible();

            window4.changeColor("white");
            window4.moveHorizontal(73);
            window4.moveVertical(50);
            window4.changeSize(50);
            window4.makeVisible();

            innerWindow3.changeColor("teal");
            innerWindow3.moveHorizontal(82);
            innerWindow3.moveVertical(54);
            innerWindow3.changeSize(25);
            innerWindow3.makeVisible();

            innerWindow4.changeColor("teal");
            innerWindow4.moveHorizontal(82);
            innerWindow4.moveVertical(60);
            innerWindow4.changeSize(25);
            innerWindow4.makeVisible();

            innerWindow5.changeColor("teal");
            innerWindow5.moveHorizontal(82);
            innerWindow5.moveVertical(70);
            innerWindow5.changeSize(25);
            innerWindow5.makeVisible();

            innerWindow6.changeColor("teal");
            innerWindow6.moveHorizontal(67);
            innerWindow6.moveVertical(70);
            innerWindow6.changeSize(13);
            innerWindow6.makeVisible();

            innerWindow7.changeColor("teal");
            innerWindow7.moveHorizontal(67);
            innerWindow7.moveVertical(54);
            innerWindow7.changeSize(13);
            innerWindow7.makeVisible();

            innerWindow8.changeColor("teal");
            innerWindow8.moveHorizontal(67);
            innerWindow8.moveVertical(60);
            innerWindow8.changeSize(13);
            innerWindow8.makeVisible();

            innerWindow9.changeColor("teal");
            innerWindow9.moveHorizontal(67);
            innerWindow9.moveVertical(83);
            innerWindow9.changeSize(13);
            innerWindow9.makeVisible();

            innerWindow10.changeColor("teal");
            innerWindow10.moveHorizontal(109);
            innerWindow10.moveVertical(70);
            innerWindow10.changeSize(13);
            innerWindow10.makeVisible();

            innerWindow11.changeColor("teal");
            innerWindow11.moveHorizontal(109);
            innerWindow11.moveVertical(54);
            innerWindow11.changeSize(13);
            innerWindow11.makeVisible();

            innerWindow12.changeColor("teal");
            innerWindow12.moveHorizontal(109);
            innerWindow12.moveVertical(60);
            innerWindow12.changeSize(13);
            innerWindow12.makeVisible();

            innerWindow13.changeColor("teal");
            innerWindow13.moveHorizontal(109);
            innerWindow13.moveVertical(83);
            innerWindow13.changeSize(13);
            innerWindow13.makeVisible();

            fence.changeColor("white");
            fence.moveHorizontal(-170);
            fence.moveVertical(20);
            fence.changeSize(160);
            fence.makeVisible();

            fence3.changeColor("white");
            fence3.moveHorizontal(90);
            fence3.moveVertical(140);
            fence3.changeSize(40);
            fence3.makeVisible();

            fence4.changeColor("white");
            fence4.moveHorizontal(60);
            fence4.moveVertical(140);
            fence4.changeSize(40);
            fence4.makeVisible();

            fence5.changeColor("white");
            fence5.moveHorizontal(0);
            fence5.moveVertical(120);
            fence5.changeSize(60);
            fence5.makeVisible();

            fence6.changeColor("white");
            fence6.moveHorizontal(-20);
            fence6.moveVertical(120);
            fence6.changeSize(60);
            fence6.makeVisible();

            fence7.changeColor("creamDark");
            fence7.moveHorizontal(-10);
            fence7.moveVertical(130);
            fence7.changeSize(15);
            fence7.makeVisible();

            fence8.changeColor("creamDark");
            fence8.moveHorizontal(-10);
            fence8.moveVertical(140);
            fence8.changeSize(15);
            fence8.makeVisible();

            fence9.changeColor("creamDark");
            fence9.moveHorizontal(-10);
            fence9.moveVertical(150);
            fence9.changeSize(15);
            fence9.makeVisible();

            fence10.changeColor("creamDarker");
            fence10.moveHorizontal(-10);
            fence10.moveVertical(160);
            fence10.changeSize(15);
            fence10.makeVisible();

            fence11.changeColor("creamDark");
            fence11.moveHorizontal(13);
            fence11.moveVertical(130);
            fence11.changeSize(15);
            fence11.makeVisible();

            fence12.changeColor("creamDark");
            fence12.moveHorizontal(13);
            fence12.moveVertical(140);
            fence12.changeSize(15);
            fence12.makeVisible();

            fence13.changeColor("creamDark");
            fence13.moveHorizontal(13);
            fence13.moveVertical(150);
            fence13.changeSize(15);
            fence13.makeVisible();

            fence14.changeColor("creamDarker");
            fence14.moveHorizontal(13);
            fence14.moveVertical(160);
            fence14.changeSize(15);
            fence14.makeVisible();

            fence15.changeColor("creamDark");
            fence15.moveHorizontal(35);
            fence15.moveVertical(130);
            fence15.changeSize(15);
            fence15.makeVisible();

            fence16.changeColor("creamDark");
            fence16.moveHorizontal(35);
            fence16.moveVertical(140);
            fence16.changeSize(15);
            fence16.makeVisible();

            fence17.changeColor("creamDark");
            fence17.moveHorizontal(35);
            fence17.moveVertical(150);
            fence17.changeSize(15);
            fence17.makeVisible();

            fence18.changeColor("creamDarker");
            fence18.moveHorizontal(35);
            fence18.moveVertical(160);
            fence18.changeSize(15);
            fence18.makeVisible();

            fence28.changeColor("white");
            fence28.moveHorizontal(45);
            fence28.moveVertical(110);
            fence28.changeSize(15);
            fence28.makeVisible();

            fence29.changeColor("white");
            fence29.moveHorizontal(45);
            fence29.moveVertical(95);
            fence29.changeSize(15);
            fence29.makeVisible();

            fence30.changeColor("white");
            fence30.moveHorizontal(45);
            fence30.moveVertical(85);
            fence30.changeSize(15);
            fence30.makeVisible();

            fence31.changeColor("white");
            fence31.moveHorizontal(45);
            fence31.moveVertical(75);
            fence31.changeSize(15);
            fence31.makeVisible();

            fence32.changeColor("white");
            fence32.moveHorizontal(45);
            fence32.moveVertical(65);
            fence32.changeSize(15);
            fence32.makeVisible();

            fence33.changeColor("white");
            fence33.moveHorizontal(45);
            fence33.moveVertical(55);
            fence33.changeSize(15);
            fence33.makeVisible();

            fence34.changeColor("white");
            fence34.moveHorizontal(45);
            fence34.moveVertical(45);
            fence34.changeSize(15);
            fence34.makeVisible();

            fence35.changeColor("white");
            fence35.moveHorizontal(45);
            fence35.moveVertical(35);
            fence35.changeSize(15);
            fence35.makeVisible();

            fence19.changeColor("creamDark");
            fence19.moveHorizontal(65);
            fence19.moveVertical(146);
            fence19.changeSize(15);
            fence19.makeVisible();

            fence20.changeColor("creamDark");
            fence20.moveHorizontal(65);
            fence20.moveVertical(150);
            fence20.changeSize(15);
            fence20.makeVisible();

            fence21.changeColor("creamDarker");
            fence21.moveHorizontal(65);
            fence21.moveVertical(160);
            fence21.changeSize(15);
            fence21.makeVisible();

            fence22.changeColor("creamDark");
            fence22.moveHorizontal(85);
            fence22.moveVertical(146);
            fence22.changeSize(15);
            fence22.makeVisible();

            fence23.changeColor("creamDark");
            fence23.moveHorizontal(85);
            fence23.moveVertical(150);
            fence23.changeSize(15);
            fence23.makeVisible();

            fence24.changeColor("creamDarker");
            fence24.moveHorizontal(85);
            fence24.moveVertical(160);
            fence24.changeSize(15);
            fence24.makeVisible();

            fence25.changeColor("creamDark");
            fence25.moveHorizontal(106);
            fence25.moveVertical(146);
            fence25.changeSize(15);
            fence25.makeVisible();

            fence26.changeColor("creamDark");
            fence26.moveHorizontal(106);
            fence26.moveVertical(150);
            fence26.changeSize(15);
            fence26.makeVisible();

            fence27.changeColor("creamDarker");
            fence27.moveHorizontal(106);
            fence27.moveVertical(160);
            fence27.changeSize(15);
            fence27.makeVisible();


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
            moon.moveHorizontal(-150);
            moon.moveVertical(-50);
            moon.makeVisible();

            moonCover.changeColor("nightSky");
            moonCover.changeSize(60);
            moonCover.moveHorizontal(-180);
            moonCover.moveVertical(-50);
            moonCover.makeVisible();

            star.changeColor("white");
            star.changeSize(5);
            star.moveHorizontal(-150);
            star.moveVertical(-60);
            star.makeVisible();

            star1.changeColor("white");
            star1.changeSize(5);
            star1.moveHorizontal(-180);
            star1.moveVertical(-30);
            star1.makeVisible();

            star2.changeColor("white");
            star2.changeSize(5);
            star2.moveHorizontal(200);
            star2.moveVertical(-40);
            star2.makeVisible();

            star3.changeColor("white");
            star3.changeSize(5);
            star3.moveHorizontal(150);
            star3.moveVertical(-10);
            star3.makeVisible();

            star4.changeColor("white");
            star4.changeSize(5);
            star4.moveHorizontal(80);
            star4.moveVertical(-70);
            star4.makeVisible();

            star5.changeColor("white");
            star5.changeSize(5);
            star5.moveHorizontal(20);
            star5.moveVertical(-40);
            star5.makeVisible();

            star6.changeColor("white");
            star6.changeSize(5);
            star6.moveHorizontal(-5);
            star6.moveVertical(-90);
            star6.makeVisible();

            star7.changeColor("white");
            star7.changeSize(5);
            star7.moveHorizontal(260);
            star7.moveVertical(-90);
            star7.makeVisible();

            star8.changeColor("white");
            star8.changeSize(5);
            star8.moveHorizontal(285);
            star8.moveVertical(-40);
            star8.makeVisible();

            star9.changeColor("white");
            star9.changeSize(5);
            star9.moveHorizontal(300);
            star9.moveVertical(-60);
            star9.makeVisible();

            star10.changeColor("white");
            star10.changeSize(5);
            star10.moveHorizontal(361);
            star10.moveVertical(-30);
            star10.makeVisible();

            star11.changeColor("white");
            star11.changeSize(5);
            star11.moveHorizontal(490);
            star11.moveVertical(-30);
            star11.makeVisible();

            star12.changeColor("white");
            star12.changeSize(5);
            star12.moveHorizontal(420);
            star12.moveVertical(-69);
            star12.makeVisible();

            star13.changeColor("white");
            star13.changeSize(5);
            star13.moveHorizontal(450);
            star13.moveVertical(-40);
            star13.makeVisible();

            bush.changeColor("bush");
            bush.changeSize(70);
            bush.moveHorizontal(-120);
            bush.moveVertical(160);
            bush.makeVisible();

            bush2.changeColor("bush");
            bush2.changeSize(55);
            bush2.moveHorizontal(-165);
            bush2.moveVertical(170);
            bush2.makeVisible();

            bush3.changeColor("bush");
            bush3.changeSize(60);
            bush3.moveHorizontal(-10);
            bush3.moveVertical(175);
            bush3.makeVisible();

            bush4.changeColor("bush");
            bush4.changeSize(65);
            bush4.moveHorizontal(-50);
            bush4.moveVertical(175);
            bush4.makeVisible();

            bush5.changeColor("bush");
            bush5.changeSize(73);
            bush5.moveHorizontal(-70);
            bush5.moveVertical(175);
            bush5.makeVisible();

            bush6.changeColor("bush");
            bush6.changeSize(64);
            bush6.moveHorizontal(10);
            bush6.moveVertical(175);
            bush6.makeVisible();

            bush7.changeColor("bush");
            bush7.changeSize(70);
            bush7.moveHorizontal(25);
            bush7.moveVertical(190);
            bush7.makeVisible();

            bush8.changeColor("bush");
            bush8.changeSize(55);
            bush8.moveHorizontal(70);
            bush8.moveVertical(190);
            bush8.makeVisible();

            bush9.changeColor("bush");
            bush9.changeSize(65);
            bush9.moveHorizontal(90);
            bush9.moveVertical(180);
            bush9.makeVisible();

            bush10.changeColor("bush");
            bush10.changeSize(45);
            bush10.moveHorizontal(120);
            bush10.moveVertical(190);
            bush10.makeVisible();

            bush11.changeColor("bush");
            bush11.changeSize(55);
            bush11.moveHorizontal(156);
            bush11.moveVertical(190);
            bush11.makeVisible();

            bush12.changeColor("bush");
            bush12.changeSize(50);
            bush12.moveHorizontal(180);
            bush12.moveVertical(180);
            bush12.makeVisible();

            bush13.changeColor("bush");
            bush13.changeSize(55);
            bush13.moveHorizontal(-165);
            bush13.moveVertical(150);
            bush13.makeVisible();

            bush14.changeColor("bush");
            bush14.changeSize(55);
            bush14.moveHorizontal(-165);
            bush14.moveVertical(130);
            bush14.makeVisible();

            bush15.changeColor("bush");
            bush15.changeSize(55);
            bush15.moveHorizontal(-165);
            bush15.moveVertical(110);
            bush15.makeVisible();

            bush16.changeColor("bush");
            bush16.changeSize(55);
            bush16.moveHorizontal(370);
            bush16.moveVertical(130);
            bush16.makeVisible();

            bush17.changeColor("bush");
            bush17.changeSize(55);
            bush17.moveHorizontal(370);
            bush17.moveVertical(110);
            bush17.makeVisible();

            bush18.changeColor("bush");
            bush18.changeSize(55);
            bush18.moveHorizontal(370);
            bush18.moveVertical(150);
            bush18.makeVisible();

            bush19.changeColor("bush");
            bush19.changeSize(55);
            bush19.moveHorizontal(370);
            bush19.moveVertical(170);
            bush19.makeVisible();

            ground2.changeColor("redRocks");
            ground2.changeSize(1000);
            ground2.moveHorizontal(-300);
            ground2.moveVertical(181);
            ground2.makeVisible();

            concrete.changeColor("concrete");
            concrete.changeSize(100);
            concrete.moveHorizontal(160);
            concrete.moveVertical(180);
            concrete.makeVisible();

            concrete2.changeColor("concrete");
            concrete2.changeSize(100);
            concrete2.moveHorizontal(160);
            concrete2.moveVertical(250);
            concrete2.makeVisible();

            concrete3.changeColor("concrete");
            concrete3.changeSize(100);
            concrete3.moveHorizontal(160);
            concrete3.moveVertical(290);
            concrete3.makeVisible();

            concrete4.changeColor("concrete");
            concrete4.changeSize(100, 260);
            concrete4.moveHorizontal(310);
            concrete4.moveVertical(280);
            concrete4.makeVisible();

            cristina.changeColor("pink");
            cristina.changeSize(70, 35);
            cristina.moveHorizontal(200);
            cristina.moveVertical(80);
            cristina.makeVisible();










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
