public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        shapeFactory.getShape(CHOSEN_SHAPE.CIRCLE).draw();
        shapeFactory.getShape(CHOSEN_SHAPE.RECTANGLE).draw();
        shapeFactory.getShape(CHOSEN_SHAPE.SQUARE).draw();

    }
}
