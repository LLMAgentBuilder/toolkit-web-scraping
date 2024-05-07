package io.github.llmagentbuilder.webscraper

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

data class LinkItem(val title: String, val href: String)

object WebScraper {
    fun textList(url: String, query: String): List<String> {
        val doc = load(url)
        return doc.select(query).eachText()
    }

    fun links(url: String, query: String): List<LinkItem> {
        val doc = load(url)
        return doc.select(query).map {
            LinkItem(it.text(), it.attribute("href").value)
        }
    }

    private fun load(url: String): Document {
        val session = Jsoup.newSession()
            .timeout(30 * 1000)
            .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36 Edg/124.0.0.0")
        return session.url(url).get()
    }
}