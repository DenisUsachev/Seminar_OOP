package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private iComplexCalculableFactory calculableFactory;

    public ViewCalculator(iComplexCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            
            // Запрос комплексных эдементов 
            double realPart = promptDouble("Введите действительную часть комплексного числа: ");
            double imaginaryPart = promptDouble("Введите мнимую часть комплексного числа: ");

            // Создаём калькулятор (точнее декоратор LogCalculator)
            iComplexCalculable calculator = calculableFactory.create(realPart, imaginaryPart);

            // Запускаем бесконечный цикл для возможности производить несколько операций.
            // Ввод команды "=" (показать результат) прекращает этот цикл.
            while (true) {

                String cmd = prompt("Введите команду (+, *, /, =): ");
                
                // Если пользователь хочет завершить пример
                if (cmd.equals("=")) {
                    
                    // запрашиваем получившиеся дейсвительную и мнимую части комплексного числа
                    double[] result = calculator.getResult();
                    
                    // и форматируем вывод комплесного числа из его действительной и мнимой частей
                    String output;
                    if (result[0] == 0) {
                        output = String.format("%.2f", result[1]);
                    } else if (result[1] == 0) {
                        output = String.format("%.2fi", result[0]);
                    } else if (result[1] < 0) {
                        output = String.format("%.2f - %.2fi", result[0], Math.abs(result[1]));
                    } else {
                        output = String.format("%.2f + %.2fi", result[0], result[1]);
                    }
                    System.out.println("Результат: "+output);
                    break;
                }
                else {
                    // Если выбрана дальнейшая операция (не "равно"), запрашиваем элементы второго комплексного числа
                    double argReal = promptDouble("Введите действительную часть следующего комплексного числа: ");
                    double argImaginary = promptDouble("Введите мнимую часть следующего комплексного числа: ");

                    if (cmd.equals("+")) {
                        calculator.sum(argReal, argImaginary);
                        continue;
                    }
                    if (cmd.equals("*")) {
                        calculator.multi(argReal, argImaginary);
                        continue;
                    }
                    if (cmd.equals("/")) {
                        calculator.devide(argReal, argImaginary);
                        continue;
                    }
                }
            }

            // Предусматриваем ввод большой и маленькой буквы.
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y") || cmd.equals("y")) {
                continue;
            }

            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}