package AbstractFactoryPatterns;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        
        //get an object of Rounded Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        
        //call draw method of Rounded Rectangle
        shape1.draw();
        
        //get an object of Rounded Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        
        //call draw method of Rounded Square
        shape2.draw();
        
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
        
        //get an object of Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        
        //call draw method of Rectangle
        shape3.draw();
        
        //get an object of Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        
        //call draw method of Square
        shape4.draw();
    }
    
}
