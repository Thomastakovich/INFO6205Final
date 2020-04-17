package com.Rank;

import com.League.Match;
import com.League.Team;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Random;

public class Rating {
    private static HashMap<Integer, int[]> relationship = new HashMap<>();
    private static Random random = new Random();

    public static double HW(Team rHome, Team rAway) {
        return 0.0339 * (rHome.getPointPer5Match() - rAway.getPointPer5Match()) + 0.4813;
    }

    public static double AW(Team rHome, Team rAway) {
        return -0.0294 * (rHome.getPointPer5Match() - rAway.getPointPer5Match()) + 0.2974;
    }

    public static double D(Team rHome, Team rAway) {
        return -0.0045 * (rHome.getPointPer5Match() - rAway.getPointPer5Match()) + 0.2273;
    }

    public static double homeWinRate(Team rHome, Team rAway, HashMap<Integer, int[]> r) {
        int[] defultWDL = {1,1,1};
        int scoreGap = rHome.getPointPer5Match() - rAway.getPointPer5Match();
        int[] WDL = r.getOrDefault(scoreGap, defultWDL);
        return (double)WDL[0] / (WDL[0] + WDL[1] + WDL[2]);
    }

    public static double homeDrawRate(Team rHome, Team rAway, HashMap<Integer, int[]> r) {
        int[] defultWDL = {1,1,1};
        int scoreGap = rHome.getPointPer5Match() - rAway.getPointPer5Match();
        int[] WDL = r.getOrDefault(scoreGap, defultWDL);
        return (double)WDL[1] / (WDL[0] + WDL[1] + WDL[2]);
    }

    public static double homeLoseRate(Team rHome, Team rAway, HashMap<Integer, int[]> r) {
        int[] defultWDL = {1,1,1};
        int scoreGap = rHome.getPointPer5Match() - rAway.getPointPer5Match();
        int[] WDL = r.getOrDefault(scoreGap, defultWDL);
        return (double)WDL[2] / (WDL[0] + WDL[1] + WDL[2]);
    }

    public static double homePointException(Team rHome, Team rAway, HashMap<Integer, int[]> r){
        int[] defultWDL = {1,1,1};
        int scoreGap = rHome.getPointPer5Match() - rAway.getPointPer5Match();
        int[] WDL = r.getOrDefault(scoreGap, defultWDL);
        double winRate = (double)WDL[0] / (WDL[0] + WDL[1] + WDL[2]);
        double drawRate = (double)WDL[1] / (WDL[0] + WDL[1] + WDL[2]);
        return winRate*3 + drawRate;
    }

    public static Match kickOff(Match match, HashMap<Integer, int[]> r) {
        double HWR = HW(match.getH(), match.getA());
        double HDR = D(match.getH(), match.getA());
        double HLR = AW(match.getH(), match.getA());
        double rand = random.nextDouble();
        if (rand <= HWR) {
            match.sethW(true);
            match.getH().win();
            match.getA().lose();
        } else if(rand > HWR && rand <= HDR + HWR) {
            match.setDraw(true);
            match.getA().draw();
            match.getH().draw();
        } else {
            match.setaW(true);
            match.getA().win();
            match.getH().lose();
        }
        return match;
    }

    public static Match exceptionKickOff(Match match, HashMap<Integer, int[]> r) {
        double HWR = HW(match.getH(), match.getA());
        double HDR = D(match.getH(), match.getA());
        double HLR = AW(match.getH(), match.getA());
        match.getH().setExpectationPoint(match.getH().getExpectationPoint() + 3*HWR + HDR);
        match.getA().setExpectationPoint(match.getA().getExpectationPoint() + 3*HLR + HDR);
        return match;
    }

}
