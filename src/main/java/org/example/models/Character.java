package org.example.models;

import javax.persistence.*;

@Entity
@Table(name="CHARACTER_DATA")
public class Character {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String catchphrase;

    @ManyToOne
    private Actor actor;

    @ManyToOne
    private Show show;


}
