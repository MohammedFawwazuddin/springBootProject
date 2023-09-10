package com.prodapt.learningspring.repository;

import com.prodapt.learningspring.entity.FavoriteAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteAuthorRepository extends JpaRepository<FavoriteAuthor, Integer> {

    List<FavoriteAuthor> findAllByUserId(int userId);
}
