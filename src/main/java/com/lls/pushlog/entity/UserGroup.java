package com.lls.pushlog.entity;

import lombok.Data;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class UserGroup {

	private Integer Id;
	private Integer GroupId;
	private String GroupName;
	private String PeDesc;
	private Date PeDate;
	private String Remark;
	private String Exception;
	
	private Set<UserGroupRelation> userGroupRelations = new HashSet<UserGroupRelation>();
//	private Set<GroupPrivilegeRelation> groupPrivilegeRelations = new HashSet<GroupPrivilegeRelation>();

}
