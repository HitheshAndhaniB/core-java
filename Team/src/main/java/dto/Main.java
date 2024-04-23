package dto;


import com.xworkz.JPA.IplTeamRepo;
import com.xworkz.JPA.IplTeamRepoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
        Team team = new Team();
        team.setName("RCB");
        team.setCaptain("Kohli");
        team.setCountry("India");
        team.setCategoryType("cricket");

        IplTeamRepo iplTeamRepo = new IplTeamRepoImpl();
        iplTeamRepo.save(team);
        }
    }

