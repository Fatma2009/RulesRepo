package com.start;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Loan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Age Pre Qualification")
	private java.lang.Boolean agePreQualification;
	@org.kie.api.definition.type.Label(value = "Aoumnt")
	private java.lang.Double amount;
	@org.kie.api.definition.type.Label(value = "Comment")
	private java.lang.String comment;
	@org.kie.api.definition.type.Label(value = "Duration")
	private java.lang.Integer duration;
	@org.kie.api.definition.type.Label(value = "Interest Rate")
	private java.lang.Double interestRate;
	@org.kie.api.definition.type.Label(value = "Loan Pre Quaification")
	private java.lang.Boolean loanPreQualification;
	@org.kie.api.definition.type.Label(value = "Monthly Repayment")
	private java.lang.Double monthlyRepayment;

	public Loan() {
	}

	public java.lang.Boolean getAgePreQualification() {
		return this.agePreQualification;
	}

	public void setAgePreQualification(java.lang.Boolean agePreQualification) {
		this.agePreQualification = agePreQualification;
	}

	public java.lang.Double getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Double amount) {
		this.amount = amount;
	}

	public java.lang.String getComment() {
		return this.comment;
	}

	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}

	public java.lang.Integer getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.Integer duration) {
		this.duration = duration;
	}

	public java.lang.Double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(java.lang.Double interestRate) {
		this.interestRate = interestRate;
	}

	public java.lang.Boolean getLoanPreQualification() {
		return this.loanPreQualification;
	}

	public void setLoanPreQualification(java.lang.Boolean loanPreQualification) {
		this.loanPreQualification = loanPreQualification;
	}

	public java.lang.Double getMonthlyRepayment() {
		return this.monthlyRepayment;
	}

	public void setMonthlyRepayment(java.lang.Double monthlyRepayment) {
		this.monthlyRepayment = monthlyRepayment;
	}

	public Loan(java.lang.Boolean agePreQualification, java.lang.Double amount,
			java.lang.String comment, java.lang.Integer duration,
			java.lang.Double interestRate,
			java.lang.Boolean loanPreQualification,
			java.lang.Double monthlyRepayment) {
		this.agePreQualification = agePreQualification;
		this.amount = amount;
		this.comment = comment;
		this.duration = duration;
		this.interestRate = interestRate;
		this.loanPreQualification = loanPreQualification;
		this.monthlyRepayment = monthlyRepayment;
	}

}