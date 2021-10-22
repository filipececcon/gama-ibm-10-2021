package domain.shared.entities;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Entity {

	private UUID id;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	private Boolean active;
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Entity() 
	{
		id = UUID.randomUUID();
		var now = LocalDate.now();
		createdAt = now;
		updatedAt = now;
		active = true;
	}
	
}
