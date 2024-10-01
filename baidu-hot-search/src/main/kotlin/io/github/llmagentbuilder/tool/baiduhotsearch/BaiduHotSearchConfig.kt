package io.github.llmagentbuilder.tool.baiduhotsearch

data class BaiduHotSearchConfig(val numberOfItems: Int? = null)

data class BaiduHotSearchRequest(val numberOfItems: Int? = null)

data class BaiduHotSearchResponse(val results: List<String>? = null)