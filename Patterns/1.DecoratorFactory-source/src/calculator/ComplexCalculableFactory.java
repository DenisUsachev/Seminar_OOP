package calculator;

// Фабрика, создания продукта(калькулятор)
public class ComplexCalculableFactory implements iComplexCalculableFactory {
    public iComplexCalculable create(double real,double imaginary) {
        return new ComplexCalculator(real, imaginary);
    }
}
