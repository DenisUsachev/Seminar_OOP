import Classes.HeadPhone;
import Classes.Phone;
import Interfaces.iReChage;

public class Rechage {
    public static void main(String[] args) throws Exception {
        iReChage item = new Phone();
        iReChage item2 = new HeadPhone();


        System.out.println(item.toString());
        System.out.println(item2.toString());

    }
}
