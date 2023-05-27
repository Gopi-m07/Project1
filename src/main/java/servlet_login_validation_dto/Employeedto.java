package servlet_login_validation_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employeedto {

	private String name;
	@Id
	private String email;
	private int pwd;
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
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
