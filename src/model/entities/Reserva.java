package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
	protected Integer numeroQuarto;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	
	public final static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reserva() {
	}
	
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
	
	public void atualizarDatas(LocalDate dataEntrada, LocalDate dataSaida) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	@Override
	public String toString() {
		return "Reserva: Quarto " 
				+ numeroQuarto 
				+ ", Entrada: " 
				+ dataEntrada.format(fmt) 
				+ ", Saída: " 
				+ dataSaida.format(fmt)
				+ ", Duração: " 
				+ getDuracao().toDays() 
				+ " noites";
	}
}
