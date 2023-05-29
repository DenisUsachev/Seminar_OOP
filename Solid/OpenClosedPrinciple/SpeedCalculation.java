package OpenClosedPrinciple;

// Создаём класс расчитывающий скорость т.с.
public class SpeedCalculation {
    /**
     * Возвращает принятые из классов bus или car расчёты
     * @param vehicle
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}