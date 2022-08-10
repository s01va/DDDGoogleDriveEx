package dddgoogledriveex.common;

import dddgoogledriveex.DashboardApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboardApplication.class })
public class CucumberSpingConfiguration {}
