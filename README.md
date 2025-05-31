# ExercicioExceções
==Exercício de exceções try-catch com versionamento Git==

# 🏨 Hotel Reservation Program

## 📑 Descrição

Este projeto consiste em um programa de reserva de hotel desenvolvido para demonstrar três abordagens distintas no tratamento de erros e validação de dados:

- ❌ **Solução 1 (Muito ruim)**: Toda a lógica de validação está no programa principal, tornando o código desorganizado e de difícil manutenção.

- ⚠️ **Solução 2 (Ruim)**: A lógica de validação é feita por meio de retorno de mensagens (`String`) nos métodos. Essa abordagem prejudica a semântica do código, pois métodos que deveriam apenas atualizar dados passam a se responsabilizar por mensagens de erro.

- ✅ **Solução 3 (Boa)**: Implementação correta utilizando **tratamento de exceções**, delegando a responsabilidade de validação para a própria classe de reserva, deixando o código mais limpo, robusto e de fácil manutenção.

---

## 🏗️ Estrutura do Problema

O programa realiza as seguintes operações:

1. Solicita os dados iniciais da reserva:
   - Número do quarto
   - Data de check-in
   - Data de check-out

2. Exibe os dados da reserva, incluindo:
   - Número do quarto
   - Datas de check-in e check-out
   - Duração da estadia em noites

3. Permite ao usuário atualizar as datas da reserva, aplicando as seguintes regras de validação:
   - ✅ **A data de check-out deve ser depois da data de check-in.**
   - ✅ **As novas datas devem ser futuras em relação à data atual.**

4. Exibe a reserva atualizada ou uma mensagem de erro, caso as regras sejam violadas.

---

## 📜 Exemplos de Funcionamento

### ✅ Reserva válida e atualização bem-sucedida:

```
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2019
Check-out date (dd/MM/yyyy): 29/09/2019
Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights
```

### ❌ Erro: check-out antes do check-in

```
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 21/09/2019
Error in reservation: Check-out date must be after check-in date
```

### ❌ Erro: atualização com datas passadas

```
Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2015
Check-out date (dd/MM/yyyy): 29/09/2015
Error in reservation: Reservation dates for update must be future dates
```

---

## 🛠️ Tecnologias Utilizadas

- Linguagem: **Java**
- Paradigmas: Programação Orientada a Objetos (POO)
- Tratamento de Exceções

---

## 🔥 Aprendizados

Este exercício tem como objetivo ensinar:

- A importância de delegar responsabilidades para as classes corretas.
- Por que retornar mensagens de erro em métodos é uma má prática.
- Como implementar tratamento de exceções para garantir que o programa lide corretamente com dados inválidos, deixando o código mais limpo, seguro e profissional.
