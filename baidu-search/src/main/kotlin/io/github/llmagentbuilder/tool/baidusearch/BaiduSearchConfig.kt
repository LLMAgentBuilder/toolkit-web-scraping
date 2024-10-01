package io.github.llmagentbuilder.tool.baidusearch

data class BaiduSearchConfig(val numberOfItems: Int? = null)

data class BaiduSearchRequest(val keyword: String? = null)

data class BaiduSearchResultItem(
    val title: String? = null,
    val url: String? = null
)

data class BaiduSearchResponse(val items: List<BaiduSearchResultItem>? = null)