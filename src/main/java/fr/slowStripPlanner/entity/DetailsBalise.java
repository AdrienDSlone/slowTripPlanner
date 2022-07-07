package fr.slowStripPlanner.entity;

import javax.persistence.*;
import java.util.Timer;
@Entity
@Table(name = "detailBalise")
public class DetailsBalise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long detailsBalise_id;
    @Column
    private boolean estJourDeRepos;
    @Column
    private boolean estPassageOblige;
    @Column
    private int heureDepart;
    @Column
    private int heureArrivee;
    @Column
    private String typeLogement;
    @Column
    private String adresse;
    @Column
    private String description;
    @Column
    private Double budget;
    @Column
    private String repas;
    @Column
    private String particopants;
    @Column
    private int elevationPositif;
    @Column
    private int elevationNegatif;
    private Balise balise;

    public DetailsBalise() {
    }

    public DetailsBalise(Long detailsBalise_id, boolean estJourDeRepos, boolean estPassageOblige, int heureDepart, int heureArrivee, String typeLogement, String adresse, String description, Double budget, String repas, String particopants, int elevationPositif, int elevationNegatif, Balise balise) {
        this.detailsBalise_id = detailsBalise_id;
        this.estJourDeRepos = estJourDeRepos;
        this.estPassageOblige = estPassageOblige;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.typeLogement = typeLogement;
        this.adresse = adresse;
        this.description = description;
        this.budget = budget;
        this.repas = repas;
        this.particopants = particopants;
        this.elevationPositif = elevationPositif;
        this.elevationNegatif = elevationNegatif;
        this.balise = balise;
    }

    public Long getDetailsBalise_id() {
        return detailsBalise_id;
    }

    public void setDetailsBalise_id(Long detailsBalise_id) {
        this.detailsBalise_id = detailsBalise_id;
    }

    public boolean isEstJourDeRepos() {
        return estJourDeRepos;
    }

    public void setEstJourDeRepos(boolean estJourDeRepos) {
        this.estJourDeRepos = estJourDeRepos;
    }

    public boolean isEstPassageOblige() {
        return estPassageOblige;
    }

    public void setEstPassageOblige(boolean estPassageOblige) {
        this.estPassageOblige = estPassageOblige;
    }

    public int getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(int heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(int heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public String getTypeLogement() {
        return typeLogement;
    }

    public void setTypeLogement(String typeLogement) {
        this.typeLogement = typeLogement;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getRepas() {
        return repas;
    }

    public void setRepas(String repas) {
        this.repas = repas;
    }

    public String getParticopants() {
        return particopants;
    }

    public void setParticopants(String particopants) {
        this.particopants = particopants;
    }

    public int getElevationPositif() {
        return elevationPositif;
    }

    public void setElevationPositif(int elevationPositif) {
        this.elevationPositif = elevationPositif;
    }

    public int getElevationNegatif() {
        return elevationNegatif;
    }

    public void setElevationNegatif(int elevationNegatif) {
        this.elevationNegatif = elevationNegatif;
    }

    public Balise getBalise() {
        return balise;
    }

    public void setBalise(Balise balise) {
        this.balise = balise;
    }
}
