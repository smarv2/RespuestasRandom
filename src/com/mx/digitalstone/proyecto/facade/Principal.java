/**
 * 
 */
package com.mx.digitalstone.proyecto.facade;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author MXI01020253A
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta;

		System.out.println("Hola Mundo");
		
		respuesta = obtenerRespuesta();
		System.out.println("respuesta: " + respuesta);
	}
	
	public static String obtenerRespuesta() {
		String respuesta = "";
		
		Random rand = new Random();
		
		List<String> listaRespuestas;
		listaRespuestas = generaListaRespuestas();

		// Obtain a number between [0 - 49].
		int n = rand.nextInt(listaRespuestas.size());
		
		System.out.println("n:" + n);
		System.out.println("Respuesta: " + listaRespuestas.get(n));
		
		return respuesta;
		
	}

	private static List<String> generaListaRespuestas() {
		List<String> listaRespuestas = new ArrayList<String>();
		listaRespuestas.add("Si.");
                listaRespuestas.add("Chi.");
		listaRespuestas.add("No.");
                listaRespuestas.add("Ño.");
		listaRespuestas.add("Puede Ser.");
		listaRespuestas.add("A lo mejor.");
		listaRespuestas.add("Quien sabe.");
		listaRespuestas.add("Yes en Inglés.");
		listaRespuestas.add("NOPE.");
		listaRespuestas.add("Pa ke kiere saber eso jeje saludos.");
		listaRespuestas.add("No lo sé.");
		listaRespuestas.add("Prueba preguntando de nuevo.");
		listaRespuestas.add("AWUAU DIJO EL PERRO.");
		listaRespuestas.add("Nel.");
		listaRespuestas.add(".i.");
				
		return listaRespuestas;
	}

}
