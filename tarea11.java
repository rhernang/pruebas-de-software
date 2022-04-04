
public class tarea11 {

	public tarea11() {
		// TODO Auto-generated constructor stub
	}
	public String[] colas;
	
	public void addtoCola(String letra, int pos) {
		this.colas[pos] += letra;
	}


	public void showColas(){
		System.out.println("----------------------------------------------------------------");
		for (String string : colas) {
			System.out.println(string);
			System.out.println("----------------------------------------------------------------");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
