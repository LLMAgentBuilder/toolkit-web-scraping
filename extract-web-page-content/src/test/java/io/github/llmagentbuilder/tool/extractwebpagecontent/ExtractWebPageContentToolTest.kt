package io.github.llmagentbuilder.tool.extractwebpagecontent

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class ExtractWebPageContentToolTest {
    @Test
    fun extract() {
        val tool = ExtractWebPageContentTool(ExtractWebPageContentConfig())
        val content =
            tool.apply(ExtractWebPageContentRequest("http://www.baidu.com"))
        assertNotNull(content)
    }
}