package com.yourssohail.ogtagpreviewapp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class OGTagService {

    suspend fun fetchOGTags(url: String): OGTagData {
        return withContext(Dispatchers.IO) {
            val document = Jsoup.connect(url).get()
            parseOGTags(document.html())
        }
    }

    private fun parseOGTags(html: String): OGTagData {
        val document = Jsoup.parse(html)

        val title = document.select("meta[property=og:title]").attr("content")
        val description = document.select("meta[property=og:description]").attr("content")
        val imageUrl = document.select("meta[property=og:image]").attr("content")
        val url = document.select("meta[property=og:url]").attr("content")

        return OGTagData(
            title = title.ifEmpty { null },
            description = description.ifEmpty { null },
            imageUrl = imageUrl.ifEmpty { null },
            url = url.ifEmpty { null }
        )
    }
}
