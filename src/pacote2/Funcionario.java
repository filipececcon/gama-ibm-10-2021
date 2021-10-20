package pacote2;


public abstract class Funcionario {

	public Funcionario(String ctps, double salario) {
		CTPS = ctps;
		setSalario(salario);
	}
	
	private double Salario;
	
	public String CTPS;
	
	
	public void AumentarSalario()
	{
		setSalario(Salario += Salario * 0.1);
	}
	
	public double getSalario() {
		return Salario;
	}
	
	protected void setSalario(double valor) {
		Salario = valor;
	}

	
	//SOBRECARGAS
//	public void AumentarSalario(double aumento, double taxa) {
//		Salario += (Salario * taxa) + aumento;
//	}
//	
//	public void AumentarSalario(String bolsa) {
//		Salario += Integer.parseInt(bolsa);
//	}

	//modificadores de visibilidade (classe/atributo/metodo)
	//public -> qualquer lugar acessam 
	//protected -> só a propria classe e os filhos dela acessam se forem de pacotes diferentes, se for do mesmo pacote funciona como public.
	//private -> só a propria classe acessam
}
