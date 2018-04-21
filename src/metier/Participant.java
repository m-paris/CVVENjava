/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Participant
 *
 * @author Clément BOIN
 */
@Entity
@Table(name = "participant", schema ="java")

public class Participant implements Serializable{

    //Numéro de participant
    @Id
    @GeneratedValue
    @Column(name = "num_pers")
    private int num_pers;

    // Nom du participant
    @Column(name = "nom")
    private String nom;

    // Prénom du participant
    @Column(name = "prenom")
    private String prenom;
    
    // Organisation dont fait partie le participant
    @Column(name = "email")
    private String email;
    
    @Column(name = "date_naiss")
    private String date;
    
    // Organisation dont fait partie le participant
    @Column(name = "organisation")
    private String organisation;
    
    // Organisation dont fait partie le participant
    @Column(name = "observations")
    private String observations;
    
    @Column(name = "role_idrole")
    private int role_idRole;
    
    @Column(name = "login")
    private String login;
    
    // Organisation dont fait partie le participant
    @Column(name = "password")
    private String password;

    

    public Participant() {
    }

    public Participant(String nom, String prenom, String email, String date, String organisation, String observations, String login, String password) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date = date;
        this.organisation = organisation;
        this.observations = observations;
        
        this.login = login;
        this.password = password;
    }

    

    

    public int getNum_pers() {
        return num_pers;
    }

    public void setNum_pers(int num_pers) {
        this.num_pers = num_pers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRole_idRole() {
        return role_idRole;
    }

    public void setRole_idRole(int role_idRole) {
        this.role_idRole = role_idRole;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    
    
    


}