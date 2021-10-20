import java.util.ArrayList;

import pacote2.Funcionario;

public class Encanador extends Funcionario{

	public ArrayList<String> caixaDeFerramentas;
			
	public Encanador(String ctps) {
		super(ctps, 1000);
		caixaDeFerramentas = new ArrayList<String>();
	}

	//@Override
	public void AumentarSalario() {
		super.AumentarSalario();
	}
			
}