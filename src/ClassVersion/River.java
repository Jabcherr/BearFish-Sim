package ClassVersion;

public class River {
    Animal river[];

    public River(){
        river = new Animal[100];
    }

    public River(int n){
        river = new Animal[n];
    }

    //DD(Design Decisions)- Return False if out of bounds and return false if index already contains an animal
    public boolean addAnimal(Animal a, int index){
        if(index < 0 || index >= river.length){
            return false;
        }
        Animal temp = getAnimalAt(index);
        if (temp != null){
            return false;
        }
        river[index] = a;
        return true;
    }

    public Animal getAnimalAt(int index){
        if(index < 0 || index >= river.length){
            throw new ArrayIndexOutOfBoundsException("Get in the game son");
        }
        return river[index];
    }

    public String toString(){
        String out = ""; //build our output

        for (Animal a: river){
            if (a == null){
                out += "-";
            }
            else{
                out += a.getSymbol();
            }
        }
        return out;
    }

    public void stepSim(){
        for (int i = 0; i < river.length; i++){
            Animal current = getAnimalAt(i);
            if (current != null){
                current.act(i);
            }
        }
    }

    public void clearLoc(int index){
        river[index] = null;
    }
}
