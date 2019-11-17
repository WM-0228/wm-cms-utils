/**   
 * 
 * @Title: User.java 
 * @Prject: wangming-utils
 * @Package: com.wangming.test 
 * @Description: TODO
 * @author: WM  
 * @date: 2019年11月11日 上午10:36:58 
 * @version: V1.0   
 */
package com.wangming.test;

/** 
 * @ClassName: User 
 * @Description: TODO
 * @author:WM 
 * @date: 2019年11月11日 上午10:36:58  
 */
public class User {

	private Integer id;
	
	private String name;

	/** 
	 * @Title:User
	 * @Description:TODO  
	 */
	public User() {
		super();
	}

	/** 
	 * @Title:User
	 * @Description:TODO 
	 * @param id
	 * @param name 
	 */
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
