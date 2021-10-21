package domain.store;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Entity {

	private UUID id;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private Boolean active;
	
	public Entity() 
	{
		id = UUID.randomUUID();
		var now = LocalDate.now();
		createdAt = now;
		updatedAt = now;
		active = true;
	}
	
}
