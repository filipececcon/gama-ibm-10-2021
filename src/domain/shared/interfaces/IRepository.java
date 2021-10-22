package domain.shared.interfaces;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

import domain.shared.entities.Entity;

public interface IRepository<T extends Entity> {
	
	T getOnly(Predicate<T> predicate);
	
	List<T> getMany(Predicate<T> predicate);
	
	void add(T entity);
	
	void remove(UUID id);
	
	void remove(T entity);
}
