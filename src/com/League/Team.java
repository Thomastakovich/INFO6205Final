package com.League;

public class Team implements Comparable<Team>{
    private int id;
    private String name;
    private int w; //Win
    private int d; //Draw
    private int l; //Lose
    private int point;
    private double expectationPoint;
    private int finishedMatch;

    public Team(int id, String name,int w, int d, int l, int point, int finishedMatch) {
        this.id = id;
        this.name = name;
        this.w = w;
        this.d = d;
        this.l = l;
        this.point = point;
        this.finishedMatch = finishedMatch;
        this.expectationPoint = point;
    }

    public Team(int id, String name,int w, int d, int l) {
        this.id = id;
        this.name = name;
        this.w = w;
        this.d = d;
        this.l = l;
        this.point = 3 * w + 1 * d;
        this.finishedMatch = w + d + l;
        this.expectationPoint = point;
    }

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.w = 0;
        this.d = 0;
        this.l = 0;
        this.point = 0;
        this.finishedMatch = 0;
        this.expectationPoint = point;
    }

    public Team(String name) {
        this.id = 0;
        this.name = name;
        this.w = 0;
        this.d = 0;
        this.l = 0;
        this.point = 0;
        this.finishedMatch = 0;
        this.expectationPoint = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        w = w;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        d = d;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        l = l;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getFinishedMatch() {
        return finishedMatch;
    }

    public void setFinishedMatch(int finishedMatch) {
        this.finishedMatch = finishedMatch;
    }

    public double getExpectationPoint() {
        return expectationPoint;
    }

    public void setExpectationPoint(double expectationPoint) {
        this.expectationPoint = expectationPoint;
    }

    public double getPointPerMatch() {

        return finishedMatch == 0 ? 0 : new Double(point) / new Double(finishedMatch);
    }

    public int getPointPer5Match() {
        return finishedMatch == 0 ? 0 : point * 5 / finishedMatch;
    }

    public void win() {
        this.w++;
        this.point += 3;
        this.finishedMatch++;
    }

    public void draw() {
        this.d++;
        this.point += 1;
        this.finishedMatch++;
    }

    public void lose() {
        this.l++;
        this.finishedMatch++;
    }

    @Override
    public int compareTo(Team t) {
        return t.getPoint() - this.getPoint();
    }

    @Override
    public String toString() {
        return this.getName() + " ***** " + this.getW() + " ***** " + this.getD() + " ***** " + this.getL() + " ***** " + this.getPoint();
    }

    //Test for Class
    public static void main(String[]args) {
        Team t1 = new Team("t1");
        t1.win();
        t1.draw();
        System.out.println(t1.w);
        System.out.println(t1.getPoint());
        System.out.println(t1.getPointPerMatch());
    }
}
