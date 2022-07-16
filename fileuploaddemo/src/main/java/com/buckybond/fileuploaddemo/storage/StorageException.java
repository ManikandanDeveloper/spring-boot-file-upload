package com.buckybond.fileuploaddemo.storage;

public class StorageException extends RuntimeException {
	private static final long serialVersionUID = 5040665641435777602L;

	public StorageException(String message) {
		super(message);
	}

	public StorageException(String message, Throwable cause) {
		super(message, cause);
	}
}
