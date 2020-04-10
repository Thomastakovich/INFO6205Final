package com.Rank;

public class ELOResult {

    private int rHome;

    private int rAway;

    private String result;

    public int getRa() {
        return rHome;
    }

    public void setRa(int rHome) {
        this.rHome = rHome;
    }

    public int getRb() {
        return rAway;
    }

    public void setRb(int rb) {
        this.rAway = rAway;
    }

    public String getResult() { return result; }

    public void setResult(String result) { this.result = result; }
}
