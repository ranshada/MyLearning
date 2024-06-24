package com.example;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class EductiuveIO {

    public static void main(String[] args) {
//        ChromeOptions options = new ChromeOptions();
//        //options.addExtensions(new File("<path to extension file>")); // add an extension
//        options.setAcceptInsecureCerts(true); // accept all SSL certs by defaults
//        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
//        //options.setHeadless(true); // To run Chrome browser in a headless environment
//        options.addArguments("start-maximized"); // Start Chrome Chromemaximized
        Map<String, String> mobileEmulation = new HashMap<>();

// adding name of the device to emulate
        mobileEmulation.put("deviceName", "iPhone X");

        ChromeOptions chromeOptions = new ChromeOptions();

// Experimental Option needs to be set for emulation
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(chromeOptions);
        //WebDriver driver = new ChromeDriver();
        System.out.println("Done");
    }
// `executable_path` can be excluded if the driver is in the classpath already
    }
