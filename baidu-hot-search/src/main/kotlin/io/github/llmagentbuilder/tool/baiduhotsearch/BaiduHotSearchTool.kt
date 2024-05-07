package io.github.llmagentbuilder.tool.baiduhotsearch

import io.github.llmagentbuilder.core.tool.ConfigurableAgentTool
import io.github.llmagentbuilder.webscraper.WebScraper
import org.slf4j.LoggerFactory

const val toolName = "baiduHotSearch"

class BaiduHotSearchTool(private val config: BaiduHotSearchConfig) :
    ConfigurableAgentTool<BaiduHotSearchRequest, BaiduHotSearchResponse, BaiduHotSearchConfig> {

    private val logger = LoggerFactory.getLogger(javaClass)

    init {
        logger.info("Created with config: $config")
    }

    override fun apply(request: BaiduHotSearchRequest): BaiduHotSearchResponse {
        return BaiduHotSearchResponse(
            WebScraper.textList(
                "https://top.baidu.com/board?tab=realtime",
                ".c-single-text-ellipsis"
            ).take(config.numberOfItems.coerceAtLeast(1))
        )
    }

    override fun description(): String {
        return "find hot search keywords in Baidu"
    }

    override fun name(): String {
        return toolName
    }

}