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
public class Possede {
    Salle Salle_idSalle;
    Evenement TypeEvenement_idTypeEvenement;

    public Possede(Salle Salle_idSalle, Evenement TypeEvenement_idTypeEvenement) {
        this.Salle_idSalle = Salle_idSalle;
        this.TypeEvenement_idTypeEvenement = TypeEvenement_idTypeEvenement;
    }

    public Salle getSalle_idSalle() {
        return Salle_idSalle;
    }

    public void setSalle_idSalle(Salle Salle_idSalle) {
        this.Salle_idSalle = Salle_idSalle;
    }

    public Evenement getTypeEvenement_idTypeEvenement() {
        return TypeEvenement_idTypeEvenement;
    }

    public void setTypeEvenement_idTypeEvenement(Evenement TypeEvenement_idTypeEvenement) {
        this.TypeEvenement_idTypeEvenement = TypeEvenement_idTypeEvenement;
    }
    
    
}
