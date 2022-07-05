package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Timer;
@Entity
@Table
public class DetailsBalise {
    @Id
    private Long detailsBalise_id;
    private boolean estJourDeRepos;
    private boolean estPassageOblige;
    private int heureDepart;
    private int heureArrivee;
    private String typeLogement;
    private String adresse;
    private String description;
    private Double budget;
    private String repas;
    private String particopants;
    private int elevationPositif;
    private int elevationNegatif;
    private Balise balise;

}
