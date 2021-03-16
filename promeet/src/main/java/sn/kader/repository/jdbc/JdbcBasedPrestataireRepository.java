package sn.kader.repository.jdbc;

import sn.kader.domain.Prestataire;
import sn.kader.domain.Prestation;
import sn.kader.repository.PrestataireRepository;

public class JdbcBasedPrestataireRepository implements PrestataireRepository {
    public Prestataire[] getAllByPrestation(Prestation prestation) {
        return new Prestataire[0];
    }

    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
