package com.krunaldarji.inventoryManagement.product.exception;

public class ResourceNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String entity;
	private String attribute;
	private Object attributeValue;
	
	public ResourceNotFoundException(String entity, String attribute, Object attributeValue) {
		super();
		this.entity = entity;
		this.attribute = attribute;
		this.attributeValue = attributeValue;
	}
	
	public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

	@Override
	public String toString() {
		return entity + " with " + attribute + " value " + attributeValue + " does not exist";
	}
	

}
