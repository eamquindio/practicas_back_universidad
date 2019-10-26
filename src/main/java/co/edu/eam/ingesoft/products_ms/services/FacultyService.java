package co.edu.eam.ingesoft.products_ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.eam.ingesoft.products_ms.model.Faculty;
import co.edu.eam.ingesoft.products_ms.repositories.FacultyRepository;

/**
 * Service to perform bussines operations over Faculty entity.
 *
 * @author cristian.
 *
 */
@Service
public class FacultyService {
  /**
   * program repository.
   */
  @Autowired
  private FacultyRepository facultyRepository;

  /**
   * Find a faculty.
   * @param id to end the program.
   * @return the program found.
   */
  public Faculty find(Integer id) {
    return facultyRepository.findById(id).orElse(null);
  }
}
