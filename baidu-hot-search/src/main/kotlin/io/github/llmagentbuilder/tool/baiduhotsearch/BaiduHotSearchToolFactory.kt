package io.github.llmagentbuilder.tool.baiduhotsearch

import io.github.llmagentbuilder.core.tool.ConfigurableAgentToolFactory

class BaiduHotSearchToolFactory :
    ConfigurableAgentToolFactory<BaiduHotSearchConfig, BaiduHotSearchTool> {
    override fun toolId(): String {
        return toolId
    }

    override fun create(config: BaiduHotSearchConfig?): BaiduHotSearchTool {
        return BaiduHotSearchTool(config)
    }

}