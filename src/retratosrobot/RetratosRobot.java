package retratosrobot;
import java.util.Scanner;


public class RetratosRobot {
	/** Muestra los diferentes opciones de retrato robot que el usuario seleccionará y finalmente mostrará el retrato robot del asesino.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Definimos tipos.
		String[] pelo= {"WWWWWWWWW","\\\\\\//////","|\"\"\"\"\"\"\"|","|||||||||"};
		String[] ojos= {"| O   O |","|-(· ·)-|","|-(o o)-|","| \\   / |"};
		String[] nariz={"@   J   @","{   \"   }","[   j   ]","<   -   >"};
		String[] boca={"|  ===  |","|   -   |","|  ___  |","|  ---  |"};
		String[] barbilla={"\\_______/","\\,,,,,,,/"};
		
		//Mostramos tipos
		String espacios="     ";
		System.out.println ("A continuación se mostrarán diferentes tipos de pelo, ojos, narices, bocas y barbillas para confeccionar el retrato robot \n\n");
		for (int i=0;i<pelo.length;i++) {
			if (i<barbilla.length) {
				System.out.println((i+1)+". "+pelo[i]+espacios+(i+1)+". "+ojos[i]+espacios+(i+1)+". "+nariz[i]+espacios+(i+1)+". "+boca[i]+espacios+(i+1)+". "+barbilla[i]);
			} else {
				System.out.println((i+1)+". "+pelo[i]+espacios+(i+1)+". "+ojos[i]+espacios+(i+1)+". "+nariz[i]+espacios+(i+1)+". "+boca[i]);
			}
		}
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
		mensaje+=espacios+pelo[peloEscogido-1]+"\n"+espacios+ojos[ojosEscogido-1]+"\n"+espacios+nariz[narizEscogido-1]+"\n"+espacios+
				boca[bocaEscogido-1]+"\n"+espacios+barbilla[barbillaEscogido-1];
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