package ClassVersion;

public class Fish extends Animal{
    private String symbol = "F";


    public Fish(){
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}

