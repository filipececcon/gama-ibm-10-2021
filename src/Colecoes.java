import java.util.ArrayList;
import java.util.LinkedList;

public class Colecoes {

	public static void main(String[] args) {
		
		//bom para interações, e acesso dos dados e consulta
		//não apropriado para alterções da estrutura como, deleção de elementos
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("joao");
		lista.add("maria");
		lista.add("jose");
				
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println(lista.get(0));

		//bom para alteraçoes dos elementos
		//não apropriado para consultas e obtenção elementos por indice
		var nomes2 = new LinkedList<String>();
		nomes2.add("asd");
		
		
		
		
		
		// ["joao"p->jose, "joao"<-a"jose"p->maria, 3 ...]
		
		
		//Collection
//		List-> ArrayList, LinkedList, 
//		Set -> Hashset
		
		
		
	}

}
