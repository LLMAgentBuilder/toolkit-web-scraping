package io.github.llmagentbuilder.tool.baidusearch

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class BaiduSearchToolTest {
    @Test
    fun testSearch() {
        val tool = BaiduSearchTool(BaiduSearchConfig())
        val items = tool.apply(BaiduSearchRequest("AI大模型")).items
        assertNotNull(items)
    }
}