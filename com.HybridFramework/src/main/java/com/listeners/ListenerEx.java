package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;
import com.google.gson.LongSerializationPolicy;

public class ListenerEx extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test= report.createTest(result.getName());
		log.info("extent test initiated");
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(test.getStatus().PASS, "testcase passed");
		log.info("testcase passed with name: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test.log(test.getStatus().FAIL, "testcase failed");
		log.info("testcase failed with name: "+result.getName());
		log.info("capturing screenshot as test failed");
		test.addScreenCaptureFromPath(getScreenshot(result.getName()));
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(test.getStatus().SKIP, "testcase skipped");
		log.info("testcase skipped with name: "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		log.info("test suite started");
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		log.info("test suite finished");
		
	}

	
}
