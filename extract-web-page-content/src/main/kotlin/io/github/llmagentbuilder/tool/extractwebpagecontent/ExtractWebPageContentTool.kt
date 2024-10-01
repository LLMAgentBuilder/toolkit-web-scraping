package io.github.llmagentbuilder.tool.extractwebpagecontent

import io.github.llmagentbuilder.core.tool.ConfigurableAgentTool
import io.github.llmagentbuilder.webscraper.WebScraper

const val toolName = "extractWebPageContent"

class ExtractWebPageContentTool(private val config: ExtractWebPageContentConfig) :
    ConfigurableAgentTool<ExtractWebPageContentRequest, ExtractWebPageContentResponse, ExtractWebPageContentConfig> {
    override fun apply(request: ExtractWebPageContentRequest): ExtractWebPageContentResponse {
        return ExtractWebPageContentResponse(
            WebScraper.allText(request.url)
                .take((config.sizeLimit ?: 1000).coerceAtLeast(50))
        )
    }

    override fun description(): String {
        return "extract web page content by url"
    }

    override fun name(): String {
        return toolName
    }
}