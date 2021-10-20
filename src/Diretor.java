import pacote2.Funcionario;

public class Diretor extends Funcionario {
	
	public Diretor(String ctps) {
		super(ctps, 3000);
	}
	
	public void AprovarContrato() {
		System.out.println("contrato aprovado");
	}
	
	
	public void AumentarSalario() {
		
		super.setSalario(super.getSalario() + (super.getSalario() * 0.15));
	}
}
