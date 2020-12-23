package com.mata.catalogo.Catalogo.Service;

import com.mata.catalogo.Catalogo.Entity.Actor;
import com.mata.catalogo.Catalogo.Repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    private final ActorRepository actorRepository;


    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> findAll(){
        return actorRepository.findAll();
    }
}
