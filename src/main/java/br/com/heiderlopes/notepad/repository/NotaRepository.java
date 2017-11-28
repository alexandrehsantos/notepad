package br.com.heiderlopes.notepad.repository;

import br.com.heiderlopes.notepad.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by logonrm on 27/11/2017.
 */
@Repository
public interface NotaRepository extends MongoRepository<Nota, String> {

    Nota findByTitulo(String titulo);

}
