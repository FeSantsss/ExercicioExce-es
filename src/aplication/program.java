package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reserva;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Adicione os dados da reserva:");
		System.out.print("Número do quarto: ");
		int numeroQuarto = sc.nextInt();
		System.out.print("Data de entrada (dd/MM/yyyy): ");
		String entrada = sc.next();
		LocalDate dataEntrada = LocalDate.parse(entrada, fmt);
		System.out.print("Data de saída (dd/MM/yyyy): ");
		String saida = sc.next();
		LocalDate dataSaida = LocalDate.parse(saida, fmt);
		
		Reserva reserva = new Reserva();
		
		if (!dataSaida.isAfter(dataEntrada)) {
			System.out.println("Erro na reserva: A data de saída deve ser posterior à data de entrada.");
		} else {
			reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
			System.out.println(reserva);
		}
		System.out.println();
		
		System.out.println("Adicione os dados atualizados da reserva:");
		System.out.print("Data de entrada (dd/MM/yyyy): ");
		dataEntrada = LocalDate.parse(sc.next(), fmt);
		System.out.print("Data de saída (dd/MM/yyyy): ");
		dataSaida = LocalDate.parse(sc.next(), fmt);
		
		if (!dataSaida.isAfter(dataEntrada)) {
			System.out.println("Erro na reserva: A data de saída deve ser posterior à data de entrada.");
		} else {
			reserva.atualizarDatas(dataEntrada, dataSaida);
			System.out.println(reserva);
		}
		
		
		sc.close();
	}

}
