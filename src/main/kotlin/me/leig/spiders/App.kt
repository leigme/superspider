package me.leig.spiders

import me.leig.spiders.moviesite.Movie6hao

/**
 *
 *
 * @author leig
 *
 */

class App

fun main(args: Array<String>) {
    println("start app...")

    val mSpider = Movie6hao()

    mSpider.resolveUrl("http://www.6vhao.tv/mj/2017-10-14/32817.html")
}