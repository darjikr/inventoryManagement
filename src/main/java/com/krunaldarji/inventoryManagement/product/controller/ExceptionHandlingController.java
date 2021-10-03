package com.krunaldarji.inventoryManagement.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.krunaldarji.inventoryManagement.product.exception.ResourceNotFoundException;



@ControllerAdvice
public class ExceptionHandlingController {
	
private static final Logger log = LoggerFactory.getLogger(ExceptionHandlingController.class);
	
	@ExceptionHandler(value = {ResourceNotFoundException.class})
	public ResponseEntity<String> handleStockNotFoundException(ResourceNotFoundException ex) {
		log.error(ex.getMessage(),ex);
		return new ResponseEntity<String>(ex.toString(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<String> handleException(Exception ex) {
		log.error(ex.getMessage(),ex);
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
