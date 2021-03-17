package sn.tito.repository;

import sn.tito.domain.Prestataire;
import sn.tito.domain.Prestation;

public interface PrestataireRepository {
    Prestataire[] getAllByPrestation(Prestation prestation);
    Prestataire findById(int idPrestataire);
}
