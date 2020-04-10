package com.Rank;

import com.League.Match;
import com.League.Round;
import com.League.Season;
import com.League.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    //init Teams
    public static Team LP = new Team(0,"Liverpool                ", 27, 1, 1, 82, 29);
    public static Team MC = new Team(1,"Manchester City          ", 18, 3, 7, 57, 28);
    public static Team LC = new Team(2,"Leicester City           ", 16, 5, 8, 53, 29);
    public static Team CHS = new Team(3,"Chelsea                  ", 14, 6, 9, 48, 29);
    public static Team MU = new Team(4,"Manchester Unite         ", 12, 9, 8, 45, 29);
    public static Team WW = new Team(5,"Wolverhampton Wanderers  ", 10, 13, 6, 43, 29);
    public static Team SU = new Team(6,"Sheffield United         ", 11, 10, 7, 43, 28);
    public static Team TH = new Team(7,"Tottenham Hotspur        ", 11, 8, 10, 41, 29);
    public static Team ASN = new Team(8,"Arsenal                  ", 9, 13, 6, 40, 28);
    public static Team BL = new Team(9,"Burnley                  ", 11, 6, 12, 39, 29);
    public static Team CP = new Team(10,"Crystal Palace           ", 10, 9, 10, 39, 29);
    public static Team ET = new Team(11,"Everton                  ", 10, 7, 12, 37, 29);
    public static Team NU = new Team(12,"Newcastle Unite          ", 9, 8, 12, 35, 29);
    public static Team SA = new Team(13,"Southampton              ", 10, 4, 15, 34, 29);
    public static Team BT = new Team(14,"Brighton and Hove Albion ", 6, 11, 12, 29, 29);
    public static Team WHU = new Team(15,"WestHam United           ", 7, 6, 16, 27, 29);
    public static Team WF = new Team(16,"Watford                  ", 6, 9, 14, 27, 29);
    public static Team BM = new Team(17,"Bournemouth              ", 7, 6, 16, 27, 29);
    public static Team AV = new Team(18,"Aston Villa              ", 7, 4, 17, 25, 28);
    public static Team NC = new Team(19,"Norwich City             ", 5, 6, 18, 21, 29);
    //public static Team[] teamsS19_20 = {LP,MC,LC,CHS,MU,WW,SU,TH,ASN,BL,CP,ET,NU,SA,BT,WHU,WF,BM,AV,NC};

    public static void main(String[] args){
        ArrayList<Team> teamsS19_20 = new ArrayList<>();
        teamsS19_20.add(LP);
        teamsS19_20.add(MC);
        teamsS19_20.add(LC);
        teamsS19_20.add(CHS);
        teamsS19_20.add(MU);
        teamsS19_20.add(WW);
        teamsS19_20.add(SU);
        teamsS19_20.add(TH);
        teamsS19_20.add(ASN);
        teamsS19_20.add(BL);
        teamsS19_20.add(CP);
        teamsS19_20.add(ET);
        teamsS19_20.add(NU);
        teamsS19_20.add(SA);
        teamsS19_20.add(BT);
        teamsS19_20.add(WHU);
        teamsS19_20.add(WF);
        teamsS19_20.add(BM);
        teamsS19_20.add(AV);
        teamsS19_20.add(NC);

        //Round 28
        Match AVvsSU = new Match(AV, SU, 28);
        Match MCvsASN = new Match(MC, ASN, 28);
        Match[] matchesS19_20R28 = {AVvsSU, MCvsASN};
        Round roundS19_20R28 = new Round(matchesS19_20R28);
        for (Match m : roundS19_20R28.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 30
        Match BTvsASN = new Match(BT, ASN,30);
        Match MCvsBL = new Match(MC, BL,30);
        Match WFvsLC = new Match(WF, LC,30);
        Match BMvsCP = new Match(BM, CP, 30);
        Match NUvsSU = new Match(NU, SU, 30);
        Match NCvsSA = new Match(NC, SA, 30);
        Match AVvsCHS = new Match(AV, CHS, 30);
        Match THvsMU = new Match(TH, MU, 30);
        Match WHUvsWW = new Match(WHU, WW, 30);
        Match ETvsLP = new Match(ET, LP, 30);
        Match[] matchesS19_20R30 = {BTvsASN,MCvsBL,WFvsLC,BMvsCP,NUvsSU,NCvsSA,AVvsCHS,THvsMU,WHUvsWW,ETvsLP};
        Round roundS19_20R30 = new Round(matchesS19_20R30);
        for (Match m : roundS19_20R30.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 31
        Match THvsWHU = new Match(TH, WHU, 31);
        Match BLvsWF = new Match(BL, WF, 31);
        Match CHSvsMC = new Match(CHS, MC, 31);
        Match LPvsCP = new Match(LP, CP, 31);
        Match NUvsAV = new Match(NU, AV, 31);
        Match NCvsET = new Match(NC, ET, 31);
        Match LCvsBT = new Match(LC, BT, 31);
        Match MUvsSU = new Match(MU, SU, 31);
        Match SAvsASN = new Match(SA, ASN, 31);
        Match WWvsBM = new Match(WW, BM, 31);
        Match[] matchesS19_20R31 = {THvsWHU,BLvsWF,CHSvsMC,LPvsCP,NUvsAV,NCvsET,LCvsBT,MUvsSU,SAvsASN,WWvsBM};
        Round roundS19_20R31 = new Round(matchesS19_20R31);
        for (Match m : roundS19_20R31.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 32
        Match m320 = new Match(BM, NU, 32);
        Match m321 = new Match(ASN, NC, 32);
        Match m322 = new Match(AV, WW, 32);
        Match m323 = new Match(BT, MU, 32);
        Match m324 = new Match(CP, BL, 32);
        Match m325 = new Match(SU, TH, 32);
        Match m326 = new Match(WF, SA, 32);
        Match m327 = new Match(MC, LP, 32);
        Match m328 = new Match(WHU, CHS, 32);
        Match m329 = new Match(ET, LC, 32);
        Match[] matchesS19_20R32 = {m320,m321,m322,m323,m324,m325,m326,m327,m328,m329};
        Round roundS19_20R32 = new Round(matchesS19_20R32);
        for (Match m : roundS19_20R32.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 33
        Match m330 = new Match(NU, WHU, 33);
        Match m331 = new Match(BL, SU, 33);
        Match m332 = new Match(LC, CP, 33);
        Match m333 = new Match(MU, BM, 33);
        Match m334 = new Match(NC, BT, 33);
        Match m335 = new Match(SA, MC, 33);
        Match m336 = new Match(TH, ET, 33);
        Match m337 = new Match(CHS, WF, 33);
        Match m338 = new Match(LP, AV, 33);
        Match m339 = new Match(WW, ASN, 33);
        Match[] matchesS19_20R33 = {m330,m331,m332,m333,m334,m335,m336,m337,m338,m339};
        Round roundS19_20R33 = new Round(matchesS19_20R33);
        for (Match m : roundS19_20R33.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 34
        Match m340 = new Match(BM, TH, 34);
        Match m341 = new Match(ASN, LC, 34);
        Match m342 = new Match(CP, CHS, 34);
        Match m343 = new Match(ET, SA, 34);
        Match m344 = new Match(MC, NU, 34);
        Match m345 = new Match(WF, NC, 34);
        Match m346 = new Match(WHU, BL, 34);
        Match m347 = new Match(AV, MU, 34);
        Match m348 = new Match(SU, WW, 34);
        Match m349 = new Match(BT, LP, 34);
        Match[] matchesS19_20R34 = {m340,m341,m342,m343,m344,m345,m346,m347,m348,m349};
        Round roundS19_20R34 = new Round(matchesS19_20R34);
        for (Match m : roundS19_20R34.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 35
        Match m350 = new Match(BM, LC, 35);
        Match m351 = new Match(BT, MC, 35);
        Match m352 = new Match(LP, BL, 35);
        Match m353 = new Match(MU, SA, 35);
        Match m354 = new Match(NC, WHU, 35);
        Match m355 = new Match(WF, NU, 35);
        Match m356 = new Match(WW, ET, 35);
        Match m357 = new Match(SU, CHS, 35);
        Match m358 = new Match(TH, ASN, 35);
        Match m359 = new Match(AV, CP, 35);
        Match[] matchesS19_20R35 = {m350,m351,m352,m353,m354,m355,m356,m357,m358,m359};
        Round roundS19_20R35 = new Round(matchesS19_20R35);
        for (Match m : roundS19_20R35.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 36
        Match m360 = new Match(ASN, LP, 36);
        Match m361 = new Match(BL, WW, 36);
        Match m362 = new Match(CHS, NC, 36);
        Match m363 = new Match(CP, MU, 36);
        Match m364 = new Match(ET, AV, 36);
        Match m365 = new Match(LC, SU, 36);
        Match m366 = new Match(MC, BM, 36);
        Match m367 = new Match(NU, TH, 36);
        Match m368 = new Match(SA, BT, 36);
        Match m369 = new Match(WHU, WF, 36);
        Match[] matchesS19_20R36 = {m360,m361,m362,m363,m364,m365,m366,m367,m368,m369};
        Round roundS19_20R36 = new Round(matchesS19_20R36);
        for (Match m : roundS19_20R36.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 37
        Match m370 = new Match(AV, ASN, 37);
        Match m371 = new Match(BM, SA, 37);
        Match m372 = new Match(BT, NU, 37);
        Match m373 = new Match(LP, CHS, 37);
        Match m374 = new Match(MU, WHU, 37);
        Match m375 = new Match(NC, BL, 37);
        Match m376 = new Match(SU, ET, 37);
        Match m377 = new Match(TH, LC, 37);
        Match m378 = new Match(WF, MC, 37);
        Match m379 = new Match(WW, CP, 37);
        Match[] matchesS19_20R37 = {m370,m371,m372,m373,m374,m375,m376,m377,m378,m379};
        Round roundS19_20R37 = new Round(matchesS19_20R37);
        for (Match m : roundS19_20R37.getMatches()) {
            ELOUtils.kickOff(m);
        }
        //Round 38
        Match m380 = new Match(ASN, WF, 38);
        Match m381 = new Match(BL, BT, 38);
        Match m382 = new Match(CHS, WW, 38);
        Match m383 = new Match(CP, TH, 38);
        Match m384 = new Match(ET, BM, 38);
        Match m385 = new Match(LC, MU, 38);
        Match m386 = new Match(MC, NC, 38);
        Match m387 = new Match(NU, LP, 38);
        Match m388 = new Match(SA, SU, 38);
        Match m389 = new Match(WHU, AV, 38);
        Match[] matchesS19_20R38 = {m380,m381,m382,m383,m384,m385,m386,m387,m388,m389};
        Round roundS19_20R38 = new Round(matchesS19_20R38);
        for (Match m : roundS19_20R38.getMatches()) {
            ELOUtils.kickOff(m);
        }

        Collections.sort(teamsS19_20);
        System.out.println("  Team                         Win     Draw    Lose    Points");
        System.out.println("-------------------------------------------------------------");
        for (Team t : teamsS19_20) {
            System.out.println(t);
        }
    }
}
