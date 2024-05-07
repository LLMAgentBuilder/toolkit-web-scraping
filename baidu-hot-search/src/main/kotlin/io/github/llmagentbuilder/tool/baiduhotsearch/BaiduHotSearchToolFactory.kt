package io.github.llmagentbuilder.tool.baiduhotsearch

import io.github.llmagentbuilder.core.tool.EnvironmentVariableConfigurableAgentToolFactory

class BaiduHotSearchToolFactory :
    EnvironmentVariableConfigurableAgentToolFactory<BaiduHotSearchTool, BaiduHotSearchConfig>(
        BaiduHotSearchConfig::class.java, "${toolName}_"
    ) {
    override fun configName(): String {
        return toolName
    }

    override fun create(config: BaiduHotSearchConfig): BaiduHotSearchTool {
        return BaiduHotSearchTool(config)
    }

}