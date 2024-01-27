package dto;

public class UserSignup 
{
	 private int userid;
	   private String username;
	   private long usercontect;
	   private String usermail;
	   private String userpassword;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUsercontect() {
		return usercontect;
	}
	public void setUsercontect(long usercontect) {
		this.usercontect = usercontect;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserassword() {
		return userpassword;
	}
	public void setUserpassword(String userassword) {
		this.userpassword = userassword;
	}
	@Override
	public String toString() {
		return "UserSignup [userid=" + userid + ", username=" + username + ", usercontect=" + usercontect
				+ ", usermail=" + usermail + ", userassword=" + userpassword + "]";
	}
	   
	   
		   
}
