public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        //Example of Object type casting
        //declaration of obhect variable obj of the Shape class

        Shape sObj = new Shape();
        sObj.displayshapeName();
        System.out.println(sObj instanceof Shape);//true

        //object creation of the Circle class
        System.out.println("+++++++++");

        //it's fine because a Circle is a Shape by inheritance
        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayshapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj); //Run circle's toString()
        //Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle); //true
        System.out.println(sObj instanceof Circle);//false because Shape is not a Circle

        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayshapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectandle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);

        System.out.println(shapeRectangleObj instanceof Rectangle);
        System.out.println(sObj instanceof Rectangle);

        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayshapeName();
        shapeTriangleObj.setHeight(2);
        shapeRectangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj); //Run Triangle's toString()

        //Use instanceof operator for Validation
        System.out.println(shapeTriangleObj instanceof Triangle); //true
        System.out.println(sObj instanceof Triangle); //false because Shape is not Triangle

        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3);
        cylinderShape.displayshapeName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
        System.out.println(cylinderShape);

    }
}
