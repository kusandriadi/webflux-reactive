package webflux.reactive.repository;

import reactor.core.publisher.Flux;
import webflux.reactive.Subject;

public interface SubjectRepository {

    Flux<Subject> findAll();
}
