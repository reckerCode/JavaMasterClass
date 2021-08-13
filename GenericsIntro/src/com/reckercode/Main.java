package com.reckercode;
public class Main {

    public static void main(String[] args) {
//
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
////        items.add("recker");
//        items.add(4);
//        items.add(5);
//        printDouble(items);
//    }
//    private static void printDouble(ArrayList<Integer> items){
//        for(int i:items){
//            System.out.println(i*2);
//        }
//

//        implementing the concept of Generic Classes
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccorPlayer bechkam = new SoccorPlayer("Bechkam");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayers());


        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayers());

        Team<SoccorPlayer> soccerTeam = new Team<>("England");
        soccerTeam.addPlayer(bechkam);
        System.out.println(soccerTeam.numPlayers());

        Team<FootballPlayer>melbourne  = new Team<>("Melbourne");
        FootballPlayer bank = new FootballPlayer("Gordon");
        melbourne.addPlayer(bank);

        Team<FootballPlayer>hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer>fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows, 3,8);
        adelaideCrows.matchResult( fremantle,2,1);
        System.out.println("Ranking:");
        System.out.println(adelaideCrows.getName() +":"+ adelaideCrows.ranking());
        System.out.println(melbourne.getName()+":"+ melbourne.ranking());
        System.out.println(hawthorn.getName()+":"+ hawthorn.ranking());
        System.out.println(fremantle.getName() +":"+ fremantle.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(adelaideCrows.compareTo(fremantle));

        System.out.println(fremantle.compareTo(adelaideCrows));
        System.out.println(fremantle.compareTo(hawthorn));
        System.out.println(fremantle.compareTo(melbourne));

        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(adelaideCrows.compareTo(hawthorn));


    }
}
