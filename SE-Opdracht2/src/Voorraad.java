import java.util.ArrayList;
import java.util.List;

public class Voorraad {
  //  •	Robijn, 3 euro (31% korting bij aanschaf van 2x flacons)
//•	Brinta, 2,50 euro
//..•	Chinese Groenten, 5 euro
//..•	Kwark, 2 euro (op woensdagen in de aanbieding voor 1 euro)
//•	Luiers, 10 euro (4 halen, 3 betalen)
    public static List<Producten> voorraadList = new ArrayList<>();

    public void vulVoorraadList(){
        Producten robijn = new Producten(3.00,"Robijn");
        Producten brinta = new Producten(2.50,"Brinta");
        Producten chinGr = new Producten(5.00,"Chinese Groenten");
        Producten kwart  = new Producten(2.00, "Kwark");
        Producten luiers = new Producten(10.00,"Luiers");

        voorraadList.add(robijn);
        voorraadList.add(brinta);
        voorraadList.add(chinGr);
        voorraadList.add(kwart);
        voorraadList.add(luiers);


    }

}
