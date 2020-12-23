package com.mata.catalogo.Catalogo.Service;

import com.mata.catalogo.Catalogo.Entity.Director;
import com.mata.catalogo.Catalogo.Repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }


    public List<Director> findAll(){
        return directorRepository.findAll();

    }
}
