package io.github.llmagentbuilder.tool.extractwebpagecontent

import io.github.llmagentbuilder.core.tool.ConfigurableAgentTool
import io.github.llmagentbuilder.webscraper.WebScraper
import org.slf4j.LoggerFactory

const val toolId = "extractWebPageContent"

class ExtractWebPageContentTool(private val config: ExtractWebPageContentConfig?) :
    ConfigurableAgentTool<ExtractWebPageContentRequest, ExtractWebPageContentResponse, ExtractWebPageContentConfig> {

    private val logger = LoggerFactory.getLogger(javaClass)

    init {
        logger.info("Created with config: $config")
    }

    override fun apply(request: ExtractWebPageContentRequest): ExtractWebPageContentResponse {
        return ExtractWebPageContentResponse(
            WebScraper.allText(request.url)
                .take((config?.sizeLimit ?: 1000).coerceAtLeast(50))
        )
    }

    override fun description(): String {
        return "extract web page content from given url"
    }

    override fun id(): String {
        return toolId
    }

    override fun name(): String {
        return "Extract web page content"
    }
}