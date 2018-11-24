import java.util.Scanner;

public class Shop {
    //public static Car auto;

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
        System.out.println(Voorraad.voorraadList.get(0).getShortkey());


        while (!klaar) {
            input = new Scanner(System.in);

            //System.out.println("Please enter the Licence plate you are looking for and X to exit: ");


            System.out.println("Wij hebben de volgende producten op voorraad:");
            //PRODUCTEN OP VOORRAAD LATEN ZIEN!

            System.out.println("(W) om de inhoud van uw winkelmandje te bekijken");
            System.out.println("(X) om af te rekenen");

            s = input.next(); // getting a String value


            switch(s){
                case "C"://Plaats in winkelmandje
                    optionC();
                    break;
                case "D":
                    //optionD();
                    break;
                case "X"://Stop met winkelen en reken af
                    //optionX();
                    klaar= true;
                    break;
                default:
                    System.out.println("Kies aub een juiste optie!");
            }



        }




    }

    private static void optionC() {
        boolean klaar = false;



    }



}

