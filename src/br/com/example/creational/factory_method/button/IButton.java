package br.com.example.creational.factory_method.button;

import br.com.example.creational.factory_method.rendering.IRenderingSupport;

public interface IButton extends IRenderingSupport {
	public void onTap();
	
	public void onLongPress();
}