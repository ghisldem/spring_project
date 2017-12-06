package fr.gd.irc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable {


	private static final long serialVersionUID = 2381775979321782950L;
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String firstname;
	@Column
	private String login;
	@Column
	private String mail;
	@Column
	private String password;

	public User() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", login=");
		builder.append(login);
		builder.append(", mail=");
		builder.append(mail);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
	

}
