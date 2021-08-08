package webflux.reactive.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import webflux.reactive.Student;
import webflux.reactive.Subject;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReactiveSubjectRepository implements SubjectRepository {

    private static List<Subject> subjects = new ArrayList<>();

    static {
        subjects.add(new Subject("Social"));
        subjects.add(new Subject("Algorithm"));
        subjects.add(new Subject("Math"));
    }

    @Override
    public Flux<Subject> findAll() {
        return Flux.fromIterable(subjects);
    }

}
