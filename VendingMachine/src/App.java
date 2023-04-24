import java.util.Scanner;

import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;


/**
 * Программа сделана для торгового автамата:
 * Программа принимает товар, его название и стоимость
 * Так-же аппарат изготавливает горячие напитки.
 * 
 * Version: 1.0
 * Date: 21.04.2023  
 */
public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("Chips", 120.0);
        item1.SetPrice(98.0);

        VendingMachine itenMachin = new VendingMachine(300);

        itenMachin.addProduct(item1);
        itenMachin.addProduct(new Product("Seeds", 50.0));
        itenMachin.addProduct(new Product("Chocolate", 95.0));
        itenMachin.addProduct(new Product("Power engineer", 120.0));
        itenMachin.addProduct(new Product("Peanut", 70.0));
        itenMachin.addProduct(new Product("Cookie", 90.0));
        itenMachin.addProduct(new Product("Wet wipes", 50.0));
        
        itenMachin.addProduct(new BottleOfWater("Cola", 88.0, 0.5));
        itenMachin.addProduct(new BottleOfWater("Water", 188.0, 1.5));
        
        itenMachin.addProduct(new HotDrink("Coffee", 200.0, 0.4,80));
        itenMachin.addProduct(new HotDrink("Latte", 170.0, 0.3, 70));
        itenMachin.addProduct(new HotDrink("Tea", 220.0, 0.5, 95));
        itenMachin.addProduct(new HotDrink("Hot chocolate", 190.0, 0.3, 45));
        itenMachin.addProduct(new HotDrink("Hot milk", 180.0, 0.5, 80));

        
        for(Product prod : itenMachin.getProdAll()){ 
            System.out.println(prod.toString());
        }

        Scanner scn = new Scanner(System.in);
        System.out.printf("Введите название товара: ");
        String s = scn.nextLine();

        System.out.printf("Введите сколько внесли: ");
        Double money = scn.nextDouble();
        
        System.out.println(itenMachin.getProdByPrice(itenMachin.getProdByName(s), money));
    }
}