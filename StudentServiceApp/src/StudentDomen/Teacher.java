package StudentDomen;

/** Наследуемый класс в котором описано дополнительные характеристики для преподавателя учебного учереждения */
public class Teacher extends User {
    /** id преподавателя */
    private int teacherId; 
    
    /** Учёная степень */
    private String academicDegree;

    /** Конструктор */
    public Teacher(String firstName, String secondName, int age, int teacherId) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = "";
    }

    /** @return = Получаем teacherId*/
    public int getTeacherId() {
        return teacherId;
    }

    /** @return = Устанавливаем teacherId*/
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    /** @return = Получаем ученую степень учителя*/
    public String getAcademicDegree() {
        return academicDegree;
    }

    /** @return = Устанавливаем ученую степень учителя*/
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    /**Переопределяем метод toString */
    public String toString() {
        return "Teacher{"+
            "firstName=" +super.getFirstName()+", "+
            "secondName="+super.getSecondName()+", "+
            "age=" +super.getAge()+", "+
            "teacherId="+teacherId+
        "}";
    }
}
