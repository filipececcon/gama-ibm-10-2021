package br.com.gamastore.rentcar.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SuperEntity {

	@Id
	private UUID id;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private boolean active;
	
	public SuperEntity() {
		id = UUID.randomUUID();
		var now = LocalDateTime.now();
		createdAt = now;
		updatedAt = now;
		active = true;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
