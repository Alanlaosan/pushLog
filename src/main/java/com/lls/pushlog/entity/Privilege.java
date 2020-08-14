package com.lls.pushlog.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Privilege {

	private Integer Id;
	private Integer PrivilegeId;
	private String PrivilegeName;
	private String PeDesc;
	private Date PeDate;
	private String Remark;

}
