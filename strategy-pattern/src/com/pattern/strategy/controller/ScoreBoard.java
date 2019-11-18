package com.pattern.strategy.controller;

import com.pattern.strategy.controller.ScoreBoardBase;

public class ScoreBoard implements ScoreBoardBase {
    private ScoreBoardBase scoreBoard;

    @Override
    public int showScore(int taps, int multiplier) {
        return scoreBoard.showScore(taps,multiplier);
    }

    public void setScoreBoard(ScoreBoardBase scoreBoard) {
        this.scoreBoard = scoreBoard;
    }
}
