package dto;

import javax.persistence.*;

@Entity
@Table(name = "team")
@NamedQuery(name = "updateCaptain" , query = "update Team set captain = :captain where name = :teamName")
@NamedQuery(name = "daleteTeam", query = "delete from Team where name = :teamName")
public class Team {


    public  Team(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String country;
    private String captain;
    private int no_of_players;

    private int noOfMatches;

    public long getNo_of_players() {
        return no_of_players;
    }

    public void setNo_of_players(int no_of_players) {
        this.no_of_players = no_of_players;
    }

    @Column(name = "category_type")
    private String categoryType;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCaptain() {
        return captain;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }
}
