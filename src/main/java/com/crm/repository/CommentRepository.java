package com.crm.repository;

import com.crm.entity.Comment;
import com.crm.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    interface PostRepository extends JpaRepository<Post, Long> {
    }
}