package io.github.llmagentbuilder.tool.extractwebpagecontent

import io.github.llmagentbuilder.core.tool.ConfigurableAgentToolFactory

class ExtractWebPageContentToolFactory :
    ConfigurableAgentToolFactory<ExtractWebPageContentConfig, ExtractWebPageContentTool> {
    override fun create(config: ExtractWebPageContentConfig?): ExtractWebPageContentTool {
        return ExtractWebPageContentTool(config)
    }

    override fun toolId(): String {
        return toolId
    }
}