package cn.space.tao.user.vo;

/**
 * 用户模块实体类
 * @author SPACE
 *
 */
public class User {
	private Integer id ; 
	private String username ; 
	private String password ;
	private String phonenumber ;
	private String email ;
	private String studentid ; 
	private String grade ; 
	private String classes ;
	private String dormitory ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
}
