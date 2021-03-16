package sn.kader.repository;

import sn.kader.domain.Prestation;

public interface PrestationRepository {
    Prestation[] getAll();
    Prestation getById(int id);
}
