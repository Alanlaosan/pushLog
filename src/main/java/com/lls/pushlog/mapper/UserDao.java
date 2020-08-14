package com.lls.pushlog.mapper;

import com.lls.pushlog.common.PageModel;
import com.lls.pushlog.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

	@Select("select * from pe_user order by id")
	public List<User> findAllUsers();

	public User findUserById(Integer id);

	public void remove(int id);

	@Insert("insert into pe_user(id,type,userName,passWord,sex,age,peDesc,remark) values(#{id},#{type},#{userName},#{passWord},#{sex},#{age},#{peDesc},#{remark})")
	public void save(User user);

	public void update(User user);
	
    public PageModel findAllUsersByPaging(int offset, int pagesize);
    
    public User findUserByUsernameAndPassword(User user); 
    
    public Integer findUser_Group_PrivilegeByUsername_Password_PrivilegeName(String userName, String passWord, String privilegeName); 
    
    public Integer findUserByUsername(String userName);

	public List<String> getUserNames(); 
}