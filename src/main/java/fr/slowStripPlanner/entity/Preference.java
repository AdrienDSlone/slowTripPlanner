package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Preference {
    @Id
    private Long preference_id;
    private int kilometrageEtapeMoyenne;

}
