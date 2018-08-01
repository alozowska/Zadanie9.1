import javax.sound.sampled.Line;

public class Test {
    public static void main(String[] args) {
        Line2D line1=new Line2D(0,0,0,3);
        LineCalc lineCalc=new LineCalc();
        System.out.println("długość lini: "+lineCalc.linelLength(line1));
        Circle circle1=new Circle(5);
        ShapeCalculator shapeCalculator=new ShapeCalculator();
        System.out.println("pole koła: "+shapeCalculator.circleArea(circle1));
        Point point1=new Point(0,5);
        Point point2=new Point(6,5);
        Point point3=new Point(6,0);
        Point point4=new Point(0,0);
        Rectangle rectangle1=new Rectangle(point1,point2,point3,point4);
        System.out.println("pole prostokąta: "+shapeCalculator.rectangleAre(rectangle1));
        Ball ball1=new Ball(6);
        System.out.println("objętość kuli: "+shapeCalculator.ballVolume(ball1));
        Point pointCube1=new Point(0,0);
        Point pointCube2=new Point(0,5);
        Cube cube1=new Cube(pointCube1,pointCube2);
        System.out.println("objętość sześcianu: "+shapeCalculator.cubeVolume(cube1));
    }

}
