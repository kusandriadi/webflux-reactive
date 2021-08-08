package webflux.reactive.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import webflux.reactive.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReactiveStudentRepository implements StudentRepository {

    private static List<Student> student = new ArrayList<>();

    static {
        student.add(new Student("Brodo", 12));
        student.add(new Student("John", 13));
        student.add(new Student("Cierra", 12));
    }

    @Override
    public Flux<Student> findAll() {
        return Flux.fromIterable(student);
    }

}
