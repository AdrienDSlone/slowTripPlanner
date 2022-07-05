package fr.slowStripPlanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Point {
    @Id
    private int point_id;
    private String Longitude;
    private String Latitude;
}
