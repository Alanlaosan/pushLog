package com.lls.pushlog.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class UserGroupRelation {

	private Integer Id;
	private Integer UserId;
	private Integer GroupId;
	private String PeDesc;
	private Date PeDate;
	private String Remark;

}
