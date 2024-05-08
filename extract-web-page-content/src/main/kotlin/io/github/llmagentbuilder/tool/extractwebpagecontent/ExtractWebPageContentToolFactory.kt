package io.github.llmagentbuilder.tool.extractwebpagecontent

import io.github.llmagentbuilder.core.tool.EnvironmentVariableConfigurableAgentToolFactory

class ExtractWebPageContentToolFactory :
    EnvironmentVariableConfigurableAgentToolFactory<ExtractWebPageContentTool, ExtractWebPageContentConfig>(
        ExtractWebPageContentConfig::class.java, "${toolName}_"
    ) {
    override fun create(config: ExtractWebPageContentConfig): ExtractWebPageContentTool {
        return ExtractWebPageContentTool(config)
    }

    override fun configName(): String {
        return toolName
    }
}