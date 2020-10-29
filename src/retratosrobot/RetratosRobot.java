package retratosrobot;
import java.util.Scanner;


public class RetratosRobot {
	/** Muestra los diferentes opciones de retrato robot que el usuario seleccionará y finalmente mostrará el retrato robot del asesino.
	 */
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Nota importante, se puede crar un array bidimiensional con todos los rasgos faciales donde en la psocion 0 este el nombre del rasgo facial.
		// a la hora de presentar los rasgos
		//Definimos tipos.
		String[][] rasgos ={{"  pelo","WWWWWWWWW","\\\\\\//////","|\"\"\"\"\"\"\"|","|||||||||"},
							{"  ojos","| O   O |","|-(· ·)-|","|-(o o)-|","| \\   / |"},
							{"  nariz","@   J   @","{   \"   }","[   j   ]","<   -   >"},
							{"  boca","|  ===  |","|   -   |","|  ___  |","|  ---  |"},
							{"  barbilla","\\_______/","\\,,,,,,,/"} };
		//Mostramos tipos
		String espacios="     ";
		System.out.println ("A continuación se mostrarán diferentes tipos de pelo, ojos, narices, bocas y barbillas para confeccionar el retrato robot \n\n");
		int[] valorEscogido= new int[5];
		for (int i=0;i<rasgos.length;i++) {
			System.out.println("Elige un valor para el rasgo: "+rasgos[i][0]);
			for (int j=1;j<rasgos[i].length;j++) {
				System.out.println(espacios+j+"."+rasgos[i][j]);
			}
			System.out.println("\n\n");
			valorEscogido[i]=Integer.parseInt(teclado.nextLine());
		}
		System.out.println("\n");
		
		//Mostramos el retrato robot en función de las preferencias.
		System.out.println("Este es el retrato robot escogido:\n\n");
		for (int i=0;i<rasgos.length;i++) {
			System.out.println(espacios+rasgos[i][valorEscogido[i]]);
		}
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