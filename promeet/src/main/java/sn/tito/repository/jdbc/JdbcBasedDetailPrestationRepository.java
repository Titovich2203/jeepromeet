package sn.tito.repository.jdbc;

import sn.tito.domain.DetailPrestation;
import sn.tito.repository.DetailPrestationRepository;

public class JdbcBasedDetailPrestationRepository implements DetailPrestationRepository {
    public DetailPrestation[] getAll() {
        return new DetailPrestation[0];
    }
}
