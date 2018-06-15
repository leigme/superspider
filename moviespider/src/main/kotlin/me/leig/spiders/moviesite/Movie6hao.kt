package me.leig.spiders.moviesite

import org.jsoup.Jsoup

/**
 *
 *
 * @author leig
 *
 */

class Movie6hao {

    fun resolveUrl(rootUrl: String) {

        val doc = Jsoup.connect(rootUrl).get()

        println(doc.title())

        val urls = doc.select("table").select("tbody").select("tr")

        println("============")

        for (url in urls) {
            println(url.select("td").select("a").attr("href"))
        }

        println("============")
    }

}