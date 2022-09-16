package com.bhgo.algafood.di.service;

import com.bhgo.algafood.di.modelo.Cliente;
import com.bhgo.algafood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
