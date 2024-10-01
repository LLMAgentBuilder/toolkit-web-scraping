package io.github.llmagentbuilder.tool.baiduhotsearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class BaiduHotSearchToolTest {
    @Test
    fun find() {
        val results = BaiduHotSearchTool(BaiduHotSearchConfig()).apply(
            BaiduHotSearchRequest(10)
        )
            .results
        assertNotNull(results)
        assertEquals(10, results?.size)
    }
}