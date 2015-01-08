package org.ohdsi.oae;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ohdsi.oae.OHDSIAnalyticsEnvironmentApp;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OHDSIAnalyticsEnvironmentApp.class)
@WebAppConfiguration
public class OHDSIAnalyticsEnvironmentAppTests {

	@Test
	public void contextLoads() {
	}

}
