package com.League;

public class MatchResult {

    public boolean hw = false; // Home win
    public boolean d = false; // Draw
    public boolean aw = false; // Away win

    public MatchResult(int r) {
        if(r == 3) {
            this.hw = true;
        }
        else if(r == 1) {
            this.d = true;
        }
        else if(r == 0) {
            this.aw = true;
        }
    }
}
