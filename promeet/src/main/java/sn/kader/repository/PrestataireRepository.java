package sn.kader.repository;

import sn.kader.domain.Prestataire;
import sn.kader.domain.Prestation;

public interface PrestataireRepository {
    Prestataire[] getAllByPrestation(Prestation prestation);
    Prestataire findById(int idPrestataire);
}
