package com.oracle.diva.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DP_ARCHIVED_OBJECTS")
public class DivaObject {
	
	@Id
	@Column(name="AO_ID")
	private Long aoId;
	
	@Column(name="AO_UUID") 
	private String aoUUID; 
	
	@Column(name="AO_OBJECT_NAME")
	private String aoObjectName;
	
	@Column(name="AO_CATEGORY")
	private String ao_Category;  
	
	@Column(name="AO_COMPONENT_NUMBER")
	private Integer aoComponentNumber;
	
	@Column(name="AO_FOLDER_COUNT")
	private Integer aoFolderCount;
	
	@Column(name="AO_COMMENT") 
	private String aoComment;  
	
	@Column(name="AO_SOURCE_NAME")
	private String aoSourceName;  
	
	@Column(name="AO_ROOT_ON_SOURCE")
	private String aoRootOnSource; 
	
	@Column(name="AO_DATE_ARCHIVE")
	private Date aoDateArchive;  
	
	@Column(name="AO_NUMBER_INSTN_ON_DISK") 
	private Integer aoNumberInstnOnDisk;
	
	@Column(name="AO_NUMBER_INSTN_ON_TAPE")
	private Integer aoNumberInstnOnTape;
	
	@Column(name="AO_EXPORTED_INSTN_COUNT")
	private Integer aoExportedInstnCount;
	
	@Column(name="AO_LAST_READ") 
	private Date aoLastRead;  
	
	@Column(name="AO_OBJECT_LOCKED") 
	private String aoObjectLocked;
	
	@Column(name="AO_IS_COMPLEX")
	private String aoIsComplex;  
	
	@Column(name="AO_OA_ID") 
	private Integer aoOaId;
	
	@Column(name="AO_OBJECT_SIZE")
	private Long aoObjectSize;
	
	@Column(name="AO_OBJECT_SIZE_BYTES")
	private Long aoObjectSizeBytes;
	
	@Column(name="AO_NUM_EMPTY_FILES")
	private Integer aoNumEmptyFiles;
	
	@Column(name="AO_NUM_EMPTY_DIRECTORIES") 
	private Integer aoNumEmptyDirectories;

	public Long getAoId() {
		return aoId;
	}

	public void setAoId(Long aoId) {
		this.aoId = aoId;
	}

	public String getAoUUID() {
		return aoUUID;
	}

	public void setAoUUID(String aoUUID) {
		this.aoUUID = aoUUID;
	}

	public String getAoObjectName() {
		return aoObjectName;
	}

	public void setAoObjectName(String aoObjectName) {
		this.aoObjectName = aoObjectName;
	}

	public String getAo_Category() {
		return ao_Category;
	}

	public void setAo_Category(String ao_Category) {
		this.ao_Category = ao_Category;
	}

	public Integer getAoComponentNumber() {
		return aoComponentNumber;
	}

	public void setAoComponentNumber(Integer aoComponentNumber) {
		this.aoComponentNumber = aoComponentNumber;
	}

	public Integer getAoFolderCount() {
		return aoFolderCount;
	}

	public void setAoFolderCount(Integer aoFolderCount) {
		this.aoFolderCount = aoFolderCount;
	}

	public String getAoComment() {
		return aoComment;
	}

	public void setAoComment(String aoComment) {
		this.aoComment = aoComment;
	}

	public String getAoSourceName() {
		return aoSourceName;
	}

	public void setAoSourceName(String aoSourceName) {
		this.aoSourceName = aoSourceName;
	}

	public String getAoRootOnSource() {
		return aoRootOnSource;
	}

	public void setAoRootOnSource(String aoRootOnSource) {
		this.aoRootOnSource = aoRootOnSource;
	}

	public Date getAoDateArchive() {
		return aoDateArchive;
	}

	public void setAoDateArchive(Date aoDateArchive) {
		this.aoDateArchive = aoDateArchive;
	}

	public Integer getAoNumberInstnOnDisk() {
		return aoNumberInstnOnDisk;
	}

	public void setAoNumberInstnOnDisk(Integer aoNumberInstnOnDisk) {
		this.aoNumberInstnOnDisk = aoNumberInstnOnDisk;
	}

	public Integer getAoNumberInstnOnTape() {
		return aoNumberInstnOnTape;
	}

	public void setAoNumberInstnOnTape(Integer aoNumberInstnOnTape) {
		this.aoNumberInstnOnTape = aoNumberInstnOnTape;
	}

	public Integer getAoExportedInstnCount() {
		return aoExportedInstnCount;
	}

	public void setAoExportedInstnCount(Integer aoExportedInstnCount) {
		this.aoExportedInstnCount = aoExportedInstnCount;
	}

	public Date getAoLastRead() {
		return aoLastRead;
	}

	public void setAoLastRead(Date aoLastRead) {
		this.aoLastRead = aoLastRead;
	}

	public String getAoObjectLocked() {
		return aoObjectLocked;
	}

	public void setAoObjectLocked(String aoObjectLocked) {
		this.aoObjectLocked = aoObjectLocked;
	}

	public String getAoIsComplex() {
		return aoIsComplex;
	}

	public void setAoIsComplex(String aoIsComplex) {
		this.aoIsComplex = aoIsComplex;
	}

	public Integer getAoOaId() {
		return aoOaId;
	}

	public void setAoOaId(Integer aoOaId) {
		this.aoOaId = aoOaId;
	}

	public Long getAoObjectSize() {
		return aoObjectSize;
	}

	public void setAoObjectSize(Long aoObjectSize) {
		this.aoObjectSize = aoObjectSize;
	}

	public Long getAoObjectSizeBytes() {
		return aoObjectSizeBytes;
	}

	public void setAoObjectSizeBytes(Long aoObjectSizeBytes) {
		this.aoObjectSizeBytes = aoObjectSizeBytes;
	}

	public Integer getAoNumEmptyFiles() {
		return aoNumEmptyFiles;
	}

	public void setAoNumEmptyFiles(Integer aoNumEmptyFiles) {
		this.aoNumEmptyFiles = aoNumEmptyFiles;
	}

	public Integer getAoNumEmptyDirectories() {
		return aoNumEmptyDirectories;
	}

	public void setAoNumEmptyDirectories(Integer aoNumEmptyDirectories) {
		this.aoNumEmptyDirectories = aoNumEmptyDirectories;
	}

}
