package org.example.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ACTOR_DATA")
public class Actor {
    @Id
    @GeneratedValue
    private int id;

    private String first_name;
    private String last_name;

    @OneToMany
    private List<Character> characters= new ArrayList<>();
}
