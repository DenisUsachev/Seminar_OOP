package calculator;

// Связующий класс(Декоратор) который включает себя и Calculable основной класс
// и Logger дополнительный класс
// Класс включает в себя логику интерфейсов старого(iComplexCalculator) и нового класса(iLoggable)
public class DecLogCalc  implements iComplexCalculable{
   
    // Статичный класс
    private iComplexCalculable decorated;
    // Новая логика
    private iLoggable logger;

    // Конструктор
    public DecLogCalc(iComplexCalculable decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iComplexCalculable sum(double realPart,double imaginaryPart){
        double[] firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора: действительная часть "+String.format("%.2f", firstArg[0])+", мнимая часть "+String.format("%.2f", firstArg[1])));
        logger.log(String.format("Начало вызова метода sum со вторым значением калькулятора: действительная часть "+String.format("%.2f", realPart)+", мнимая часть "+String.format("%.2f", imaginaryPart)));
        iComplexCalculable result = decorated.sum(realPart,imaginaryPart);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public iComplexCalculable multi(double realPart,double imaginaryPart){
        double[] firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора: действительная часть "+String.format("%.2f", firstArg[0])+", мнимая часть "+String.format("%.2f", firstArg[1])));
        logger.log(String.format("Начало вызова метода sum со вторым значением калькулятора: действительная часть "+String.format("%.2f", realPart)+", мнимая часть "+String.format("%.2f", imaginaryPart)));
        iComplexCalculable result = decorated.multi(realPart,imaginaryPart);
        logger.log(String.format("Вызова метода sum  произошел"));
        return result;
    }

    @Override
    public iComplexCalculable devide(double realPart, double imaginaryPart) {
        double[] firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора: действительная часть "+String.format("%.2f", firstArg[0])+", мнимая часть "+String.format("%.2f", firstArg[1])));
        logger.log(String.format("Начало вызова метода sum со вторым значением калькулятора: действительная часть "+String.format("%.2f", realPart)+", мнимая часть "+String.format("%.2f", imaginaryPart)));
        iComplexCalculable result = decorated.devide(realPart,imaginaryPart);
        logger.log(String.format("Вызов метода devide произошел"));
        return result;
    }

    @Override
    public double[] getResult() {
        double[] result = decorated.getResult();
        logger.log(String.format("Получение результата: действительная часть "+String.format("%.2f", result[0])+", мнимая часть "+String.format("%.2f", result[1])));
        return result;
    }
}
