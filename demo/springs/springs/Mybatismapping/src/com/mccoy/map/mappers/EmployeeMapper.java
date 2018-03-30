package com.mccoy.map.mappers;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mccoy.map.dto.EmployeeDTO;

public interface EmployeeMapper 
{

	String getById = "SELECT * FROM EMPLOYEE WHERE ID = #{id}";
	String getbyemailpassword="SELECT * FROM EMPLOYEE WHERE EMAIL= #{email}";
	String insert = "INSERT INTO EMPLOYEE (ID,NAME,EMAIL,DEPT,PASSWORD,ADRESS) VALUES (#{id},#{name},#{email},#{dept},#{password},{adto})";
	String update="UPDATE EMPLOYEE SET PASSWORD = #{password} WHERE ID = #{id}";
	String get="SELECT * FROM EMPLOYEE";
	
	@Insert(insert)
	void insert(EmployeeDTO e);
	
	
   /*  @Select(getbyemailpassword)
     @Results (value ={
 			@Result(property = "id", column = "ID"),
 			@Result(property = "name", column = "NAME"),
 			@Result(property = "password", column = "PASSWORD")
 	})
	public EmployeeDTO getbyemailpassword(String email);

    @Update(update)
	public void update(EmployeeDTO e);

    @Select(getById)
    @Results (value ={
 			@Result(property = "id", column = "ID"),
 			@Result(property = "name", column = "NAME"),
 			@Result(property = "email", column = "EMAIL")
 	})
	EmployeeDTO getById(int id);*/
	
	
	
	
}
