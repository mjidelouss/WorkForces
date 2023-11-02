package work.force.service.Imp;

import work.force.entities.Departement;
import work.force.repository.DepartementRepository;

public class DepartementServiceImp implements work.force.service.DepartementService {
    private final DepartementRepository departementRepository;
    public DepartementServiceImp(DepartementRepository departementRepository) {
        this.departementRepository = departementRepository;
    }
}
