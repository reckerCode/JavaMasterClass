package com.reckercode;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable <T extends Team>{
    public String name;
    private final ArrayList<T> league = new ArrayList<>();
    public LeagueTable(String name) {
        this.name = name;
    }
    public boolean addTeam(T team){
        if(league.contains(team)){
            System.out.println(team.getName()+" already added in to the league");
            return false;
        }
        league.add(team);
        return true;
    }
    public void showLeagueTable(){
        Collections.sort(league);
        for (T t:league){
            System.out.println(t.getName()+" : "+t.ranking());
        }

    }
}

