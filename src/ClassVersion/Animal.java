package ClassVersion;

public class Animal {
    private String symbol = "A";
    private static River river;

    public Animal() {
        this.symbol = symbol;
    }

    public static void setRiver(River river) {
        Animal.river = river;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void act(int index) {
        if (river == null) {
            throw new IllegalStateException("Can not act - No River Set for Animals");
        }
        int c = (int) (1 + Math.random() * 100);
        if (c <= 20) {//move left
            if (index == 0) {
                return;//exit, can not move
            }
            //get animal next to me
            Animal nextToMe = river.getAnimalAt(index - 1);
            if (nextToMe == null) {
                river.clearLoc(index);
                river.addAnimal(this, index - 1);
            } else if (nextToMe.getSymbol().equals(river.getAnimalAt(index).getSymbol())) {
                clonespell(index);
            } else if (this.getSymbol().equals("B") && nextToMe.getSymbol().equals("F")) {
                river.clearLoc(index - 1);
                river.clearLoc(index);
                river.addAnimal(this, index - 1);
                int a = index-1;
                System.out.println("Bear " + index +" ate Fish " + a);
            }
        } else if (c <= 40) {//move right;
            if (index == river.river.length - 1) {
                return;
            }
            Animal nextToMe = river.getAnimalAt(index + 1);
            if (nextToMe == null) {
                river.clearLoc(index);
                river.addAnimal(this, index + 1);
            } else if (nextToMe.getSymbol().equals(river.getAnimalAt(index).getSymbol())) {
                clonespell(index);
            } else if (this.getSymbol().equals("B") && nextToMe.getSymbol().equals("F")) {
                river.clearLoc(index + 1);
                river.clearLoc(index);
                river.addAnimal(this, index + 1);
                int a = index+1;
                System.out.println("Bear " + index +" ate Fish " + a);
            }
        }
    }

    public void clonespell(int index) {
        Animal a = river.getAnimalAt(index);
        int r = (int) (1 + Math.random() * 99);
        while (river.getAnimalAt(r) != null) {
            r = (int) (1 + Math.random() * 99);
        }
        river.addAnimal(a, r);
        System.out.println("A new challenger has appeared at " + r);
    }
}