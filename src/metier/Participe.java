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
public class Participe {
    Participant Participe_num_pers;
    Evenement Evenement_num_even;

    public Participe(Participant Participe_num_pers, Evenement Evenement_num_even) {
        this.Participe_num_pers = Participe_num_pers;
        this.Evenement_num_even = Evenement_num_even;
    }

    public Participant getParticipe_num_pers() {
        return Participe_num_pers;
    }

    public void setParticipe_num_pers(Participant Participe_num_pers) {
        this.Participe_num_pers = Participe_num_pers;
    }

    public Evenement getEvenement_num_even() {
        return Evenement_num_even;
    }

    public void setEvenement_num_even(Evenement Evenement_num_even) {
        this.Evenement_num_even = Evenement_num_even;
    }
    
    
}
