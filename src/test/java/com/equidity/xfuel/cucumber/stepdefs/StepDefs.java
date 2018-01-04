package com.equidity.xfuel.cucumber.stepdefs;

import com.equidity.xfuel.XutilityApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = XutilityApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
