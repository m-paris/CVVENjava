package metier;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a-derchain
 */

@Entity
@Table(name = "evenement", schema ="java")
public class Evenement implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "num_even")
    int num_even;
    
    @Column(name = "intitule")
    String intitule;
    
    @Column(name = "theme")
    String theme;
    
    @Column(name = "date_debut")
    String date_debut;
    
    @Column(name = "description")
    String description;
    
    @Column(name = "organisation")
    String organisation;
    
    @Column(name = "type_even")
    int type_even; 
    
    @Column(name = "duree")
    String duree;
    
    @Column(name = "nb_part_max")
    String nb_max_part;
    
    

    public Evenement() {
    }

    public Evenement(String intitule, String theme, String date_debut, String description, String organisation, String duree, String nb_max_part) {
        this.intitule = intitule;
        this.theme = theme;
        this.date_debut = date_debut;
        this.duree = duree;
        this.nb_max_part = nb_max_part;
        this.description = description;
        this.organisation = organisation;
        
    }

    
    
    public int getNum_even() {
        return num_even;
    }

    public void setNum_even(int num_even) {
        this.num_even = num_even;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public int getType_even() {
        return type_even;
    }

    public void setType_even(int type_even) {
        this.type_even = type_even;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getNb_max_part() {
        return nb_max_part;
    }

    public void setNb_max_part(String nb_max_part) {
        this.nb_max_part = nb_max_part;
    }

   

   
    


    
}
