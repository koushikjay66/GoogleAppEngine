/**
 * 
 */
package de.unibamberg.dsg.dsam.entity;

/**
 * @author Kowshik Dipta Das Joy
 */
public class Users {

	
	private String ID;
	private String FirstName;
	private String LastName;
	private String Faculty;
	private String EmailAddress;
	private int CastedVoteTo;
	private String AccessToken;
	private boolean TokenSent;
	private boolean TokenStatus;
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the faculty
	 */
	public String getFaculty() {
		return Faculty;
	}
	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(String faculty) {
		Faculty = faculty;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return EmailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	/**
	 * @return the castedVoteTo
	 */
	public int getCastedVoteTo() {
		return CastedVoteTo;
	}
	/**
	 * @param castedVoteTo the castedVoteTo to set
	 */
	public void setCastedVoteTo(int castedVoteTo) {
		CastedVoteTo = castedVoteTo;
	}
	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return AccessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		AccessToken = accessToken;
	}
	/**
	 * @return the tokenSent
	 */
	public boolean isTokenSent() {
		return TokenSent;
	}
	/**
	 * @param tokenSent the tokenSent to set
	 */
	public void setTokenSent(boolean tokenSent) {
		TokenSent = tokenSent;
	}
	/**
	 * @return the tokenStatus
	 */
	public boolean isTokenStatus() {
		return TokenStatus;
	}
	/**
	 * @param tokenStatus the tokenStatus to set
	 */
	public void setTokenStatus(boolean tokenStatus) {
		TokenStatus = tokenStatus;
	}
	
	
	
	
	
}
