package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="SHOW_DATA")
public class Show {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String showDay;
    private String season;
    private String genre;

    @OneToMany(mappedBy = "show")
    private List<Character> characters= new ArrayList<>();

    @ManyToOne
    private Network network;

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

    public String getShowDay() {
        return showDay;
    }

    public void setShowDay(String showDay) {
        this.showDay = showDay;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
}
