package com.Rank;

import com.League.MatchResult;
import com.League.Team;

import java.util.HashMap;

public class Training {

    public static MatchResult HW = new MatchResult(3);
    public static MatchResult D = new MatchResult(1);
    public static MatchResult AW = new MatchResult(0);
    public static HashMap<Integer, int[]> relationship = new HashMap<>();

    public static HashMap<String, Team> initTeams(String f) {
        HashMap<String, Team> teams = new HashMap<>();
        for(int i = 1; i < 11; i++) {
            for (int j = 1; j < 3; j++) {
                ReadFile.readBox(i, j, f);
                teams.put(ReadFile.getResult(), new Team(ReadFile.getResult()));
            }
        }
        return teams;
    }

    public static void relationStat(HashMap<String, Team> t, HashMap<Integer, int[]> r, String f) {
        for(int i = 1; i < 381; i++) {
            ReadFile.readLine(i, f);
            String[] match = ReadFile.getLineResult();
            String home = match[1];
            String away = match[2];
            String result = match[3];
            int homePiontPer100Match = t.get(home).getPointPer100Match();
            int awayPiontPer100Match = t.get(away).getPointPer100Match();
            if(!r.containsKey(homePiontPer100Match - awayPiontPer100Match)) {
                r.put(homePiontPer100Match - awayPiontPer100Match, new int[3]);
                if(result.equals("H"))      r.get(homePiontPer100Match - awayPiontPer100Match)[0]++;
                else if(result.equals("D")) r.get(homePiontPer100Match - awayPiontPer100Match)[1]++;
                else                        r.get(homePiontPer100Match - awayPiontPer100Match)[2]++;
            }
            else {
                if(result.equals("H"))      r.get(homePiontPer100Match - awayPiontPer100Match)[0]++;
                else if(result.equals("D")) r.get(homePiontPer100Match - awayPiontPer100Match)[1]++;
                else                        r.get(homePiontPer100Match - awayPiontPer100Match)[2]++;
            }
            if(result.equals("H")) {
                t.get(home).win();
                t.get(away).lose();
            }
            else if(result.equals("D")) {
                t.get(home).draw();
                t.get(away).draw();
            }
            else {
                t.get(home).lose();
                t.get(away).win();
            }
        }
    }

    //Test for Training
    public static void main(String[] args) {
        HashMap<String, Team> teams2000 = initTeams("datasets/2000-2001.csv");
        HashMap<String, Team> teams2001 = initTeams("datasets/2001-2002.csv");
        HashMap<String, Team> teams2002 = initTeams("datasets/2002-2003.csv");
        HashMap<String, Team> teams2003 = initTeams("datasets/2003-2004.csv");
        HashMap<String, Team> teams2004 = initTeams("datasets/2004-2005.csv");
        HashMap<String, Team> teams2005 = initTeams("datasets/2005-2006.csv");
        HashMap<String, Team> teams2006 = initTeams("datasets/2006-2007.csv");
        HashMap<String, Team> teams2007 = initTeams("datasets/2007-2008.csv");
        HashMap<String, Team> teams2008 = initTeams("datasets/2008-2009.csv");
        HashMap<String, Team> teams2009 = initTeams("datasets/2009-2010.csv");
        HashMap<String, Team> teams2010 = initTeams("datasets/2010-2011.csv");
        HashMap<String, Team> teams2011 = initTeams("datasets/2011-2012.csv");
        HashMap<String, Team> teams2012 = initTeams("datasets/2012-2013.csv");
        HashMap<String, Team> teams2013 = initTeams("datasets/2013-2014.csv");
        HashMap<String, Team> teams2014 = initTeams("datasets/2014-2015.csv");
        HashMap<String, Team> teams2015 = initTeams("datasets/2015-2016.csv");
        HashMap<String, Team> teams2016 = initTeams("datasets/2016-2017.csv");
        HashMap<String, Team> teams2017 = initTeams("datasets/2017-2018.csv");
        HashMap<String, Team> teams2018 = initTeams("datasets/2018-2019.csv");

        relationStat(teams2000, relationship, "datasets/2000-2001.csv");
        relationStat(teams2001, relationship, "datasets/2001-2002.csv");
        relationStat(teams2002, relationship, "datasets/2002-2003.csv");
        relationStat(teams2003, relationship, "datasets/2003-2004.csv");
        relationStat(teams2004, relationship, "datasets/2004-2005.csv");
        relationStat(teams2005, relationship, "datasets/2005-2006.csv");
        relationStat(teams2006, relationship, "datasets/2006-2007.csv");
        relationStat(teams2007, relationship, "datasets/2007-2008.csv");
        relationStat(teams2008, relationship, "datasets/2008-2009.csv");
        relationStat(teams2009, relationship, "datasets/2009-2010.csv");
        relationStat(teams2010, relationship, "datasets/2010-2011.csv");
        relationStat(teams2011, relationship, "datasets/2011-2012.csv");
        relationStat(teams2012, relationship, "datasets/2012-2013.csv");
        relationStat(teams2013, relationship, "datasets/2013-2014.csv");
        relationStat(teams2014, relationship, "datasets/2014-2015.csv");
        relationStat(teams2015, relationship, "datasets/2015-2016.csv");
        relationStat(teams2016, relationship, "datasets/2016-2017.csv");
        relationStat(teams2017, relationship, "datasets/2017-2018.csv");
        relationStat(teams2018, relationship, "datasets/2018-2019.csv");
        HashMapSort.sortandPrintHashMap(relationship);
        WriteFile.WriteRelationship(relationship);
    }
}
