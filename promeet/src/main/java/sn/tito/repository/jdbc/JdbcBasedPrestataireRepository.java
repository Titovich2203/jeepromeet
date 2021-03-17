package sn.tito.repository.jdbc;

import sn.tito.domain.Prestataire;
import sn.tito.domain.Prestation;
import sn.tito.repository.PrestataireRepository;

public class JdbcBasedPrestataireRepository implements PrestataireRepository {
    public Prestataire[] getAllByPrestation(Prestation prestation) {
        return new Prestataire[0];
    }

    public Prestataire findById(int idPrestataire) {
        return null;
    }
}
