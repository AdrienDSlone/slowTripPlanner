package fr.slowStripPlanner.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "parcours")
public class Parcours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parcours_id;
    @Column
    private String nomParcours;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private Date dateDepart;
    @Column
    private Date dateFin;
    @Column
    private int nombreJour;

    public Parcours() {
    }

    public Long getParcours_id() {
        return parcours_id;
    }

    public void setParcours_id(Long parcours_id) {
        this.parcours_id = parcours_id;
    }

    public String getNomParcours() {
        return nomParcours;
    }

    public void setNomParcours(String nomParcours) {
        this.nomParcours = nomParcours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNombreJour() {
        return nombreJour;
    }

    public void setNombreJour(int nombreJour) {
        this.nombreJour = nombreJour;
    }

    @Override
    public String toString() {
        return "Parcours{" +
                "parcours_id=" + parcours_id +
                ", nomParcours='" + nomParcours + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", dateDepart=" + dateDepart +
                ", dateFin=" + dateFin +
                ", nombreJour=" + nombreJour +
                '}';
    }
}
