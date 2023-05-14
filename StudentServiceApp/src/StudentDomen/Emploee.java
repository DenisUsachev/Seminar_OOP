package StudentDomen;

/** Наследуемый класс в котором описано дополнительные характеристики для работника учебного учереждения */
public class Emploee extends User{
     /** id  работника */
     private int empId;

     /** Конструктор */
     public Emploee(String name, String firstName, Integer age, int empId) {
         super(name, firstName, age);
         this.empId = empId;
     }
 
     /** @return Получить id работника */
     public int getEmpId() {
         return empId;
     }
 
     /** @param empId Установить id работника */
     public void setEmpId(int empId) {
         this.empId = empId;
     } 
}
