package com.bizpoll.dto;

import java.sql.Timestamp;

public class BoardDTO {
	private int articleNo;
	private String subject;
	private String content;
	private String passwd;
	private Timestamp reg_date;
	private int readcount;
	private String id;
	private int ref;
	private int re_step;
	private int re_level;
	private String fileName;
	
	public BoardDTO() {
	}

	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Timestamp getReg_date() {
		return reg_date;
	}

	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getRe_step() {
		return re_step;
	}

	public void setRe_step(int re_step) {
		this.re_step = re_step;
	}

	public int getRe_level() {
		return re_level;
	}

	public void setRe_level(int re_level) {
		this.re_level = re_level;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "BoardDTO [articleNo=" + articleNo + ", subject=" + subject + ", content=" + content + ", passwd="
				+ passwd + ", reg_date=" + reg_date + ", readcount=" + readcount + ", id=" + id + ", ref=" + ref
				+ ", re_step=" + re_step + ", re_level=" + re_level + ", fileName=" + fileName + "]";
	}

}
