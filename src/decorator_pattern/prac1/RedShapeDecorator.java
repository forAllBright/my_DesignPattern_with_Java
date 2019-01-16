package decorator_pattern.prac1;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoraredShape){
        super(decoraredShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape){
        System.out.println("BorderColor: Red");
    }
}
