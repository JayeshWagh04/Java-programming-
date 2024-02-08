
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleJayesh = new AvonCycle();
        cycleJayesh.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleJayesh.a);
        System.out.println(cycleJayesh.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        cycleJayesh.blowHornK3g();
        cycleJayesh.blowHornmhn();
        cycleJayesh.blowHorn();
    }
}
