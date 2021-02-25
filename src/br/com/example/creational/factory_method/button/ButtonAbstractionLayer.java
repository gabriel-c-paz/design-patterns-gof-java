package br.com.example.creational.factory_method.button;

// This layer is necessary to avoid duplicating attributes.
abstract public class ButtonAbstractionLayer implements IButton {
	private String text;
	private Color  color;
	
	public ButtonAbstractionLayer() {}
	
	public ButtonAbstractionLayer(final String text, final Color color) {
		this.text  = text;
		this.color = color;
	}
	
	public final String getText() {
		return text;
	}
	
	public final Color getColor() {
		return color;
	}
	
	public final void setText(final String text) {
		this.text = text;
	}
	
	public final void setColor(final Color color) {
		this.color = color;
	}
	
	// These methods can use a function passed by the constructor parameter.
	@Override
	public final void onTap() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public final void onLongPress() {
		// TODO Auto-generated method stub
	}
}