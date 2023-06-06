package calculator;
// Фабрика, которая производит декораторы
public class DecLogCalcFactory implements iComplexCalculableFactory {
    // Поле, которое передаёт логизацию
    private iLoggable logger;

    // Конструктор
    public DecLogCalcFactory(iLoggable logger) {
        this.logger = logger;
    }

    // Возвращает продукт декоратор
    public iComplexCalculable create(double real,double imaginary) {
        return new DecLogCalc(new ComplexCalculator(real, imaginary), logger);
    }
}
