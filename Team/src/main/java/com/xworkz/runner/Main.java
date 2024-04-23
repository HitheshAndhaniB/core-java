package com.xworkz.runner;

import com.xworkz.JPA.IplTeamRepo;
import com.xworkz.JPA.IplTeamRepoImpl;
import dto.Team;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Team team = new Team();
//        team.setName("RCB");
//        team.setCaptain("Kohli");
//        team.setCountry("India");
//        team.setCategoryType("cricket");
//
//        IplTeamRepo iplTeamRepo = new IplTeamRepoImpl();
//        iplTeamRepo.save(team);

//        Team team1 = iplTeamRepo.find(2);
//        System.out.println(team1.getName());

//        iplTeamRepo.update(2,"Mi");
//
//        iplTeamRepo.delete(8);
//        iplTeamRepo.delete(9);
//        iplTeamRepo.delete(10);
//        iplTeamRepo.delete(11);

//
//        Team team2 = new Team();
//        team2.setName("KKR");
//        team2.setCaptain("Nithesh Rana");
//        team2.setCountry("India");
//        team2.setCategoryType("cricket");
//
//
//        Team team3 = new Team();
//        team3.setName("CSK");
//        team3.setCaptain("Dhoni");
//        team3.setCountry("India");
//        team3.setCategoryType("cricket");
//
//        List<Team> list = new ArrayList<Team>();
//        list.add(team);
//        list.add(team1);
//        list.add(team2);
//        list.add(team3);
//        iplTeamRepo.saveAll(list);

        IplTeamRepo iplTeamRepo = new IplTeamRepoImpl();
//        long recordCount = iplTeamRepo.countRecords();
//        System.out.println("Total number of records in the database: " + recordCount);

//        iplTeamRepo.countNoOfPlayers();
//        iplTeamRepo.findByCategoryType("cricket");
//        iplTeamRepo.findByName("RCB");

//
//        List<String> list1 = new ArrayList<>();
//        list1.add("KKR");
//        list1.add("Mi");
//        iplTeamRepo.fetchTeamByNames(list1);

//        iplTeamRepo.findCapitalAndCategoryTypeByTeamName("RCB");

//        iplTeamRepo.findCapitalByTeamName("RCB");
//        iplTeamRepo.updateCaptainByTeamName("Mi","Rohit");
//          iplTeamRepo.deleteTeamByName("Mi");

//        iplTeamRepo.totalNoOfMatchs();

//        iplTeamRepo.countMatchsWinByCategory();

//        iplTeamRepo.getAllTeams();
//        iplTeamRepo.getCaptains();

//        iplTeamRepo.getCaptainAndName();

        iplTeamRepo.getTeamByNameMathes("cri");
    }
    }

