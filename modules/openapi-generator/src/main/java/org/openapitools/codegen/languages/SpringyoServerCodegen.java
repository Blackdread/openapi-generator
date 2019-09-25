package org.openapitools.codegen.languages;

import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.CodegenType;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.SupportingFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class SpringyoServerCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    static Logger LOGGER = LoggerFactory.getLogger(SpringyoServerCodegen.class);

    public CodegenType getTag() {
        return CodegenType.SERVER;
    }

    public String getName() {
        return "springyo";
    }

    public String getHelp() {
        return "Generates a springyo server.";
    }

    public SpringyoServerCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "springyo";
        modelTemplateFiles.put("model.mustache", ".zz");
        apiTemplateFiles.put("api.mustache", ".zz");
        embeddedTemplateDir = templateDir = "springyo-server";
        apiPackage = File.separator + "Apis";
        modelPackage = File.separator + "Models";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        // TODO: Fill this out.
    }
}
