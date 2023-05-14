package Classes;

import Interfaces.iReChage;

public class Phone implements iReChage{

    @Override
    public String start() {
        return "Пошла зарядка";
    }

    @Override
    public String toString() {
        return "Charge: " +
        "Phone = " + start();
    }
    
}
