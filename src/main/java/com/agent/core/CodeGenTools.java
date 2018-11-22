package com.agent.core;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;

import javax.xml.bind.JAXB;
import java.io.File;

public class CodeGenTools {

    public static void main(String[] args) throws Exception {
        Configuration configuration = JAXB.unmarshal(new File("D:\\agentProject\\agentProject\\agentCoreService\\src\\main\\resources\\codeGen.xml"), Configuration.class);
        configuration.getJdbc()
                .withDriver("com.mysql.jdbc.Driver")
                .withUrl("jdbc:mysql://139.224.36.65:3307")
                .withUser("dba")
                .withPassword("dba")
                .withSchema("ifpay_ccpay");
        GenerationTool.generate(configuration);
    }
}
