package e1_hibernate1.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String pwd;
	private long phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", phone=" + phone + "]";
	}
	
	

}
