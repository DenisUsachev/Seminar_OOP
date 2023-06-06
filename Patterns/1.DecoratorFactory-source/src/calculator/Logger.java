package calculator;

// Класс Logger
public class Logger implements iLoggable {

    @Override
    // Определяем поведение метода log
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
    
}
