package br.com.example.creational.singleton;

import java.util.List;

/*
 * Any class that implements the IRepository<T> interface for a data type, does not
 * present the need for multiple instances (at least in a common scenario). Therefore,
 * we use the Singleton pattern to control the object's instances.
 * */
public final class UserRepository implements IRepository<User> {
	private static UserRepository instance;
	
	private UserRepository() {}
	
	@Override
	public final void create(final User element) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public final List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public final User getByIdentifier(final String identifier) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public final void update(final User element) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public final void delete(final User element) {
		// TODO Auto-generated method stub
	}
	
	/*
	 * This method will manage the creation of the object (which will be done in a lazy way), in
	 * addition to controlling the access of multiple threads at the same time (avoiding the creation
	 * of multiple objects).
	 * */
	public final static UserRepository getInstance() {
		if (instance == null)
			synchronized (UserRepository.class) {
				instance = new UserRepository();
			}
		
		return instance;
	}
}