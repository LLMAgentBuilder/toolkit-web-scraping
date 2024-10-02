package io.github.llmagentbuilder.tool.baidusearch

import io.github.llmagentbuilder.core.tool.ConfigurableAgentToolFactory

class BaiduSearchToolFactory :
    ConfigurableAgentToolFactory<BaiduSearchConfig, BaiduSearchTool> {
    override fun create(config: BaiduSearchConfig?): BaiduSearchTool {
        return BaiduSearchTool(config)
    }

    override fun toolId(): String {
        return toolId
    }
}