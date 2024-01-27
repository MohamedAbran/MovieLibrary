package dto;

public class AdminSignup 
{
   private int adminid;
   private String adminname;
   private long admincontect;
   private String adminmail;
   private String adminpassword;
public int getAdminid() {
	return adminid;
}
public void setAdminid(int adminid) {
	this.adminid = adminid;
}
public String getAdminname() {
	return adminname;
}
public void setAdminname(String adminname) {
	this.adminname = adminname;
}
public long getAdmincontect() {
	return admincontect;
}
public void setAdmincontect(long admincontect) {
	this.admincontect = admincontect;
}
public String getAdminmail() {
	return adminmail;
}
public void setAdminmail(String adminmail) {
	this.adminmail = adminmail;
}
public String getAdminpassword() {
	return adminpassword;
}
public void setAdminpassword(String adminpassword) {
	this.adminpassword = adminpassword;
}
@Override
public String toString() {
	return "AdminSignup [adminid=" + adminid + ", adminname=" + adminname + ", admincontect=" + admincontect
			+ ", adminmail=" + adminmail + ", adminpassword=" + adminpassword + "]";
}


   
}
