package index

import kotlinext.js.*
import react.dom.*
import kotlinx.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
       div {
          + "kotlin react"
       }
    }
}
