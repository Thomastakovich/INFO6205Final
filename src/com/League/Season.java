package com.League;

import java.util.*;

public class Season {
//    private Team[] teams;
    private Round[] rounds;
//    private Map<Team, Integer> scoreBoard;

    public Season(Round[] rounds) {
        this.rounds = rounds;
//        this.teams = teams;
    }

//    public Team[] getTeams() {
//        return teams;
//    }

//    public void setTeams(Team[] teams) {
//        this.teams = teams;
//    }

    public Round[] getRounds() {
        return rounds;
    }

    public void setRounds(Round[] rounds) {
        this.rounds = rounds;
    }

//    public Map<Team, Integer> getScoreBoard() {
//        return scoreBoard;
//    }

//    public void setScoreBoard(Map<Team, Integer> scoreBoard) {
//        this.scoreBoard = scoreBoard;
//    }

//    public void updateScoreBoard() {
//        this.scoreBoard.clear();
//        for(Team t : this.teams) {
//            this.scoreBoard.put(t, t.getPoint());
//        }
//
//    }

//    public void sortScoreBoard () {
//        Set<Map.Entry<Team,Integer>> mapEntries = this.scoreBoard.entrySet();
//        List<Map.Entry<Team,Integer>> list = new LinkedList<Map.Entry<Team,Integer>>(mapEntries);
//        Collections.sort(list, new Comparator<Map.Entry<Team, Integer> >() {
//            @Override
//            public int compare(Map.Entry<Team, Integer> o1, Map.Entry<Team, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue()) * (-1);
//            }
//        });
//    }
}
