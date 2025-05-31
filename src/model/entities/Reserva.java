package model.entities;

import java.time.Duration;
import java.time.LocalDate;

public class Reserva {
	private Integer numeroQuarto;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;

	public Reserva(Integer numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida) {
		this.numeroQuarto = numeroQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public Duration getDuracao() {
		Duration duração = Duration.between(dataEntrada.atStartOfDay(), dataSaida.atStartOfDay());
		return duração;
	}
}
