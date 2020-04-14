package com.Rank;

import com.League.Match;
import com.League.Team;

import java.math.BigDecimal;

public class ELOUtils {
    private final static BigDecimal ONE = new BigDecimal("1.0");
    private final static BigDecimal K = new BigDecimal("100.0");

    public static double homeWinRating(Team rHome, Team rAway){
        BigDecimal eHomeWins = ONE.divide(ONE.add(new BigDecimal(Math.pow(10, new BigDecimal(rAway.getPointPerMatch()-rHome.getPointPerMatch()).divide(K, 6, BigDecimal.ROUND_HALF_UP).doubleValue()))), 6, BigDecimal.ROUND_HALF_UP);
        return Double.parseDouble(eHomeWins.toString());
    }

    public static void aWin(int a, int b) {
        double ea = 1 / (1 + Math.pow(10, (b - a) / 400.0));
        System.out.println(ea);
    }

    public static Match kickOff(Match match) {
        double HWR = homeWinRating(match.getH(), match.getA());
        if (HWR >= 0.5) {
            match.sethW(true);
            match.getH().win();
            match.getA().lose();
        } else {
            match.setaW(true);
            match.getA().win();
            match.getH().lose();
        }
        return match;
    }

}
