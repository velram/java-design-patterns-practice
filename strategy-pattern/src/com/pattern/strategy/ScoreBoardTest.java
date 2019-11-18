package com.pattern.strategy;

import com.pattern.strategy.controller.ScoreBoardBase;
import com.pattern.strategy.model.Ballon;
import com.pattern.strategy.model.Clown;
import com.pattern.strategy.model.SquareBallon;

public class ScoreBoardTest {
    public static void main(String[] args){

        ScoreBoardBase scoreBoard = new Ballon();
        System.out.println("Ballon score : "+scoreBoard.showScore(2,10));

        scoreBoard = new SquareBallon();
        System.out.println("SquareBallon score : "+scoreBoard.showScore(2,10));

        scoreBoard = new Clown();
        System.out.println("Ballon score : "+scoreBoard.showScore(2,10));
    }
}
