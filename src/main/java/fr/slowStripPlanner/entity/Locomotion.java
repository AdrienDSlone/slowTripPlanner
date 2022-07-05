package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Locomotion {
    @Id
    private Long locomotion_id;
    private String libeleLoco;
    private String descriptionLoco;


}
