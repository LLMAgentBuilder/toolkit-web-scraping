package io.github.llmagentbuilder.tool.extractwebpagecontent

data class ExtractWebPageContentConfig(val sizeLimit: Int? = null)

data class ExtractWebPageContentRequest(val url: String)

data class ExtractWebPageContentResponse(val content: String? = null)