public class ShapeFactory {

    private static ShapeFactory instance = null;

    private ShapeFactory(){

    }

    public static ShapeFactory getInstance(){
        if(instance == null)
            return new ShapeFactory();
        else
            return instance;
    }

    public static Shape getShape(CHOSEN_SHAPE cs){

        Shape s;

        switch (cs){
            case CIRCLE -> s = new Circle();
            case SQUARE -> s = new Square();
            case RECTANGLE -> s = new Rectangle();
            default -> throw new IllegalStateException("Unexpected value: " + cs);
        }

        return s;
    }
}
