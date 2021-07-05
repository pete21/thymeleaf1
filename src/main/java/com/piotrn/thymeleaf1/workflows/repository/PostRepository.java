package com.piotrn.thymeleaf1.workflows.repository;

import com.piotrn.thymeleaf1.workflows.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
