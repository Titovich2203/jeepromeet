package sn.kader.repository.jdbc;

import sn.kader.domain.DetailPrestation;
import sn.kader.repository.DetailPrestationRepository;

public class JdbcBasedDetailPrestationRepository implements DetailPrestationRepository {
    public DetailPrestation[] getAll() {
        return new DetailPrestation[0];
    }
}
