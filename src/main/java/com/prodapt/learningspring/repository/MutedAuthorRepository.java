package com.prodapt.learningspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.prodapt.learningspring.entity.MutedAuthor;

 
import java.util.List;

public interface MutedAuthorRepository extends JpaRepository<MutedAuthor, Integer> {

	//@Query(value = "select muted_user_id from muted_author where user_id = ?1", nativeQuery = true)
    List<MutedAuthor> findAllByUserId(int userId);

}

