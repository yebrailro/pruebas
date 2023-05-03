package com.Tunder.pruebas.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class TestLinkIntegration {
	public static final String TESTLINK_KEY = "9253044718b11729a661074a0cbf8f3b";
	public static final String TESTLINK_URL = "https://testlink.labdigitalbdblifecycle.co/lib/api/xmlrpc/v1/xmlrpc.php";
	public static final String TEST_PROJECT_NAME = "PruebasA";
	public static final String TEST_PLAN_NAME = "PruebasJefferson";
	public static final String BUILD_NAME = "Build_Pruebas_Automatizadas";
	private static final Logger LOGGER = LoggerFactory.getLogger(TestLinkIntegration.class);
	public static Boolean marcacionHabilitada = false;

	public TestLinkIntegration() {
		LOGGER.info("TestLinkIntegration");
		throw new IllegalStateException("Utility class");
	}

	public static void updateResults(String testCaseName, String exception, String results)
			throws TestLinkAPIException {
		TestLinkAPIClient testLink = new TestLinkAPIClient(TESTLINK_KEY, TESTLINK_URL);
		testLink.reportTestCaseResult(TEST_PROJECT_NAME, TEST_PLAN_NAME, testCaseName, BUILD_NAME, exception, results);
	}

	public static void actualizarCPPassed(String nombreCP) throws TestLinkAPIException {
		TestLinkIntegration.updateResults(nombreCP, null, TestLinkAPIResults.TEST_PASSED);
	}

	public static void actualizarCPFailed(String nombreCP) throws TestLinkAPIException {
		TestLinkIntegration.updateResults(nombreCP, "error", TestLinkAPIResults.TEST_FAILED);
	}

	public static void ejecucionCP(String resultadoActual, String resultadoEsperado, String nombreCP)
			throws TestLinkAPIException {
		if (marcacionHabilitada) {
			if (resultadoActual.equals(resultadoEsperado)) {
				System.out.println(nombreCP + " PASSED");
				TestLinkIntegration.actualizarCPPassed(nombreCP);
			} else {
				System.out.println(nombreCP + " FAILED");
				TestLinkIntegration.actualizarCPFailed(nombreCP);
			}
		}
	}
}