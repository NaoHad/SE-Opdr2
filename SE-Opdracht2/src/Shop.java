import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public static List<Producten> winkelmandje = new ArrayList<>();
    public static double totaal;

    public static void main(String[] args) {
        //Dit is het winkelprogramma
        //Je begint buiten de winkel

        //X om weg te gaan
        //W om de winkel te betreden





        Boolean klaar = false;

        while(!klaar){
            System.out.println("Voer (W) in om de Naoufal Haddou te betreden");
            System.out.println("Voer (X) in om te stoppen");
            Scanner input = new Scanner(System.in);

            String s = input.next();
            switch (s){
                case "W":
                    klaar = true;
                    break;
                case "X":
                    return;
                    default:
                        System.out.println("Invalide invoer. Vul aub 1 van de opties in en druk op enter.");


            }
        }


        System.out.println("Welkom in de Naoufal Haddou");
        System.out.println("Door de juiste toesten in te drukken kun je je boodschappenmandje vullen en afrekenen");
        System.out.println("Door de toets tussen () voor het product in te voeren stop je het product in je winkelmand");
        System.out.println("Alvast veel winkelplezier!");
        System.out.println("Voer een waarde in om verder te gaan...");
        Scanner input = new Scanner(System.in);
        String s = input.next();

        for (int i = 0; i < 5; i++) {
            System.out.println("");
        }
        System.out.println("------------------------------------------------");

        klaar = false;


        //Vul nu de winkelvoorraad:
        Voorraad voorraad = new Voorraad();
        voorraad.vulVoorraadList();

        //Voorraad testje
        System.out.println(Voorraad.voorraadList.get(0).getNaam());
        for (int i = 0; i < Voorraad.voorraadList.size(); i++) {
            System.out.println("(" + Voorraad.voorraadList.get(i).getShortkey() + ") om " + Voorraad.voorraadList.get(i).getNaam() + " in je mandje te stoppen");
        }


        //Print product uit list testje:



        while (!klaar) {
            input = new Scanner(System.in);

            //System.out.println("Please enter the Licence plate you are looking for and X to exit: ");


            System.out.println("Wij hebben de volgende producten op voorraad:");


            //PRODUCTEN OP VOORRAAD LATEN ZIEN!

            System.out.println("(W) om de inhoud van uw winkelmandje te bekijken");
            System.out.println("(X) om af te rekenen");

            s = input.next(); // getting a String value


            switch(s){
                case "W"://Bekijk winkelmandje inhoud
                    printInhoudMandje();
                    break;
                case "X"://Reken mandje af
                    rekenMandjeAf();
                    betaal();
                    //optionX();
                    klaar= true;
                    break;
                default://Check of een goede waarde, dus 1 product in mandje doen of niet
                    boolean gevonden = false;
                    for (int i = 0; i <  Voorraad.voorraadList.size(); i++) {
                        if(Voorraad.voorraadList.get(i).getShortkey().equals(s)){
                            //Voeg toe aan mandje
                            winkelmandje.add(Voorraad.voorraadList.get(i));
                            System.out.println(Voorraad.voorraadList.get(i).getNaam() + " is zojuist toegevoegd aan je winkelmandje!");
                            gevonden = true;
                        }
                    }
                    if(!gevonden)
                        System.out.println("Kies aub een juiste optie!");
            }



        }




    }

    private static void betaal() {
        boolean klaar = false;
        while (!klaar) {
            System.out.println("");
            System.out.println("Voer in met hoeveel euro u betaalt");
            Scanner input = new Scanner(System.in);

            String s = input.next();
            int geld = 0;
            try {
                geld = Integer.parseInt(s);
                if(geld > totaal) {
                    totaal = totaal - geld;
                    klaar = true;
                }
                else{
                    totaal = totaal - geld;
                    System.out.println("Niet genoeg geld, u moet nog " + totaal + " euros betalen");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }

        }

        System.out.println("Bedankt! Het wisselgeld dat u terugkrijgt is " + (totaal * -1) +" euros");
        System.out.println("Wij hopen je gauw nog terug te zien!");


    }

    private static void rekenMandjeAf() {
        double totaalPrijs = 0.0;
        //Product
        // Aantal
        // Totaalprijs
        //


        for (Producten v: Voorraad.voorraadList) {
            int Aantal = 0;
            double nutotPrijs = 0.0;

            Producten product = null;

            for (Producten w: winkelmandje) {
                if(w.getNaam().equals(v.getNaam())){
                    product = w;
                    Aantal ++;
                }

            }
            //Check voor acties:
            if(Aantal > 0){
                nutotPrijs = product.berekentotaalPrijs(Aantal);
                //Check prijs op actieprijs
            }

            totaalPrijs = totaalPrijs + nutotPrijs;



        }

        System.out.println("Dit geeft een totaalprijs van: " + totaalPrijs);
        totaal = totaalPrijs;


    }

    private static void printInhoudMandje() {//Laat simpel alle producten in een lijst zien
        for (Producten p: winkelmandje) {
            System.out.println(p.getNaam());
        }
    }

    private static void optionC() {
        boolean klaar = false;



    }



}

