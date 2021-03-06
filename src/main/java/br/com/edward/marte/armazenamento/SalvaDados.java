package br.com.edward.marte.armazenamento;

import java.util.ArrayList;
import java.util.List;

import br.com.edward.marte.model.CarrinhoModel;
import br.com.edward.marte.model.PerfumeModel;
import br.com.edward.marte.model.PessoaFisicaModel;
import br.com.edward.marte.model.PessoaJuridicaModel;

public class SalvaDados {

	private SalvaDados() { }
	
	public static List<PessoaFisicaModel> pessoasFisicas = new ArrayList<>();
	public static List<PessoaJuridicaModel> pessoasJuridica = new ArrayList<>();
	public static List<PerfumeModel> perfumes = new ArrayList<>();
	public static CarrinhoModel carrinho = new CarrinhoModel();
}
