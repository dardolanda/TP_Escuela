package ar.com.escuela.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import ar.com.escuela.elementos.Materia;
import ar.com.escuela.integrantes.IntegrantesEscuela;
import ar.com.escuela.integrantes.impl.Alumno;
import ar.com.escuela.integrantes.impl.Profesor;
import ar.com.escuela.operaciones.Calculador;

public class TestEscuela {

	public static void main(String[] args) {
		
		System.out.println("---------- Escuela test empieza: ---------- ");
		System.out.println();
		
		/*
		 * Ejemplo para poder setear las fechas --> pero tiene que ser de tipo String:
		 * https://www.mkyong.com/java/java-date-and-calendar-examples/
		 * 
		 * */			
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date());
		
		Materia materia = new Materia("Lengua" , "Lunes", "19:00 hs" , date);
		Materia materia1 = new Materia("Matematica" , "Martes", "18:00 hs" , date);
		Materia materia2 = new Materia("Historia" , "Miercoles", "17:00 hs" , date);
		Materia materia3 = new Materia("Biología" , "Jueves", "16:00 hs" , date);
		
		IntegrantesEscuela profesor1 = new Profesor("Roberto", "kuda", "29555874", 45, materia2);
		IntegrantesEscuela profesor2 = new Profesor("Gabriel", "De La Torre", "29987400", 45, materia3);
		
		
		IntegrantesEscuela alumno1 = new Alumno("juan", "perz","332244567", 16, "7 b");
		((Alumno) alumno1).agregarCalificacion(materia, 10);
		((Alumno) alumno1).agregarCalificacion(materia, 10);
		((Alumno) alumno1).agregarCalificacion(materia, 10);
		((Alumno) alumno1).agregarCalificacion(materia, 10);
		
		IntegrantesEscuela alumno2 = new Alumno("Pedro", "ruiz","338595567", 16, "7 a");
		((Alumno) alumno2).agregarCalificacion(materia1, 6);
		((Alumno) alumno2).agregarCalificacion(materia1, 5);
		((Alumno) alumno2).agregarCalificacion(materia1, 5);
		((Alumno) alumno2).agregarCalificacion(materia1, 5);
		
		((Alumno) alumno2).agregarCalificacion(materia, 5);
		((Alumno) alumno2).agregarCalificacion(materia, 5);
		((Alumno) alumno2).agregarCalificacion(materia, 5);
		((Alumno) alumno2).agregarCalificacion(materia, 5);
						
		
		((Alumno) alumno1).imprimirInformacion();		
		((Alumno) alumno2).imprimirInformacion();
			
		((Profesor) profesor1).imprimirInformacion();
		((Profesor) profesor2).imprimirInformacion();
		
		System.out.println();
		
		System.out.println("Nombre y apellido del Alumno");		
		System.out.println("Nombre del alumno1 : " + ((Alumno) alumno2).getNombre());
		System.out.println("Apellido del alumno1 : " + ((Alumno) alumno2).getApellido());
		
		System.out.println();
		
		System.out.println("Nombre y apellido del Profesor");
		System.out.println("Nombre del Profesor1: " + ((Profesor) profesor2).getNombre());
		System.out.println("Apellido del Profesor1: " + ((Profesor) profesor2).getApellido());
		
		
		System.out.println();
		System.out.println("--------- Caluculo de promedios y chequeo de Aprobado");
		
		Calculador calculador = new Calculador();
		
		System.out.println("Promedio Alumno: " 
		                  + alumno2.getNombre() + " " + alumno2.getApellido() + "---> "
		                  + calculador.calcularPromedio(alumno2));
		
		System.out.println("Chequeo aprobado Alumno: " 
                		  + alumno2.getNombre() + " " + alumno2.getApellido() + "---> "
                		  + calculador.chequearAprobado(alumno2));
		
		
		System.out.println("----------  Escuela test Termina ---------- ");
	}

}
