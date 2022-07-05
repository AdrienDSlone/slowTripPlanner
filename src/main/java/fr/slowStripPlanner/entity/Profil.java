package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Profil {
    @Id
    private Long profil_id;
    private String pseudo;
    private String photo_profil;

}
