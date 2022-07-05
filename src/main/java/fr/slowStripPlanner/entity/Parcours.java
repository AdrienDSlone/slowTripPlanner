package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table
public class Parcours {
    @Id
    private Long parcours_id;
    private String nomParcours;
    private String description;
    private String image;
    private Date dateDepart;
    private Date dateFin;
    private int nombreJour;
}
