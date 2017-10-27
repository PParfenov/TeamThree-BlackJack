package io.zipcoder.teamthree.blackjack;

public class Card
{
    private Suit suit;
    private static String[] suitSymbols = {"♡", "♢", "♧", "♤"};
    private Integer value;
    private String topCardRepresentation;
    private String bottomCardRepresentation;
    private static String middleCardRepresentation="|     |\n";

    private Card(){
    }

    @Override
    public String toString(){
        return topCardRepresentation+middleCardRepresentation+bottomCardRepresentation;
    }

    public Card(Suit passedSuit, Integer passedValue){
        this(passedSuit, passedValue, "X");
    }

    public Card(Suit passedSuit, Integer passedValue, String passedSuitRepresentation){
        suit=passedSuit;
        value=passedValue;
        topCardRepresentation=" ----- \n"+
                              "|X"+passedSuitRepresentation+"   |\n";
        bottomCardRepresentation="|   X"+passedSuitRepresentation+"|\n"+
                                 " ----- \n";
    }

    public Integer getValue(){
        return value;
    }

    public Suit getSuit(){
        return suit;
    }

}
