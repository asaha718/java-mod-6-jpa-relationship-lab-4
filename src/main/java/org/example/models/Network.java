package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="NETWORK_DATA")
public class Network {
    @Id
    @GeneratedValue
    private int id;
    private String call_letters;
    private int channel;

    @OneToMany
    private List<Show> shows= new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCall_letters() {
        return call_letters;
    }

    public void setCall_letters(String call_letters) {
        this.call_letters = call_letters;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
