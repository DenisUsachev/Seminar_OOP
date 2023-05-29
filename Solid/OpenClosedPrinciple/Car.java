package OpenClosedPrinciple;

// Создаём наследуем класс Машина
public class Car extends Vehicle{
    /*
     * Конструктор который принимает
     * @param maxSpeed = максимальную скорость
     * @param type = тип
     */
    public Car(int maxSpeed, String type) {
        super(maxSpeed, "Car");
    }

    @Override
    /** Метод получения максимального */
    public double calculateAllowedSpeed(){
        return super.getMaxSpeed() * 0.8;
    }
}
