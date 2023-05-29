package OpenClosedPrinciple;

// Создаём наследуем класс автобус
public class Bus extends Vehicle{
    /*
     * Конструктор который принимает
     * @param maxSpeed = максимальную скорость
     * @param type = тип
    * */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, "Bus");
    }

    @Override
    /** Метод получения максимального */
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;   
    }
}
