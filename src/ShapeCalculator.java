public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return Math.PI*(Math.pow(circle.getR(),2));
    }

    @Override
    public double rectangleAre(Rectangle rect) {
        Line2D a=new Line2D(rect.getP1().getX(),rect.getP1().getY(),rect.getP4().getX(),rect.getP4().getY());
        Line2D b=new Line2D(rect.getP1().getX(),rect.getP1().getY(),rect.getP2().getX(),rect.getP2().getY());
        LineCalc lineCalc=new LineCalc();
        return lineCalc.linelLength(a)*lineCalc.linelLength(b);
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4.0/3.0*Math.PI*Math.pow(ball.getR(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getA(),3);
    }
}
