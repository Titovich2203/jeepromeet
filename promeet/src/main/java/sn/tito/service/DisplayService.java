package sn.tito.service;

import sn.tito.domain.Prestataire;
import sn.tito.domain.Prestation;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeServices(Prestation[] prestations);

    void afficherPrestataires(Prestation prestation, Prestataire[] prestataires);

    void afficherDetailsPrestation();

    void afficherDetailsContrat();

    void afficherDemandeHeure();

    void afficherConfirmation(String heure);

    void afficherOptionInconnue();
}
