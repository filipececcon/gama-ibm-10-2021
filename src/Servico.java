import pacote2.Funcionario;

public class Servico<TFuncionario extends Funcionario> {

	public String RealizarServico(Funcionario funcionario) {
		
		return "trabalho realizado pelo: "+ funcionario.getClass().getName();
		
	}
	
	public TFuncionario AplicarSalario(TFuncionario funcionario) {

		System.out.println("aumentar o salario do " + funcionario.getClass().getName());
				
		funcionario.AumentarSalario();
		
		if(funcionario.getClass().getName() == "Diretor") {
			
			((Diretor)funcionario).AprovarContrato();
			
		}
		
		
		return funcionario;
	}
		
}





