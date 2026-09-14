package com.damascena.workshopmongo.services;

import com.damascena.workshopmongo.domain.Post;
import com.damascena.workshopmongo.domain.User;
import com.damascena.workshopmongo.dto.UserDTO;
import com.damascena.workshopmongo.repository.PostRepository;
import com.damascena.workshopmongo.repository.UserRepository;
import com.damascena.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public List<Post> findAll(){
        return repo.findAll();
    }

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(()->new ObjectNotFoundException("Usuário não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
