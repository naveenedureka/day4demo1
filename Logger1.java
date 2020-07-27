package com.account;


@FunctionalInterface
public interface Logger1 {
	public void log(String message);

	static Logger1 info() {
		return message -> System.out.println("info: " + message);
	}

	static Logger1 warning() {
		return message -> System.out.println("warning: " + message);
	}
