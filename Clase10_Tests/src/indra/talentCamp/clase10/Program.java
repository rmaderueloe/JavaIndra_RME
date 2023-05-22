package indra.talentCamp.clase10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// MANEJO DE FECHAS
		
		// Obtener la fecha y hora actual
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        // Crear una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2023, 5, 22);
        LocalTime horaEspecifica = LocalTime.of(15, 30, 0);
        LocalDateTime fechaHoraEspecifica = LocalDateTime.of(fechaEspecifica, horaEspecifica);
        
        System.out.println("Fecha específica: " + fechaEspecifica);
        System.out.println("Hora específica: " + horaEspecifica);
        System.out.println("Fecha y hora específica: " + fechaHoraEspecifica);

        // Formatear una fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String fechaFormateada = fechaActual.format(formato);
        System.out.println("Fecha formateada: " + fechaFormateada);
        String fechaFormateada2 = fechaActual.format(formato2);
        System.out.println("Fecha formateada: " + fechaFormateada2);

        // Formatear la fecha y hora
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHoraFormateada3 = fechaHoraActual.format(formato3);
        System.out.println("Fecha y hora formateada: " + fechaHoraFormateada3);

        // Realizar operaciones con fechas
        LocalDate fechaFutura = fechaActual.plusDays(7);
        LocalDate fechaPasada = fechaActual.minusMonths(2);
        System.out.println("Fecha futura: " + fechaFutura);
        System.out.println("Fecha pasada: " + fechaPasada);

        // Comparar fechas
        LocalDate otraFecha = LocalDate.of(2023, 5, 22);
        System.out.println("¿La otra fecha es anterior a la fecha actual? " + (otraFecha.isBefore(fechaActual) ? "SI" : "NO"));
        System.out.println("¿La otra fecha es posterior a la fecha actual? " + (otraFecha.isAfter(fechaActual) ? "SI" : "NO"));
        System.out.println("¿Las fechas son iguales? " + (otraFecha.isEqual(fechaActual) ? "SI" : "NO"));
        
        Period periodo = Period.between(fechaPasada, fechaFutura);
        System.out.println("Meses y dias entre las dos fechas: " + periodo.getMonths() + " meses y " + periodo.getDays() + " dias.");
		
        
        // MANEJO DE STRINGS
        
        String txt = "Hola que tal me llamo Rafa";
        List<String> palabrasTxt = Arrays.asList(txt.split(" "));
        palabrasTxt.forEach(System.out::println);
        
        char primerCaracter = txt.charAt(0);
        System.out.println("Primer caracter: " + primerCaracter);
        
        String reemplazada = txt.replace("mundo", "amigo");
        
		// DICCIONARIOS (clave, valor)
        
        Map<String, String> dic = new HashMap<>();
        dic.put("casa", "lugar de residencia");
        System.out.println(dic.toString());
        
        if(!dic.containsKey("auto"))
        	dic.put("auto", "vehiculo");
        
        for (var entrada : dic.entrySet()) {
			System.out.println(entrada.getKey() + " - "+ entrada.getValue());
		}
        
        System.out.println(dic.toString());
        
        //ESTRUCTURAS DE DATOS
        
        Set<String> conjunto = new HashSet<>();
        conjunto.add("casa");
        conjunto.add("casa");
        conjunto.add("casa");
        conjunto.add("mesa");
        conjunto.add("mesa");
        
        System.out.println(conjunto.size());
        
        Queue<Integer> colaPrio = new PriorityQueue<>();
        colaPrio.add(5);
        colaPrio.add(2);
        colaPrio.add(45);
        colaPrio.add(60);
        System.out.println("cola con prioridad por numero menor: ");
        
        for (var e : colaPrio) {
        	System.out.println(e);
        }
        System.out.println("elemento 'cabeza' de la cola: " + colaPrio.peek());
        System.out.println("elemento: " + colaPrio.poll() + ", se elimino el elemento 5");
        System.out.println("elemento 'cabeza' de la cola: " + colaPrio.peek());
        
	}

}
