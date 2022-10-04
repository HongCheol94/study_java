package com.hongcheol.study.ch13.second;

public class Product<T , M> {

	private T kind;	// String? Integer? another object?
	//private car kind;
	private M model;
	// private car model;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
