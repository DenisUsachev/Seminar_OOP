package calculator;

// Статичный класс Комплексного калькулятора 
// Поключаем интерфейс пепределяем поведение методов
public final class ComplexCalculator implements iComplexCalculable {

    private double real;

    private double imaginary;

    /**
     * Конструктор
     * @param real = действительная часть комплексного числа
     * @param imaginary = мнимая часть комплесного числа
     */
    public ComplexCalculator(double real,double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Определяем метод сложения
    @Override
    public iComplexCalculable sum(double realPart, double imaginaryPart) {
        this.real += realPart;
        this.imaginary += imaginaryPart;
        return this;
    }

    // Определяем метод умножения
    @Override
    public iComplexCalculable multi(double realPart, double imaginaryPart) {
        this.real = this.real * realPart - this.imaginary * imaginaryPart;
        this.imaginary = this.real * imaginaryPart + this.imaginary * realPart;
        return this;
    }

    // Определяем метод деления
    @Override
    public iComplexCalculable devide(double realPart, double imaginaryPart) {
        double denominator = realPart * realPart + imaginaryPart * imaginaryPart;
        this.real = (this.real * realPart + this.imaginary * imaginaryPart) / denominator;
        this.imaginary = (this.imaginary * realPart - this.real * imaginaryPart) / denominator;
        return this;
    }
    
    // Возвращаем результат в виде массива из двух элементов: получившейся действительной и мнимой части комплексного числа
    @Override
    public double[] getResult() {
        return new double[] {
            this.real, 
            this.imaginary
        };
    }
}
