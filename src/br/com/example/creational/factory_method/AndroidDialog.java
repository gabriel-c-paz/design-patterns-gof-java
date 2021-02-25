package br.com.example.creational.factory_method;

import br.com.example.creational.factory_method.button.specializations.AndroidButton;

public class AndroidDialog extends Dialog {
	@Override
	protected final AndroidButton getButtonImplementationFactoryMethod() {
		return new AndroidButton();
	}
}