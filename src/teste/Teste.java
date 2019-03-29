package teste;

public class Teste {
	public static void main(String[] args) {
		Classe classe = new Classe();
		classe.setAtributo(10);
		classe.setAtributo(new Double(20));

		System.out.println();
	}
}

class Classe {
	private Object atributo = new Integer(20);

	public Object getAtributo() {
		return atributo;
	}

	public void setAtributo(Object atributo) {
		this.atributo = atributo;
	}

}