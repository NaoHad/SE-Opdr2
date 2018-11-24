import java.util.Arrays;
import java.util.List;

public class Producten {
    private double prijs;
    private String naam;
    private String shortkey;
    private List<String> characterList = Arrays.asList(new String[]{"A","B","C","D","E"});
    static int plaats = 0;


    public Producten(double prijs, String naam) {
        this.prijs = prijs;
        this.naam = naam;
        shortkey = characterList.get(plaats);
        plaats++;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public double berekenActiePrijs(){
        double prijs = 0.0;
        return prijs;
    }

    public String getShortkey() {
        return shortkey;
    }

    public void setShortkey(String shortkey) {
        this.shortkey = shortkey;
    }
}
