package edu.collections.map.orderedMapStructure;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		Agenda  ag = new Agenda();
		
		ag.addEvent(LocalDate.of(1994, Month.JUNE, 3), "Tetra Brasileiro", "USA");
		ag.addEvent(LocalDate.of(2006, Month.MARCH, 26), "Nascimento da minha filha Talita", "Recife PE");
		ag.addEvent(LocalDate.of(2023, Month.AUGUST, 22), "Saida do supermarket Recreio", "Recreio dos Bandeirantes");
		ag.addEvent(LocalDate.now(), "Tomar vacinas", "Clinica da Familia");
		ag.addEvent(LocalDate.of(2024, 8, 28), "Inicio no Supermarket", "Gardenia Azul");
		ag.addEvent(LocalDate.of(2024, Month.NOVEMBER, 2), "feriado de finados", "Brasil");
		ag.addEvent(LocalDate.of(2024, Month.OCTOBER, 12), "feriado do dia das crianças","Brasil");
		ag.addEvent(LocalDate.of(2024, Month.SEPTEMBER, 7), "feriado nacional: Independencia do Brasil", "Brasil");
		
		ag.showAgenda();
		
		ag.previousEvents();
		
		ag.nextEvent();
		
		
	}
}
