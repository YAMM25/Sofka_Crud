package co.com.sofka.crud;

import org.springframework.data.repository.CrudRepository;

interface RodoRepository extends CrudRepository<Todo, Long> {
}
