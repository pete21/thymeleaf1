package com.piotrn.thymeleaf1.workflows;

import com.piotrn.thymeleaf1.workflows.model.Post;
import com.piotrn.thymeleaf1.workflows.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkflowsConfig {

    @Bean
    CommandLineRunner commandLineRunner(PostRepository postRepository) {
        return args -> {
            Post a = new Post();
            a = postRepository.save(a);
        };
    }
}

