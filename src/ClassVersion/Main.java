package ClassVersion;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        River r = new River();

        Animal.setRiver(r);

        r.addAnimal(new Bear(), 0);
        r.addAnimal(new Bear(), 24);
        r.addAnimal(new Fish(), 74);
        r.addAnimal(new Fish(),99);

        while(true){
            r.stepSim();
            System.out.println(r);
            Thread.sleep(400);
        }
    }
}
