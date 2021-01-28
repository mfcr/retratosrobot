package retratosrobot;

public class Retrato {
	private int pelo;
	private int ojos;
	private int nariz;
	private int boca;
	private int barbilla;
	private static String[][] rasgos ={{"  pelo","WWWWWWWWW","\\\\\\//////","|\"\"\"\"\"\"\"|","|||||||||"},
			{"  ojos","| O   O |","|-(· ·)-|","|-(o o)-|","| \\   / |"},
			{"  nariz","@   J   @","{   \"   }","[   j   ]","<   -   >"},
			{"  boca","|  ===  |","|   -   |","|  ___  |","|  ---  |"},
			{"  barbilla","\\_______/","\\,,,,,,,/"} };

	public Retrato() {
	}

	
	public Retrato(int pelo, int ojos, int nariz, int boca, int barbilla) {
		this.pelo=pelo;
		this.ojos=ojos;
		this.nariz=nariz;
		this.boca=boca;
		this.barbilla=barbilla;
	}

	public int getPelo() {
		return pelo;
	}
	public void setPelo(int pelo) {
		this.pelo=pelo;
	}
	public String verPelo() {
		try {
			return rasgos[0][pelo];
		} catch (Exception e) {
			return "";
		}
	}

	public int getOjos() {
		return ojos;
	}
	public void setOjos(int ojos) {
		this.ojos=ojos;
	}
	public String verOjos() {
		try {
			return rasgos[1][ojos];
		} catch (Exception e) {
			return "";
		}
	}

	public int getNariz() {
		return nariz;
	}
	public void setNariz(int nariz) {
		this.nariz=nariz;
	}
	public String verNariz() {
		try {
			return rasgos[2][nariz];
		} catch (Exception e) {
			return "";
		}
	}

	public int getBoca() {
		return boca;
	}
	public void setBoca(int boca) {
		this.boca=boca;
	}
	public String verBoca() {
		try {
			return rasgos[3][boca];
		} catch (Exception e) {
			return "";
		}
	}

	public int getBarbilla() {
		return barbilla;
	}
	public void setBarbilla(int barbilla) {
		this.barbilla=barbilla;
	}
	public String verBarbilla() {
		try {
			return rasgos[4][barbilla];
		} catch (Exception e) {
			return "";
		}
	}

	@Override public String toString() {
		return (verPelo()+"\n"+verOjos()+"\n"+verNariz()+"\n"+verBoca()+"\n"+verBarbilla());
		
	}
	public static String toString(int rasgo) {
		String rasgosLista="";
		for (int i=1;i<rasgos[rasgo].length;i++) {
			rasgosLista+=i+")"+ rasgos[rasgo][i]+"\n";
		}
		return rasgosLista;
	}
}
