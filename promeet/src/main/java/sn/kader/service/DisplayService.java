package sn.kader.service;

import sn.kader.domain.Prestataire;
import sn.kader.domain.Prestation;

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
