package br.com.edward.marte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.edward.marte.model.PessoaJuridicaModel;

@RestController
@RequestMapping("/pj")
public class PessoaJuridicaController {

    @GetMapping("/valida-cpf")
    public Boolean validaCpf(@RequestParam(value = "cnpj") String cnpj) {
        return new PessoaJuridicaModel("", cnpj).isDocumentoValido();
    }

    @GetMapping("/gerar")
    public PessoaJuridicaModel gerar(@RequestParam(value = "cnpj") String cnpj) {
        return new PessoaJuridicaModel("", cnpj);
    }
}
