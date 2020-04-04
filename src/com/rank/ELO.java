package com.rank;


public class ELO {
    public static void main(String[] args) {

        ELODemo e=new ELODemo() ;
        e.show();
        //User u=e.gamer.get(new User().level).get(0);
        //
        //for(int i=0;i<999;i++){
        //  e.play(u);
        //}
        //
        //e.show();
        //
        //System.out.println(u.rating);

        //大部分情况下总能选出一个或少数几个等级比较高的（或比较低的...） 是这个算法比较神奇还是我的程序有问题呢...
        for(int i=0;i<99999;i++){
            User u=e.randGetUser();
            e.play(u);
        }
        e.show();
    }
}
