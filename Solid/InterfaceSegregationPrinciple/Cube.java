package InterfaceSegregationPrinciple;

// Создаём класс куб в который передаём методы из интерфейса iShape
public class Cube implements iArea, iVolume {
    // Создаём приватное поле край
    private int edge;
    
    /**
     * Создаём конструктор
     * @param edge = край фигуры(грань)
     */
    public Cube(int edge) {
        this.edge = edge;
    }
    
    @Override
    // Подставляем формулы в метод интерфейса iArea
    public double area() {
        return 6 * edge * edge;
    }
    
    @Override
    // Подставляем формулы в метод интерфейса iVolume
    public double volume() {
        return edge * edge * edge;
    }
}