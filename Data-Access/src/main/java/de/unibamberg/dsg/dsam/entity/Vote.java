package de.unibamberg.dsg.dsam.entity;

import java.time.LocalDateTime;

/**
 * 
 * @author Kowshik Dipta Das Joy
 */
public class Vote {

	private String ID;
	private String VoteName;
	private LocalDateTime StartTime;
	private LocalDateTime EndTime;
	private boolean RemainderSentStatus;
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
	 * @return the voteName
	 */
	public String getVoteName() {
		return VoteName;
	}
	/**
	 * @param voteName the voteName to set
	 */
	public void setVoteName(String voteName) {
		VoteName = voteName;
	}
	/**
	 * @return the startTime
	 */
	public LocalDateTime getStartTime() {
		return StartTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalDateTime startTime) {
		StartTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public LocalDateTime getEndTime() {
		return EndTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(LocalDateTime endTime) {
		EndTime = endTime;
	}
	/**
	 * @return the remainderSentStatus
	 */
	public boolean isRemainderSentStatus() {
		return RemainderSentStatus;
	}
	/**
	 * @param remainderSentStatus the remainderSentStatus to set
	 */
	public void setRemainderSentStatus(boolean remainderSentStatus) {
		RemainderSentStatus = remainderSentStatus;
	}
	
}
