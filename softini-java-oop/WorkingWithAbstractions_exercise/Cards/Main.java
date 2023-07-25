package WorkingWithAbstractions_exercise.Cards;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Card Suits:");
//        Arrays.stream(CardSuits.values())
//                .forEach(cardSuits -> System.out.printf("Ordinal value: %d; Name value: %s, POWER: %n", cardSuits.ordinal(), cardSuits.name(), cardSuits.getSuitPower()));
        //            System.out.println("Card Ranks:");
        //              for(CardRanks cardRank : CardRanks.values()){
//             System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
//
//             System.out.println("Card Suits:");
//
//             Arrays.stream(CardSuits.values()).forEach(cardSuits -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuits.ordinal(),cardSuits.name()));
//       }
        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card = new Card(cardRanks, cardSuits);
        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRanks(), card.getCardSuits(), card.getPower());
    }
}
