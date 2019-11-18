package com.pattern.strategy.model;

import com.pattern.strategy.controller.ScoreBoardBase;

public class SquareBallon implements ScoreBoardBase {

    @Override
    public int showScore(int taps, int multiplier) {
        return (taps * multiplier) + 20;
    }
}
