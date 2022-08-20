package com.exercicioFactoryPagamento.pagamento.controllers;

import com.exercicioFactoryPagamento.pagamento.models.PagamentoModel;
import com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos.PagamentoFactory;
import com.exercicioFactoryPagamento.pagamento.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(path = "/pagamentos")
    public List<PagamentoModel> buscarTodosPagamentos(){
        return pagamentoService.buscarTodos();
    }

    @GetMapping(path = "/pagamentos/{codigo}")
    public Optional<PagamentoModel> buscarPorId(@PathVariable Long codigo){
        return pagamentoService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamento/atrasado")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel cadastrarPagamentoAtrasado(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){
        return pagamentoService.pagamentoAtrasado(pagamentoModel, pagamentoFactory);
    }

    @PostMapping(path = "/pagamento/emdia")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel cadastrarPagamentoEmDia(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){
        return pagamentoService.pagamentoEmDia(pagamentoModel, pagamentoFactory);
    }

    @PutMapping(path = "/pagamento/atrasado")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel alterarPagamentoAtrasado(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){
        return pagamentoService.pagamentoAtrasado(pagamentoModel, pagamentoFactory);
    }

    @PutMapping(path = "/pagamento/emdia")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel alterarPagamentoEmDia(@RequestBody PagamentoModel pagamentoModel, PagamentoFactory pagamentoFactory){
        return pagamentoService.pagamentoEmDia(pagamentoModel, pagamentoFactory);
    }

    @DeleteMapping(path = "/pagamento/atrasado/{codigo}")
    public void deletarPagamentoAtrasado(@PathVariable Long codigo){
        pagamentoService.deletarPgtoAtrasado(codigo);
    }

    @DeleteMapping(path = "/pagamento/emdia/{codigo}")
    public void deletarPagamentoEmDia(@PathVariable Long codigo){
        pagamentoService.deletarPgtoEmDia(codigo);
    }






}
