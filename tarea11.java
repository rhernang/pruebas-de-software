
public class tarea11 {

	public tarea11() {
		// TODO Auto-generated constructor stub
	}
	public String[] colas;
	
	public void addtoCola(String letra, int pos, String[] colas) {
		if (letra.length() != 1) {
			System.out.println("Ingrese solamente 1 caracter");
			return; // TODO Auto-
		}
		this.colas[pos] += letra;
	}



	public void showColas(){
		System.out.println("----------------------------------------------------------------");
		for (String string : colas) {
			System.out.println(string);
			System.out.println("----------------------------------------------------------------");
		}
	}

	public void compareColas(int pos1, int pos2) {
		if (colas[pos1] != colas[pos2]) {
			System.out.println("Las cadenas no son iguales");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
