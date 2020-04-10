package com.League;

public class Round {
    private Match[] matches;

    public Round() {
    }

    public Round(Match[] matches) {
        this.matches = matches;
    }

    public Match[] getMatches() {
        return matches;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }
}
