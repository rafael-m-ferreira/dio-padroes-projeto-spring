package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long Id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long Id, Cliente cliente);
	
	void deletar(Long Id);

}
