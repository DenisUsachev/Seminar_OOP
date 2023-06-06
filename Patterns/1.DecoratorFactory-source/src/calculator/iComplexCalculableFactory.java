package calculator;
// Fabric-method подключен фабричный метод
public interface iComplexCalculableFactory {

    // Метод который будет создавть
    iComplexCalculable create(double real,double imaginary);
}
