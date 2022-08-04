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


}
