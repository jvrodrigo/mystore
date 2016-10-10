package com.erp.models;

import java.util.ArrayList;

import org.springframework.security.web.header.Header;

public class GenericResponse {

	private int totalCount;
	private int start;
	private int limit;
	private ArrayList<Object> items;
	private String message;
	private int code;
//	private Header header;
	
	// Constructor
	public GenericResponse() {
		this.totalCount = 0;
		this.start = 0;
		this.limit = 0;
		this.items = new ArrayList<Object>();
		this.message = "No message";
		this.code = 0;
//		this.header = new Header("from", "ERP to sale");
	}
	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(int start) {
		this.start = start;
	}
	/**
	 * @return the limit
	 */
	public int getLimit() {
		return limit;
	}
	/**
	 * @param limit the limit to set
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}
	/**
	 * @return the items
	 */
	public ArrayList<Object> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Object> items) {
		this.items = items;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the header
	 */
//	public Header getHeader() {
//		return header;
//	}
	/**
	 * @param header the header to set
	 */
//	public void setHeader(Header header) {
//		this.header = header;
//	}
	
}
