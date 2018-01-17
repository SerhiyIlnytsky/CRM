package com.jocker.crm.cucumber.stepdefs;

import com.jocker.crm.CrmApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CrmApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
