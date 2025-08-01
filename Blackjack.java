import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //scan.nextLine();
       
        int playerCard1 = drawRandomCard();
        int playerCard2 = drawRandomCard();
        int sum = Math.min(playerCard1, 10) + Math.min(10, playerCard2);

        System.out.println("\n You get a: \n" + cardString(playerCard1) + "\n and a: \n" + cardString(playerCard2));
        System.out.println("Your hand total is: " + sum);

        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard(); 
        int dealerSum = Math.min(dealerCard1, 10) + Math.min(10, dealerCard2);

        System.out.println("\nThe dealer shows \n" + cardString(dealerCard1) + "\nand has a card facing down \n" + faceDown());
        System.out.println("The dealer's total is hidden");
        

        while (true) {
            String option = hitOrStay();

            if (option.equals("stay")) {
                break;
            }
            int hitCards = drawRandomCard();
            sum += Math.min(10, hitCards);
            System.out.println("\nYou get a:");
           System.out.println(cardString(hitCards));          
           System.out.println("Your hand total is: " +sum);

           if (sum > 21) {
            System.out.println("Bust! Player loses");
            System.exit(0);
           }   
        } 

        System.out.println("\nDealer's turn \nThe dealer's cards are: \n " + cardString(dealerCard1) + "\nand a: \n " + cardString(dealerCard2));
        System.out.println("The dealer's hand total is: " +dealerSum);

        

        while (dealerSum < 17) {
            int dHitCards = drawRandomCard();

            dealerSum += Math.min(10, dHitCards);
            System.out.println("\nDealer gets a:");
            System.out.println(cardString(dHitCards));
            
            System.out.println("Dealer's total is: " +dealerSum);

            if (dealerSum > 21) {
                System.out.println("Bust! Dealer loses");
                System.exit(0);
            }
        }

        if (sum > dealerSum) {
            System.out.println("Player wins!");
        } else { 
            System.out.println("Dealer wins!");
        }
         scan.close();

    }

    public static int drawRandomCard() {
        double randomCard = Math.random() * 13;
        randomCard += 1;
        return (int) randomCard;
    }

    public static String cardString(int cardNumber) {
        switch (cardNumber) {
            case 1:return  
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
           case 2:return
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3:return       
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";                                                             
            case 4:return
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5:return
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            case 6:return
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            case 7:return
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            case 8:return
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            case 9:return
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            case 10:return
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            case 11:return
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            case 12:return
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            case 13:return
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";       
            default: return "Joker :p ";
                
        }
    }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
 
    public static String hitOrStay() {
        System.out.println("\nPlease enter 'hit' or 'stay'");
        String answer = scan.nextLine();   
        while (!(answer.equalsIgnoreCase("hit") || answer.equalsIgnoreCase("stay"))) {
            System.out.println("\nPlease enter 'hit' or 'stay'");
            answer = scan.nextLine();
        }
        return answer;
    }
   
    }

