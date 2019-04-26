package com.java.entity;

import java.io.Serializable;
import java.util.Date;

public class SysFileObj implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String filePath;
	private String oldFileName;
	private String newFileName;
	private Integer filePosition;
	private Integer fileSize;
	private Integer uploadUserId;
	private Date uploadDate;
	private Integer operationId;
	private Integer fileOrder;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getOldFileName() {
		return oldFileName;
	}
	public void setOldFileName(String oldFileName) {
		this.oldFileName = oldFileName;
	}
	public String getNewFileName() {
		return newFileName;
	}
	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}
	public Integer getFilePosition() {
		return filePosition;
	}
	public void setFilePosition(Integer filePosition) {
		this.filePosition = filePosition;
	}
	public Integer getFileSize() {
		return fileSize;
	}
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
	public Integer getUploadUserId() {
		return uploadUserId;
	}
	public void setUploadUserId(Integer uploadUserId) {
		this.uploadUserId = uploadUserId;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public Integer getOperationId() {
		return operationId;
	}
	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
	}
	public Integer getFileOrder() {
		return fileOrder;
	}
	public void setFileOrder(Integer fileOrder) {
		this.fileOrder = fileOrder;
	}
	

}
