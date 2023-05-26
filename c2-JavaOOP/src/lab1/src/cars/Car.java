package cars;
import java.time.LocalDate;
import java.time.Period;
import static java.lang.Math.min;

public class Car {
    private String name;
    private int speed;
    private boolean engineStatus;
    private LocalDate manufactured;
    private int gasoline;
    private int tirePressure[];
    
    //example of constructors
    public Car(){}
    
    public Car(String name){
        this(name,0,false,0);
    }
    public Car(String name, int speed, boolean engineStatus, int gasoline) {
        this.name = name;
         this.setSpeed(speed);
        this.engineStatus = engineStatus;
        this.gasoline = gasoline;
    }

    //example of var args

    public int[] getTirePressure() {
        return tirePressure;
    }

    public void setTirePressures(int... tirePressure) {
        if (tirePressure.length == 4)
            this.tirePressure = tirePressure;
        else if (tirePressure.length == 2) {
            this.tirePressure[0] = this.tirePressure[1] = tirePressure[0];
            this.tirePressure[2] = this.tirePressure[3] = tirePressure[1];
        } else if (tirePressure.length == 1)
            this.tirePressure[0] = this.tirePressure[1] = this.tirePressure[2] = this.tirePressure[3] = tirePressure[0];

    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

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
        int maximumSpeed = 65;

       // this.speed = (speed <= maximumSpeed) ? speed : maximumSpeed;
          this.speed=min(speed,maximumSpeed);  
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public int getAge() {
        return Period.between(manufactured, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Car talbotCar = new Car();
        talbotCar.setManufactured(LocalDate.of(1961, 1, 30));
        talbotCar.setName("Talbot");
        talbotCar.setSpeed(40);

        Car tataCar = new Car();
        tataCar.setManufactured(LocalDate.of(2001, 6, 19));
        tataCar.setName("Talbot");
        tataCar.setSpeed(70);
       
        Car ibizaCar = new Car("Seat Ibiza",90,false,0);
        ibizaCar.setManufactured(LocalDate.of(2006,9,30));
        
        
        for (Car car : new Car[] { talbotCar, tataCar,ibizaCar }) {
            System.out.printf(" Car %s is %d years old and is traveling at  %d km/h  %n",
                    car.getName(), car.getAge(), car.getSpeed());
        }
    }

}
