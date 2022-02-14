package com.atlassian.tutorial.myPlugin;

import com.atlassian.jira.web.action.JiraWebActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TESTDEVAction extends JiraWebActionSupport {
    private static final Logger log = LoggerFactory.getLogger(TESTDEVAction.class);


    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }
//
//    private void doSave(){
//        System.out.println("123445");
//
//    }
}
