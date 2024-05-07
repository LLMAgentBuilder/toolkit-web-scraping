package io.github.llmagentbuilder.tool.baidusearch

import io.github.llmagentbuilder.core.tool.EnvironmentVariableConfigurableAgentToolFactory

class BaiduSearchToolFactory :
    EnvironmentVariableConfigurableAgentToolFactory<BaiduSearchTool, BaiduSearchConfig>(
        BaiduSearchConfig::class.java, "${toolName}_"
    ) {
    override fun create(config: BaiduSearchConfig): BaiduSearchTool {
        return BaiduSearchTool(config)
    }

    override fun configName(): String {
        return toolName
    }
}