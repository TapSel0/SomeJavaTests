public class Car implements Movable{
    private String make;
    private String model;
    private int year;
    private int price;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void displayInfo(){
        System.out.println("Марка машины: " + this.make);
        System.out.println("Модель машины: " + this.model);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Цена: " + this.price);
    }

    @Override
    public void move(){
        System.out.println("I'm moving car");
    }
}
