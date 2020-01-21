/**
 * 
 */
package de.unibamberg.dsg.dsam.entity;

/**
 * @author Kowshik Dipta Das Joy
 *
 */
public class Admin {

	private String AdminUserID;
	private String AdminPassword;
	
	/**
	 * @return the adminUserID
	 */
	public String getAdminUserID() {
		return AdminUserID;
	}
	/**
	 * @param adminUserID the adminUserID to set
	 */
	public void setAdminUserID(String adminUserID) {
		AdminUserID = adminUserID;
	}
	/**
	 * @return the adminPassword
	 */
	public String getAdminPassword() {
		return AdminPassword;
	}
	/**
	 * @param adminPassword the adminPassword to set
	 */
	public void setAdminPassword(String adminPassword) {
		AdminPassword = adminPassword;
	}

}
