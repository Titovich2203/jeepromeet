package sn.tito.repository.ram;

import sn.tito.domain.DetailPrestation;
import sn.tito.repository.DetailPrestationRepository;

public class ArrayBasedDetailPrestationRepository implements DetailPrestationRepository {
    public DetailPrestation[] getAll(){
        return new DetailPrestation[]{
                new DetailPrestation(1, "Course Rufisque", 500),
                new DetailPrestation(2, "Course Pikine", 1500),
                new DetailPrestation(3, "Course Dakar", 2500),
        };
    }
}
