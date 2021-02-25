package br.com.example.creational.factory_method.button.specializations;

import br.com.example.creational.factory_method.button.ButtonAbstractionLayer;
import br.com.example.creational.factory_method.button.Color;

public final class AndroidButton extends ButtonAbstractionLayer {
	public AndroidButton() {}
	
	public AndroidButton(final String text, final Color color) {
		super(text, color);
	}
	
	@Override
	public final void render() {
		// TODO Auto-generated method stub
	}
}