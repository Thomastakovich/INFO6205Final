package com.Rank;

import com.League.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TeamSortByExpectation {
    public static void sortTeams(ArrayList<Team> ts) {
        Collections.sort(ts, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2) {
                return (int)((t2.getExpectationPoint() - t1.getExpectationPoint()) * 1000000);
            }
        });
    }
}
