package com.Group5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Abdallah on 2/19/2015.
 */
public class Pile {
    public LinkedList<Cards> Card;

    public Pile(LinkedList<Cards> deck) {
        this.Card = deck;
    }

    public Cards Draw() {
        return this.Card.pop();
    }
}