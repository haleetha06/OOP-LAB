import java.util.Scanner;
class device{
    String brand;
    String model;

    device(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    void powerOn(){
        System.out.println("This device is powering ON...");
    }

}
class smartphone extends device{
    int batteryCapacity;
    smartphone(String brand,String model,int batteryCapacity){
      super(brand,model);
      this.batteryCapacity=batteryCapacity;

    }

    void powerOn(){
        System.out.println( brand +"" + model+ " (smartphone) is powering ON...");
    }

    void charge() {
        System.out.println(brand + " " + model + " is charging. It has a battery capacity of " + batteryCapacity + " mAh.");
    }

}

class laptop extends device{
    int ramSize;

    laptop(String brand,String model,int ramSize){
     super(brand, model);
     this.ramSize=ramSize;

    }

    void powerOn() {
        System.out.println(brand + " " + model + " (Laptop) is powering on.");
    }

    void upgradeRam(int newRamSize){
        this.ramSize=newRamSize;
        System.out.println(brand + " " + model + " RAM upgraded to " + ramSize + " GB.");
    
    }
}

public class hierarchical_inheritance1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter type of device(laptop or smartphone)");
        String devType=scan.nextLine();

        if(devType.equalsIgnoreCase("smartphone")){
            smartphone obj1=new smartphone("Apple","iPhone 15",4000);
            obj1.powerOn();
            obj1.charge();
        }
        else if(devType.equalsIgnoreCase("laptop")){
            laptop obj2=new laptop("Dell","XPS 13",13);
            obj2.powerOn();
            obj2.upgradeRam(16);
        }
        else{
            System.out.println("Invalid input. Please enter 'smartphone' or 'laptop'....");
    
        }
        scan.close();
    }

}
    