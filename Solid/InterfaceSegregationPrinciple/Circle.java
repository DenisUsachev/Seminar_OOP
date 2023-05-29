package InterfaceSegregationPrinciple;

// Создаём класс круг в который передаём методы из интерфейса Area
// Круг не объемная фигура и этому классу не нужен метод volume().
public class Circle implements iArea {
    // Создаём приватное поле 
    private double radius;
    
     /**
     * Создаём конструктор
     * @param radius = радиус фигуры
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    // Подставляем формулы в метод интерфейса iArea
    public double area() {
        return 2 * 3.14 * radius;
    }
}