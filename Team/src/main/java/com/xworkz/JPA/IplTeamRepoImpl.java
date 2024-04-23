package com.xworkz.JPA;

import dto.Team;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class IplTeamRepoImpl implements IplTeamRepo{
    @Override
    public void save(Team team) {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        System.out.println("loading persistence xml file");
        try{
            entityTransaction.begin();
            entityManager.persist(team);
            entityTransaction.commit();
            System.out.println("data inserted successfully");
        }catch (Exception e){
            System.out.println("Exception while inserting data!!!!!");
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public Team find(Integer id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("Loding persistence xml file...");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Team team = entityManager.find(Team.class,id);
        return team;

    }

    @Override
    public void update(Integer id, String teamName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("Loding persistence xml file...");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            entityTransaction.begin();
            Team team = entityManager.find(Team.class,id);
            team.setName(teamName);
            entityTransaction.commit();
            System.out.println("update teamName by id :"+id);
        } catch (Exception e) {
            System.out.println("Exception while updationg data......");
            entityTransaction.rollback();
            throw new RuntimeException(e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }

    @Override
    public void delete(Integer id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("Loding persistence xml file...");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            entityTransaction.begin();
            Team team = entityManager.find(Team.class,id);
            entityManager.remove(team);
            entityTransaction.commit();
            System.out.println("delete by id :"+id);
        }catch (Exception e){
            System.out.println("Exception while deleteing data.....");
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }

    @Override
    public void saveAll(List<Team> teams) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("Loding persistence xml file...");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            for(Team team : teams){
                entityManager.persist(team);
            }
            entityTransaction.commit();
        } catch (Exception e) {
            System.out.println("Exception while saving all data....");
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public Team findByName(String name) {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
       EntityManager entityManager = entityManagerFactory.createEntityManager();

       try {
           Query query = entityManager.createQuery("select t from Team t where name = :teamname");
           query.setParameter("teamname", name);
           Team team = (Team) query.getSingleResult();
           System.out.println("Team name " + team.getName());
           return team;
       }catch (Exception e){
           System.out.println("Exception while getting an record.......");
       }finally {
           entityManager.close();
           entityManagerFactory.close();
       }
        return null;
    }

    @Override
    public List<Team> findByCategoryType(String categoryType) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createQuery("select  t from Team t where categoryType = :type");
            query.setParameter("type", categoryType);
            List<Team> teams = (List<Team>) query.getResultList();
            teams.forEach(x -> {
                System.out.println("team details.....");
                System.out.println(x.getName());
                System.out.println(x.getCaptain());
            });
            return teams;
        } catch (Exception e) {
            System.out.println("Exception while getting record....."+e);
        }finally {
            entityManagerFactory.close();
            entityManager.close();
        }
        return null;
    }

    @Override
    public long countRecords() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery("SELECT COUNT(t) FROM Team t");
            long recordCount = (long) query.getSingleResult();
            System.out.println("Number of records in the database: " + recordCount);
            return recordCount;
        } catch (Exception e) {
            System.out.println("Exception while counting records: " + e.getMessage());
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return 0;
    }

    @Override
    public Team countNoOfPlayers() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            Query query = entityManager.createQuery("select sum(no_of_players) from Team");
            Long noOfPlayers =(Long) query.getSingleResult();
            System.out.println("Total no of player..."+noOfPlayers);

        } catch (Exception e) {
            System.out.println("Exception while getting players"+e.getMessage());
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        return null;
    }

    @Override
    public String findCapitalByTeamName(String teamName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            Query query = entityManager.createQuery("select captain from Team where name = :teamName");
            query.setParameter("teamName",teamName);
            Object result = query.getResultList();
            System.out.println("Capital is :"+result);

        }catch (Exception e){
            System.out.println("Exception while getting capital"+e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();;
        }
        return null;
    }

    @Override
    public String findCapitalAndCategoryTypeByTeamName(String teamName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            Query query = entityManager.createQuery("select captain,categoryType from Team where name = :teamName");
            query.setParameter("teamName",teamName);
           List<Object[]> list=(List<Object[]>)query.getResultList();
            System.out.println("Team details .......");
            for (Object[] object:list
                 ) {
                for (Object obj:object
                     ) {
                    System.out.println(obj);
                }
            }
        }catch (Exception e){
            System.out.println("Exception while getting data...."+e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }


    @Override
    public List<String> fetchTeamByNames(List<String> names) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery("select t from Team t where name in :names1");
            query.setParameter("names1", names);
            List<Team> teams = (List<Team>) query.getResultList();
            teams.forEach(x-> System.out.println("Team name :"+x.getName()+"captain "+x.getCaptain()+"category :"+x.getCountry()));

        }catch (Exception e) {
            System.out.println("Exception while fething teams by names :"+ e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }

    @Override
    public List<String[]> fetchAllCaptainAndCategoryType() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            Query query = entityManager.createQuery("select capital, catagory_type from Team");
            List<Object[]> list = (List<Object[]>) query.getResultList();
            for(Object[] obj:list){
                for(Object o:obj){
                    System.out.println(o);
                }
            }
        }catch (Exception e){
            System.out.println("Execption while getting "+e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }

    @Override
    public int updateCaptainByTeamName(String teamName, String captain) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        try{
            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("updateCaptain");
            query.setParameter("captain",captain);
            query.setParameter("teamName",teamName);
            int value = query.executeUpdate();
            System.out.println(value);
            entityTransaction.commit();
            return value;
        }catch (Exception e){
            System.out.println("Exceptioin while updating data..."+e);
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return 0;
    }

    @Override
    public int deleteTeamByName(String teamName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("daleteTeam");
            query.setParameter("teamName",teamName);
            int value = query.executeUpdate();
            entityTransaction.commit();
            System.out.println(value);
            return value;
        }catch (Exception e){
            System.out.println("Exception while deleting data....."+e);
            entityTransaction.rollback();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        return 0;
    }

    @Override
    public void totalNoOfMatchs() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery("SELECT t FROM Team t WHERE t.noOfMatches BETWEEN 10 AND 20");
            List<Team> Matches = query.getResultList();
            Matches.forEach(x-> System.out.println(x.getName()));
        }catch (Exception e){
            System.out.println("Exception while getting records :"+e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public void countMatchsWinByCategory() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createQuery("select count(categoryType),categoryType from Team t group by categoryType");
             List<Object[]> categoryType = (List<Object[]>) query.getResultList();
            for (Object[] o :categoryType
                 ) {
                for (Object v :o
                     ) {
                    System.out.println(v);
                }
            }
        }catch (Exception e){
            System.out.println("Exception while getting data......"+e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public void getAllTeams() {
       EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("com.xworkz");
       EntityManager entityManager = entityManagerFactory.createEntityManager();

       try {
           CriteriaBuilder c = entityManager.getCriteriaBuilder();
           CriteriaQuery criteriaQuery = c.createQuery(Team.class);
           Root<Team> root = criteriaQuery.from(Team.class);
           CriteriaQuery<Team> team = criteriaQuery.select(root);
           Query query = entityManager.createQuery(team);
           List<Team> list = query.getResultList();
           list.forEach(x-> System.out.println(x.getName()));

       }catch (Exception e){
           System.out.println("Exception while getting a team names....."+e);
       }finally {
           entityManager.close();
           entityManagerFactory.close();
       }
    }

    @Override
    public void getCaptains() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
           CriteriaBuilder criteriaBuilder =  entityManager.getCriteriaBuilder();
           CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Team.class);
           Root<Team> root = criteriaQuery.from(Team.class);
           CriteriaQuery<Team> criteriaQuery1 = criteriaQuery.select(root.get("captain"));
           Query query = entityManager.createQuery(criteriaQuery1);
           List<String> list = query.getResultList();
           list.forEach(x-> System.out.println(x));

        }catch (Exception e ){
            System.out.println("Exception while getting captains..."+e);
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public void getCaptainAndName() {
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
       EntityManager entityManager = entityManagerFactory.createEntityManager();

       try{
           CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
           CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Object[].class);
           Root<Team> root = criteriaQuery.from(Team.class);
           CriteriaQuery query = criteriaQuery.multiselect(root.get("name"),root.get("captain"));
           Query query1 = entityManager.createQuery(query);
           List<Object[]> list = query1.getResultList();
           System.out.println("Printing multiple column from team...");
           for (Object[] o :list
                ) {
               for (Object s : o
                    ) {
                   System.out.print(s+" ");
               }
               System.out.println();
           }
       }catch (Exception e){
           System.out.println("Exception while getting captain and name..."+e);
       }finally {
           entityManager.close();
           entityManagerFactory.close();
       }
    }

    @Override
    public Team getTeamByNameMathes(String teamName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Team.class);
            Root<Team> root = criteriaQuery.from(Team.class);
            CriteriaQuery query = criteriaQuery.where(criteriaBuilder.like(root.get("name"),teamName + "%"));
            Query query1 = entityManager.createQuery(query);
            List<Team> teams = query1.getResultList();
            teams.stream().filter(x->x.getCategoryType().equals("criket")).map(x->x.getName())
                    .forEach(x->{
                        System.out.println(x);
                    });
            for (Team t : teams
                    ) {if (t.getCategoryType().equals("criket"))
                System.out.println(t.getName());
            }
        }catch (Exception e){

        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }
}
