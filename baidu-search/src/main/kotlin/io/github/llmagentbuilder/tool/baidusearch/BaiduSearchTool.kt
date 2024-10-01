package io.github.llmagentbuilder.tool.baidusearch

import io.github.llmagentbuilder.core.tool.ConfigurableAgentTool
import io.github.llmagentbuilder.webscraper.WebScraper
import org.slf4j.LoggerFactory

const val toolName = "baiduSearch"

class BaiduSearchTool(private val config: BaiduSearchConfig) :
    ConfigurableAgentTool<BaiduSearchRequest, BaiduSearchResponse, BaiduSearchConfig> {

    private val logger = LoggerFactory.getLogger(javaClass)

    init {
        logger.info("Created with config: $config")
    }

    override fun apply(request: BaiduSearchRequest): BaiduSearchResponse {
        return BaiduSearchResponse(
            WebScraper.links(
                "https://www.baidu.com/s?wd=${request.keyword}",
                ".c-container h3 a"
            ).map {
                BaiduSearchResultItem(it.title, it.href)
            }.take((config.numberOfItems ?: 10).coerceAtLeast(1))
        )
    }

    override fun description(): String {
        return "search web using Baidu"
    }

    override fun name(): String {
        return toolName
    }

}