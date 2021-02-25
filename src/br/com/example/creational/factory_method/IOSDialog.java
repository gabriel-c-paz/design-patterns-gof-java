package br.com.example.creational.factory_method;

import br.com.example.creational.factory_method.button.specializations.IOSButton;

public final class IOSDialog extends Dialog {
	@Override
	protected final IOSButton getButtonImplementationFactoryMethod() {
		return new IOSButton();
	}
}