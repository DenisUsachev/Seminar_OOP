package OpenClosedPrinciple;

// Создаём Абстрактный транспортное средство
public abstract class Vehicle {
    // Создаём поле максимальной скорости транспортного средства
    int maxSpeed;
    // Содаём поле тип транспортного средства
    String type;
    
    /**
     * Создаём конструктор в который передаём:
     * @param maxSpeed = максимальная скорость
     * @param type = тип
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    /** @return = получаем максимальную скорость */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    /** @return = получаем тип т.р. */
    public String getType() {
        return this.type;
    }

    /**
     * По средствам передачи метода в класс:
     * @return = расчитывающий максимальную скорость т.с. 
     */
    public abstract double calculateAllowedSpeed();
}
