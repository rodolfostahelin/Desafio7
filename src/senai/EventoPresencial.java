package senai;

import java.time.LocalDate;

public class EventoPresencial extends Evento {
	
	private String localizacao;
	private int capacidadeMaxima;
	
	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public EventoPresencial(String nome, LocalDate data, Usuario organizador, String descricaoEvento,
			String localizacao, int capacidadeMaxima) {
		super(nome, data, organizador, descricaoEvento);
		this.localizacao = localizacao;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	

}
