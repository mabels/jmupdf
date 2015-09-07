/*
 * 
 * See copyright file
 *  
 */
package com.jmupdf.interfaces;

import com.jmupdf.document.DocumentOutline;
import com.jmupdf.enums.DocumentType;
import com.jmupdf.exceptions.PageException;

/**
 * Document Interface
 * 
 * @author Pedro J Rivera
 *
 */
public interface Document {

	/**
	 * Get document handle 
	 * @return
	 */
	long getHandle();
	
	/**
	 * Get max memory used to store information.</br>
	 * The default value will be 20mb
	 * @return
	 */
	int getMaxStore();
	
	/**
	 * Get document version
	 * @return
	 */
	int getVersion();

	/**
	 * Get document type
	 * @return
	 */
	DocumentType getType();
	
	/**
	 * Get document full path plus name
	 * @return
	 */
	String getDocumentName();

	/**
	 * Get document file name
	 * @return
	 */
	String getFileName();

	/**
	 * Get document path
	 * @return
	 */
	String getPath();

	/**
	 * Get document password
	 * @return
	 */
	String getPassWord();

	/**
	 * Get document outline
	 * @return
	 */
	DocumentOutline getOutline();
	
	/**
	 * Get total pages in document
	 * @return 
	 */
	int getPageCount();

	/**
	 * Create a new page object.   
	 * @param page
	 * @return
	 */
	Page getPage(int page) throws PageException;

	/**
	 * Close document and dispose of resources
	 */
	void dispose();

}
