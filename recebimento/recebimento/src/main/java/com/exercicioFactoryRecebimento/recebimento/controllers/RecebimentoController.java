package com.exercicioFactoryRecebimento.recebimento.controllers;

import com.exercicioFactoryRecebimento.recebimento.models.RecebimentoModel;
import com.exercicioFactoryRecebimento.recebimento.models.valoresDosRecebimentos.RecebimentoFactory;
import com.exercicioFactoryRecebimento.recebimento.services.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoController {

    @Autowired
    private RecebimentoService recebimentoService;

    @GetMapping(path = "/recebimentos")
    public List<RecebimentoModel> buscarTodosRecebimentos() {
        return recebimentoService.buscarTodos();
    }

    @GetMapping(path = "/recebimentos/{codigo}")
    public Optional<RecebimentoModel> buscarRecebimentoPorId(@PathVariable Long codigo) {
        return recebimentoService.buscarPorId(codigo);
    }

    @PostMapping(path = "/recebimentos")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoModel cadastrarRecebimento(@RequestBody RecebimentoModel recebimentoModel, RecebimentoFactory recebimentoFactory) {
        return recebimentoService.cadastrar(recebimentoModel, recebimentoFactory);
    }

    @DeleteMapping(path = "/recebimentos/{codigo}")
    public void deletarRecebimento(@PathVariable Long codigo) {
        recebimentoService.deletar(codigo);
    }
}
