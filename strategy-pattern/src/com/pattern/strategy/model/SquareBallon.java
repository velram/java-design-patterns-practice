package com.pattern.strategy.model;

import com.pattern.strategy.controller.ScoreBoard;

public class SquareBallon extends ScoreBoard {
    @Override
    public int showScore(int taps, int multiplier) {
        return (taps * multiplier) + 30;
    }
}
