import domain.store.entities.Car;
import domain.store.services.CarService;
import infra.data.repositories.CarRepository;

public class Program {

	public static void main(String[] args) {
		
		var repository = new CarRepository();
				
		var service = new CarService(repository);
				
		service.getOnly(carro -> carro.getBrand() == "VW" );
//		service.add(new Car("azul", "VW", 2013, 2014, "DOD1234", 80.5));
//		service.add(new Car("azul", "VW", 2013, 2014, "DOD1234", 80.5));
//		service.add(new Car("azul", "VW", 2013, 2014, "DOD1234", 80.5));
//		service.add(new Car("azul", "VW", 2013, 2014, "DOD12345", 80.5));
//		service.add(new Car("azul", "VW", 2013, 2014, "DOD1234", 80.5));
//		service.add(new Car("azul", "FIAT", 2013, 2014, "DOD12345", 80.5));
//		service.add(new Car("azul", "FIAT", 2013, 2014, "DOD12345", 80.5));
//		
//		var pelaPlaca = service.getMany(carro -> carro.getLicensePlate() == "DOD1234");
//		var pelaMarca = service.getMany(carro -> carro.getBrand() == "FIAT");
//		
//		System.out.println(pelaPlaca);
//		System.out.println(pelaMarca);
		
		//System.out.println(result);
	}
}
