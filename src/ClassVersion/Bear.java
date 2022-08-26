package ClassVersion;

public class Bear extends Animal{
    private String symbol = "B";


    public Bear(){
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
