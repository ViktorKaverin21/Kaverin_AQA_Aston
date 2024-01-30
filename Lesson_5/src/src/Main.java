package src;//Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
//Задать для каждой фигуры цвет заливки и цвет границы.
//Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
//Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Black", "Yellow");
        System.out.println("Circle:\nPerimeter: " + circle.getPerimeter() + "\nArea: " + circle.getArea()
                + "\nFill color: " + circle.getFillColor() + "\nBorder color: " + circle.getBorderColor());

        Rectangle rectangle = new Rectangle(4, 6, "Red", "Orange");
        System.out.println("\nRectangle:\nPerimeter: " + rectangle.getPerimeter() + "\nArea: " + rectangle.getArea()
                + "\nFill color: " + rectangle.getFillColor() + "\nBorder color: " + rectangle.getBorderColor());

        Triangle triangle = new Triangle(3, 4, 5, "Green", "Blue");
        System.out.println("\nTriangle:\nPerimeter: " + triangle.getPerimeter() + "\nArea: " + triangle.getArea()
                + "\nFill color: " + triangle.getFillColor() + "\nBorder color: " + triangle.getBorderColor());
    }
}