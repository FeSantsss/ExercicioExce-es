package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;

import model.entities.Reserva;
import model.exceptions.FelipyExercecao;

public class program {

	public static void main(String[] args) throws FelipyExercecao {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		try {
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
	
			reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
			System.out.println(reserva);
	
			System.out.println();
	
			System.out.println("Adicione os dados atualizados da reserva:");
			System.out.print("Data de entrada (dd/MM/yyyy): ");
			dataEntrada = LocalDate.parse(sc.next(), fmt);
			System.out.print("Data de saída (dd/MM/yyyy): ");
			dataSaida = LocalDate.parse(sc.next(), fmt);
	
			reserva.atualizarDatas(dataEntrada, dataSaida);
			System.out.println(reserva);
		}
		catch (InputMismatchException e) {
			System.out.println("{Erro}: Entrada inválida. Por favor, insira os dados corretamente.");
		}
		catch (FelipyExercecao e) {
			System.out.println("{Erro} na reserva: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("{Erro} inesperado: " + e.getMessage());
		}
		finally {
			System.out.println("fim da criação da reserva.");
			sc.close();
		}
	}

}
