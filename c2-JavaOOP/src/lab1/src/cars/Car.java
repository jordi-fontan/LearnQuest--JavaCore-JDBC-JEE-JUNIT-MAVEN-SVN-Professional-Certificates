package cars;
import java.time.LocalDate;
import java.time.Period;


public class Car {
    private String name;
    private int speed;
    private boolean engineStatus;
    private LocalDate manufactured;
    
    public LocalDate getManufactured() {
        return manufactured;
    }
    public void setManufactured(LocalDate manufactured) {
        this.manufactured = manufactured;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isEngineStatus() {
        return engineStatus;
    }
    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }
    
    
    public int getAge(){
        return Period.between(manufactured, LocalDate.now()).getYears();
    }

    public static void main(String[] args ){
        Car talbotCar=new Car();
        talbotCar.setManufactured(LocalDate.of(1961, 1, 30));
        talbotCar.setName("Talbot");talbotCar.setSpeed(40);
        
        Car tataCar=new Car();
        tataCar.setManufactured(LocalDate.of(2001, 6,19));
        tataCar.setName("Talbot");tataCar.setSpeed(70);

    
        for(Car car:new Car[]{talbotCar,tataCar}){
            System.out.printf( " Car %s is %d years old and is traveling at  %d km/h  %n",
            car.getName(),car.getAge(),car.getSpeed());}
    }

}
