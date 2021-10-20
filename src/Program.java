import java.util.ArrayList;

import pacote2.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		var enc = new Encanador("123");
		var dir = new Diretor("67986798");
		
		enc.caixaDeFerramentas.add("grifo");
		enc.caixaDeFerramentas.add("chave de boca");
		
		//System.out.println(enc.caixaDeFerramentas);
		
		AplicarSalario(enc);
		AplicarSalario(dir);
		
		//nao funciona para outro tipo que nao derive de Funcionario
		//var obj = new Object();
		//AplicarSalario(obj);
		
		System.out.println(enc.getSalario());
		System.out.println(dir.getSalario());
	}
	
	public static void AplicarSalario(Funcionario funcionario) {

		System.out.println("aumentar o salario do " + funcionario.getClass().getName());
		
		
		funcionario.AumentarSalario();
	}
}
