package br.com.heiderlopes.notepad.Controller;

import br.com.heiderlopes.notepad.model.Nota;
import br.com.heiderlopes.notepad.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by logonrm on 27/11/2017.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/nota")
public class NotaController {

    @Autowired
    NotaService notaService;


    @GetMapping
    List<Nota> buscarTodos() {
        return notaService.buscarTodas();
    }

    @GetMapping(value = "/titulo/{titulo}")
    Nota buscar(@PathVariable(value = "titulo") String titulo) {
        return notaService.buscar(titulo);
    }

    @PostMapping
    public void salvar(@RequestBody Nota nota){
        notaService.salvar(nota);
    }
}
