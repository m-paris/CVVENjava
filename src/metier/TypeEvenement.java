package metier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a-derchain
 */
public class TypeEvenement {
    int idTypeEvenement;
    String intitule;

    public TypeEvenement(int idTypeEvenement, String intitule) {
        this.idTypeEvenement = idTypeEvenement;
        this.intitule = intitule;
    }

    public int getIdTypeEvenement() {
        return idTypeEvenement;
    }

    public void setIdTypeEvenement(int idTypeEvenement) {
        this.idTypeEvenement = idTypeEvenement;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    
    
}
