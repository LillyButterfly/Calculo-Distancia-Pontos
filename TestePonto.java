package ptiPOO;

// construtor da classe Ponto

public class TestePonto {

	public static void main(String[] args) 
		{ Ponto p1 = new Ponto (0,0);
		Ponto p2 = new Ponto(0,0);
		System.out.println(p1.calculoDistancia (p2));
		System.out.println(p1.equals(p2));
		}

}


