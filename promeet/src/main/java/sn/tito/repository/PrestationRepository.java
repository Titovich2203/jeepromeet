package sn.tito.repository;

import sn.tito.domain.Prestation;

public interface PrestationRepository {
    Prestation[] getAll();
    Prestation getById(int id);
}
