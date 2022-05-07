package com.hysenberisha.redditclone.repository;

import com.hysenberisha.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<User, Long> {
}
