//El funcionaiento del codigo se basa en leer un dato que ingresa el usuario
//en este caso es para indicar la capital del pais que ingresas
//al final te responde la capital del pais que ingreaste
package org.generation;

import java.util.HashMap; //faltaba importar hashmap
import java.util.Map;
import java.util.Scanner; //faltaba importar scanner

public class Codigo7 {
	
	public static void name(String[] args) {
		
		Scanner s = new Scanner(System.in); //se agrego system.in

	    Map<String, String> capitales = new HashMap<>(); //se cambio el tipo de dato a String

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); //faltaba agregar el segundo String
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = "";

	    do {
	      System.out.println("Escribe el nombre de un país y te diré su capital: ");
	      c = s.nextLine();//se cambio para leer un string
	      
	      if (!c.equals("salir")) { //se agrego la s
	    	  if (capitales.containsValue("c")) { //se camcio a variable c
	          System.out.println("La capital de " + c);
	          System.out.println(" es " + capitales.put(c, c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (c.equals("salir"));//faltaba un parentezis
	  }
		
	}

