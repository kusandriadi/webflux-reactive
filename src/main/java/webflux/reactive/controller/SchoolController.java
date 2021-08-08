package webflux.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Mono;
import webflux.reactive.repository.StudentRepository;
import webflux.reactive.repository.SubjectRepository;

@Controller
public class SchoolController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/home")
    public String home(final Model model) {
        model.addAttribute("loginUser", Mono.just("Mac"));

        return "home";

    }

    @GetMapping("/")
    public Mono<String> index(final Model model) {
       model.addAttribute("loginUser", Mono.just("Mac"));
       model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("subjects", subjectRepository.findAll());
       return Mono.just("index");
    }

}