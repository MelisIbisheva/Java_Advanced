package WorkingWithAbstractions_exercise.Cards;

public class Card {
    private CardRanks cardRanks;
    private  CardSuits cardSuits;

    public Card(CardRanks cardRanks, CardSuits cardSuits) {
        this.cardRanks = cardRanks;
        this.cardSuits = cardSuits;
    }

    public CardRanks getCardRanks() {
        return cardRanks;
    }

    public void setCardRanks(CardRanks cardRanks) {
        this.cardRanks = cardRanks;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardSuits cardSuits) {
        this.cardSuits = cardSuits;
    }

    public int getPower(){
        return cardRanks.getRankPower() + cardSuits.getSuitPower();
    }

}
