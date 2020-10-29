package retratosrobot;
import java.util.Scanner;


public class RetratosRobot {
	/** Muestra los diferentes opciones de retrato robot que el usuario seleccionará y finalmente mostrará el retrato robot del asesino.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Definimos tipos.
		String pelo1="WWWWWWWWW";
		String pelo2="\\\\\\//////";
		String pelo3="|\"\"\"\"\"\"\"|";
		String pelo4="|||||||||";
		
		String ojos1="| O   O |";
		String ojos2="|-(· ·)-|";
		String ojos3="|-(o o)-|";
		String ojos4="| \\   / |";

		String nariz1="@   J   @";
		String nariz2="{   \"   }";
		String nariz3="[   j   ]";
		String nariz4="<   -   >";
		
		String boca1="|  ===  |";
		String boca2="|   -   |";
		String boca3="|  ___  |";
		String boca4="|  ---  |";
		
		String barbilla1="\\_______/";
		String barbilla2="\\,,,,,,,/";
		//Mostramos tipos
		String espacios="     ";
		System.out.println ("A continuación se mostrarán diferentes tipos de pelo, ojos, narices, bocas y barbillas para confeccionar el retrato robot \n\n");
		int i=1;
		System.out.println (i+". "+pelo1+espacios+i+". "+ojos1+espacios+i+". "+nariz1+espacios+i+". "+boca1+espacios+i+". "+barbilla1);
		i++;
		System.out.println (i+". "+pelo2+espacios+i+". "+ojos2+espacios+i+". "+nariz2+espacios+i+". "+boca2+espacios+i+". "+barbilla2);
		i++;
		System.out.println (i+". "+pelo3+espacios+i+". "+ojos3+espacios+i+". "+nariz3+espacios+i+". "+boca3);
		i++;
		System.out.println (i+". "+pelo4+espacios+i+". "+ojos4+espacios+i+". "+nariz4+espacios+i+". "+boca4);
		System.out.println("\n");
		//Preguntamso por opciones a mostrar.
		//Para completar el programa habría que realizar control de los datos que introduce el usuario.
		System.out.print("Introduzca el código del pelo para el retrato robot: ");
		int peloEscogido=teclado.nextInt();
		System.out.print("Introduzca el código de los ojos para el retrato robot: ");
		int ojosEscogido=teclado.nextInt();
		System.out.print("Introduzca el código de la nariz para el retrato robot: ");
		int narizEscogido=teclado.nextInt();
		System.out.print("Introduzca el código de la boca para el retrato robot: ");
		int bocaEscogido=teclado.nextInt();
		System.out.print("Introduzca el código de la barbilla para el retrato robot: ");
		int barbillaEscogido=teclado.nextInt();
		
		//Mostramos el retrato robot en función de las preferencias.
		String mensaje="";
		switch (peloEscogido) {
			case 1:	mensaje+=espacios+pelo1+"\n"; break;
			case 2:	mensaje+=espacios+pelo2+"\n"; break;
			case 3:	mensaje+=espacios+pelo3+"\n"; break;
			case 4:	mensaje+=espacios+pelo4+"\n"; break;
		}

		switch (ojosEscogido) {
			case 1:	mensaje+=espacios+ojos1+"\n"; break;
			case 2:	mensaje+=espacios+ojos2+"\n"; break;
			case 3:	mensaje+=espacios+ojos3+"\n"; break;
			case 4:	mensaje+=espacios+ojos4+"\n"; break;
		}
		
		switch (narizEscogido) {
			case 1:	mensaje+=espacios+nariz1+"\n"; break;
			case 2:	mensaje+=espacios+nariz2+"\n"; break;
			case 3:	mensaje+=espacios+nariz3+"\n"; break;
			case 4:	mensaje+=espacios+nariz4+"\n"; break;
		}
		switch (bocaEscogido) {
			case 1:	mensaje+=espacios+boca1+"\n"; break;
			case 2:	mensaje+=espacios+boca2+"\n"; break;
			case 3:	mensaje+=espacios+boca3+"\n"; break;
			case 4:	mensaje+=espacios+boca4+"\n"; break;
		}		
		switch (barbillaEscogido) {
			case 1:	mensaje+=espacios+barbilla1+"\n"; break;
			case 2:	mensaje+=espacios+barbilla2+"\n"; break;
		}		
		
		System.out.println(mensaje);
		
	}

}

/*
PELO                OJOS                NARIZ
1. WWWWWWWWW		1. | O   O |		1. @   J   @
2. \\\//////		2. |-(· ·)-|		2. {   "   }
3. |"""""""|		3. |-(o o)-|		3. [   j   ]
4. |||||||||		4. | \   / |		4. <   -   >

BOCA                BARBILLA
1. |  ===  |		1. \_______/
2. |   -   |		2. \,,,,,,,/
3. |  ___  |
4. |  ---  |

*/