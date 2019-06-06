package proj.a2.model.entity;

import javax.persistence.*;

@Entity
@Table(name="userAccount")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private int userId;

	@Column(name = "userName",length = 30,nullable = false)
	private String userName;

	@Column(name = "userPassword",length = 30,nullable = false)
	private String userPassword;

	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAccount( String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserAccount{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				'}';
	}
}
