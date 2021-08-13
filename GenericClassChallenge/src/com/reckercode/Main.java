package com.reckercode;

public class Main {

    public static void main(String[] args) {
	    LeagueTable<Team<FootballPlayer>> footballTeam = new LeagueTable<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer>melbourne  = new Team<>("Melbourne");
        Team<FootballPlayer>hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer>fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer>baseballTeam = new Team<>("Chicago cubs");

        footballTeam.addTeam(adelaideCrows);
        footballTeam.addTeam(melbourne);
        footballTeam.addTeam(hawthorn);
        footballTeam.addTeam(fremantle);
        footballTeam.addTeam(melbourne);

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(adelaideCrows, 3,8);
        adelaideCrows.matchResult( fremantle,2,1);

        footballTeam.showLeagueTable();


        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccorPlayer bechkam = new SoccorPlayer("Bechkam");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(bechkam);
        rawTeam.addPlayer(pat);

        footballTeam.addTeam(rawTeam);

        LeagueTable< Team> rawLeague = new LeagueTable<>("Raw");
        rawLeague.addTeam(adelaideCrows);
        rawLeague.addTeam(baseballTeam);
        rawLeague.addTeam(rawTeam);

        LeagueTable reallyRaw = new LeagueTable("Really Raw");
        reallyRaw.addTeam(adelaideCrows);
        reallyRaw.addTeam(baseballTeam);
        reallyRaw.addTeam(rawTeam);



//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(adelaideCrows.compareTo(fremantle));
//
//        System.out.println(fremantle.compareTo(adelaideCrows));
//        System.out.println(fremantle.compareTo(hawthorn));
//        System.out.println(fremantle.compareTo(melbourne));
//
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
    }
}
