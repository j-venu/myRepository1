package com.capgemini.healthcare.dto;

public class HealthCareTest {
	String testId;
	String testName;

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + "]";
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

}
