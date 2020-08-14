package com.lls.pushlog.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

	private Integer Id;
	private String Type;
	private String UserName;
	private String PassWord;
	private String Sex;
	private String Age;
	private Date ExpireDate;
	private String RemindDays;
	private String UserPrivilege;
	private String PeDesc;
	private Date PeDate;
	private String Remark;
	private Date tokenTime;
	private String PrivilegeName;

}
