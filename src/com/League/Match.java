package com.League;

public class Match {
    private Team h; //Home
    private Team a; //Away
    private boolean hW; //Home Wins
    private boolean aW; //Away Wins
    private boolean draw; // Draw
    private int round;// Round

    public Match(Team h, Team a, int round) {
        this.h = h;
        this.a = a;
        this.round = round;
    }

    public Match(Team h, Team a, int round, boolean hW, boolean aW, boolean draw) {
        this.h = h;
        this.a = a;
        this.round = round;
        this.hW = hW;
        this.aW = aW;
        this.draw = draw;
    }

    public Team getH() {
        return h;
    }

    public void setH(Team h) {
        this.h = h;
    }

    public Team getA() {
        return a;
    }

    public void setA(Team a) {
        this.a = a;
    }

    public boolean ishW() {
        return hW;
    }

    public void sethW(boolean hW) {
        this.hW = hW;
    }

    public boolean isaW() {
        return aW;
    }

    public void setaW(boolean aW) {
        this.aW = aW;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Override
    public String toString() {
        if (this.ishW() == true) return "Home team " + this.getH() + " wins.";
        else if (this.isaW() == true) return "Away team " + this.getA() + " wins.";
        else if (this.isDraw() == true) return "Draw.";
        else return "Not Started";
    }
}
