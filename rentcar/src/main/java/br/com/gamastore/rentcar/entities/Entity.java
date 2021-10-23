package br.com.gamastore.rentcar.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class Entity {

	private UUID id;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private boolean active;
	
	public Entity() {
		id = UUID.randomUUID();
		var now = LocalDateTime.now();
		createdAt = now;
		updatedAt = now;
		active = true;
	}
	
}
