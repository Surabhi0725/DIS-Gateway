package sgsits.cse.dis.gateway.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sgsits.cse.dis.gateway.model.Task;

import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
  Optional<Task> findByName(String taskName);
}