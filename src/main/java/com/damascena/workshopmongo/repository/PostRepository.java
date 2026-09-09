package com.damascena.workshopmongo.repository;

import com.damascena.workshopmongo.domain.Post;
import com.damascena.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
