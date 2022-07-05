package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table
public class Balise {
    @Id
    private Long balise_id;
    private String nomBalise;
    private Date dateTime;
    private Double distance;
    private boolean estVerouille;
    private Parcours parcours;
    private DetailsBalise detailsBalise;
    private Point point;
}
