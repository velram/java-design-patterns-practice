package com.pattern.strategy.controller;

import com.pattern.strategy.controller.ScoreBoardBase;

public class ScoreBoard implements ScoreBoardBase {
    private ScoreBoardBase scoreBoard;

    public ScoreBoard(ScoreBoardBase scoreBoardBase){
        this.scoreBoard = scoreBoardBase;
    }

    @Override
    public int showScore(int taps, int multiplier) {
        return scoreBoard.showScore(taps,multiplier);
    }

}
