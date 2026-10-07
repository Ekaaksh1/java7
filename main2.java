interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    @override
    public void changeGear(int newGear){
        gear=newGear;
    }
    @override
    public void speedUp(int increment){
        speed=speed+increment;
    }
    @override
    public void applyBrakes(int decrement){
        speed=speed-decrement;

    }
    public void printStates(){
        System.out.println("speed:"+speed+"gear:"+gear);
    }
}
class car implements Vehicle{
    int speed;
    int gear;
    @Override 
    public void changeGear(int newGear){
        gear=newGear;
    }
    @Override 
    public void speedUp(int increment){
        speed=speed+increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed=speed-decrement;
    }
    public void prinStates(){
    System.out.println("speed:"+speed+"gear:"+gear);
    }
}
class Main{
    public static void main(string[]args){
        Bicycle bicycle=new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedup(3);
        bicycle.applybrakes(1);
        System.out.println("Bicycle present state:");
        bicycle.printstates();
        Car car=new Car();
        car.changeGear(1);
        car.speedup(4);
        car.applybrakes(3);
        System.out.println("car present state:");
        car.printStates();
    }
}