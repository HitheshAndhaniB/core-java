package com.xworkz.JPA;

import dto.Team;

import java.util.List;

public interface IplTeamRepo {

    public  void save(Team team);

    public Team find(Integer id);

    public void update(Integer id,String teamName);

    public void delete(Integer id);

    public void saveAll(List<Team> teams);

    public Team findByName(String name);

    public List<Team> findByCategoryType(String categoryType);

    public long countRecords();

    public Team countNoOfPlayers();

    public String findCapitalByTeamName(String teamName);

    public String findCapitalAndCategoryTypeByTeamName(String teamName);

    public List<String> fetchTeamByNames(List<String> names);

    public List<String[]> fetchAllCaptainAndCategoryType();

    public int updateCaptainByTeamName(String teamName,String captain);

    public int deleteTeamByName(String teamName);

    public void totalNoOfMatchs();

    public void countMatchsWinByCategory();

    public void getAllTeams();

    public void getCaptains();

    public  void  getCaptainAndName();

    public Team getTeamByNameMathes(String teamName);


}
