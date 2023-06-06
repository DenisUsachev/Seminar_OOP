package calculator;
// Класс интерфейс в котором описана логика для класса ComplexCalculable

public interface iComplexCalculable {
    // Получение суммы
    iComplexCalculable sum(double real,double imaginary);
    
    // Получение при умножении
    iComplexCalculable multi(double real,double imaginary);
    
    // Получение при делении
    iComplexCalculable devide(double real,double imaginary);
    
    // Получения результата
    double[] getResult();
}
