package br.com.example.creational.singleton;

import java.util.List;

// An interface that follows the Repository pattern.
public interface IRepository<T> {
	public void create(final T element);
	
	public List<T> getAll();
	
	public T getByIdentifier(final String identifier);
	
	public void update(final T element);
	
	public void delete(final T element);
}