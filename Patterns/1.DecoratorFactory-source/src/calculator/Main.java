package calculator;

public class Main {
    public static void main(String[] args) {
        // Обычное поведение без декоратора
        iComplexCalculableFactory calculableFactory = new ComplexCalculableFactory();
        
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
