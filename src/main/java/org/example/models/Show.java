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
    private String day;
    private String season;
    private String genre;
    private int network_id;

    @OneToMany(mappedBy = "show")
    private List<Character> characters= new ArrayList<>();

    @ManyToOne
    private Network network;


}
