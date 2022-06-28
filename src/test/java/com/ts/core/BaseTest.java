package com.ts.core;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

import java.io.IOException;
import java.nio.file.Path;

public class BaseTest {

    public void reportThat(String title, String reportContent){
        Serenity.recordReportData().withTitle(title).andContents(reportContent);
    }

    public void reportFile(String title, Path filePath) throws IOException {
        Serenity.recordReportData().withTitle(title).fromFile(filePath);
    }

    protected EnvironmentVariables environmentVariables;

    protected String getEnvironmentProperty(String propertyName){
        return EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty(propertyName);
    }



}
