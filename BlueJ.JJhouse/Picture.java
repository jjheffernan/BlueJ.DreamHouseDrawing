
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall1;
    private Square door;
    private Square window;
    private Triangle roof;
    private Triangle roof1;
    private Circle sun;
    private Triangle tree1;
    private Square trunk1;
    private Triangle tree;
    private Circle pool;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        window = new Square();
        window.changeSize(1000);
        window.changeColor("black");
        window.moveHorizontal(-300);
        window.moveVertical(-200);
        window.makeVisible();
        
        
        // sun and stars
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(480+20);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(20);
        sun.moveVertical(-50);
        sun.changeSize(6);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(40);
        sun.moveVertical(-45);
        sun.changeSize(6);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(50);
        sun.moveVertical(-10);
        sun.changeSize(6);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(200);
        sun.moveVertical(-50);
        sun.changeSize(6);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(250);
        sun.moveVertical(0);
        sun.changeSize(6);
        sun.makeVisible();
        //--------
        // hills in the back
        pool = new Circle();
        pool.changeSize(1000);
        pool.slowMoveHorizontal(-400);
        pool.moveVertical(60);
        pool.changeColor("blue");
        pool.makeVisible();
        
        pool = new Circle();
        pool.changeSize(1000);
        pool.slowMoveHorizontal(70);
        pool.moveVertical(60);
        pool.changeColor("green");
        pool.makeVisible();
        //-------------
        
        // house
        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(300);
        wall.moveVertical(0);
        wall.changeSize(180);
        wall.makeVisible();
        
        wall1 = new Square();
        wall1.changeColor("red");
        wall1.moveHorizontal(300-80);
        wall1.moveVertical(80);
        wall1.changeSize(100);
        wall1.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(20+320);
        window.moveVertical(100);
        window.makeVisible();
        
        sun = new Circle();
        sun.changeColor("black");
        sun.changeSize(10);
        sun.moveHorizontal(320);
        sun.moveVertical(100);
        sun.makeVisible();
    
        
        //front door 
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20+360);
        window.moveVertical(110);
        window.makeVisible(); 
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20+360);
        window.moveVertical(130);
        window.makeVisible();
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20+360);
        window.moveVertical(150);
        window.makeVisible();
        
        //windows
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20+400);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20+400);
        window.moveVertical(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20+320);
        window.moveVertical(40);
        window.makeVisible();
        
        //garage door
        door = new Square();
        door.changeColor("black");
        door.changeSize(80);
        door.moveHorizontal(230);
        door.moveVertical(100);
        door.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60+220);
        roof.moveVertical(65);
        roof.changeColor("magenta");
        roof.makeVisible();
        
        roof1 = new Triangle();
        roof1.changeSize(40, 240);
        roof1.moveHorizontal(400);
        roof1.moveVertical(0);
        roof1.changeColor("magenta");
        roof1.makeVisible();
        
        trunk1 = new Square();
        trunk1.changeColor("black");
        trunk1.moveHorizontal(138);
        trunk1.moveVertical(140);
        trunk1.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeSize(140, 50);
        tree1.moveHorizontal(160);
        tree1.moveVertical(50);
        tree1.changeColor("green");
        tree1.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(80, 50);
        tree.slowMoveHorizontal(0);
        tree.moveVertical(30);
        tree.changeColor("green");
        tree.makeVisible();
        
        trunk1 = new Square();
        trunk1.changeColor("black");
        trunk1.moveHorizontal(138-40);
        trunk1.moveVertical(140);
        trunk1.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeSize(140, 50);
        tree1.moveHorizontal(160-40);
        tree1.moveVertical(50);
        tree1.changeColor("green");
        tree1.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(80, 50);
        tree.slowMoveHorizontal(40);
        tree.moveVertical(30);
        tree.changeColor("green");
        tree.makeVisible();
        
        trunk1 = new Square();
        trunk1.changeColor("black");
        trunk1.moveHorizontal(138-80);
        trunk1.moveVertical(140);
        trunk1.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeSize(140, 50);
        tree1.moveHorizontal(160-80);
        tree1.moveVertical(50);
        tree1.changeColor("green");
        tree1.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(80, 50);
        tree.slowMoveHorizontal(80);
        tree.moveVertical(30);
        tree.changeColor("green");
        tree.makeVisible();
        
        trunk1 = new Square();
        trunk1.changeColor("black");
        trunk1.moveHorizontal(138-120);
        trunk1.moveVertical(140);
        trunk1.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeSize(140, 50);
        tree1.moveHorizontal(160-120);
        tree1.moveVertical(50);
        tree1.changeColor("green");
        tree1.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(80, 50);
        tree.slowMoveHorizontal(120);
        tree.moveVertical(30);
        tree.changeColor("green");
        tree.makeVisible();
        
        trunk1 = new Square();
        trunk1.changeColor("black");
        trunk1.moveHorizontal(138-160);
        trunk1.moveVertical(140);
        trunk1.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeSize(140, 50);
        tree1.moveHorizontal(160-160);
        tree1.moveVertical(50);
        tree1.changeColor("green");
        tree1.makeVisible();
        
        tree = new Triangle();
        tree.changeSize(80, 50);
        tree.slowMoveHorizontal(160);
        tree.moveVertical(30);
        tree.changeColor("green");
        tree.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("blue");
            sun.changeColor("yellow");
        }
    }

}
