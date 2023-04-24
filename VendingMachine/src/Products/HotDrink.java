package Products;
/** Наследуем файл Product */

public class HotDrink extends Product{
    private Double volume;
    private int temperatyre;
    
    /**
     * Наследование
     * @param name  = наследуем имя из Product
     * @param price = наследуем цену из Product
     * @param volume = Объем жидкости для горячих напитков
     */
    public HotDrink(String name, Double price, Double volume, int temperatyre){
        super(name, price);
        this.volume = volume;
        this.temperatyre = temperatyre;
        if(temperatyre <= 0 || temperatyre > 100){
            throw new IllegalStateException(String.format("Температура указана не верно", temperatyre));
        }
    }

    /** @return получаем volume */
    public Double getVolume(){
        return volume;
    }
    
    /** Присваиваем полученное значения*/
    public void setVolume(){
        this.volume = volume;
    }

     /** @return получаем temperatyre */
    public Integer getTemp(){
        return temperatyre;
    }

    /** Присваиваем полученное значение */
    public void SetTemp(Integer tempr){
        if(tempr <= 0 || tempr > 100){
            throw new IllegalStateException(String.format("Температура указана не верно", temperatyre));
        }
        this.temperatyre = tempr;
    }

    /**Переопределяем наследуемый метод toString из Product */
    @Override
     public String toString(){
        return "Product{" +
        "name = '" + super.getName() + '\'' +  // name
        ", cost = " + super.getPrice() +   // price
        ", volume = '" + volume + "л." +
        ", temperatyre = '" + temperatyre + " gr" +
        '}';
    }
}