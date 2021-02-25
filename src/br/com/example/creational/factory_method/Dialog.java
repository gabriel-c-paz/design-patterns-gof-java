package br.com.example.creational.factory_method;

import br.com.example.creational.factory_method.button.IButton;

/*
 * This class is the major abstraction that will use the minor abstraction (the button).
 * 
 * Every dialog pop-up (at least in mobile applications) must have at least 
 * two buttons (one to cancel the action and one to accept).
 * */
public abstract class Dialog {
	private IButton okButton, cancelButton;
	
	/*
	 * If you want to build the button with the attributes filled in, use something like
	 * the private class data pattern.
	 * */
	Dialog() {
		this.okButton     = getButtonImplementationFactoryMethod();
		this.cancelButton = getButtonImplementationFactoryMethod();
	}
	
	/*
	 * This method will be implemented in the specializations of this class,
	 * instantiating the correct button specialization.
	 * 
	 * The protected visibility is because, the one who will use the specialization
	 * of this class, does not need to know about the existence of this method.
	 * */
	protected abstract IButton getButtonImplementationFactoryMethod();
}