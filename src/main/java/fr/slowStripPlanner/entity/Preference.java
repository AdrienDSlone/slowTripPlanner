package fr.slowStripPlanner.entity;

import javax.persistence.*;

@Entity
@Table(name = "preference")
public class Preference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long preference_id;
    @Column
    private int kilometrageEtapeMoyenne;

}
