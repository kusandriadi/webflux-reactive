package webflux.reactive.repository;

import reactor.core.publisher.Flux;
import webflux.reactive.Student;

public interface StudentRepository {

    Flux<Student> findAll();

}
