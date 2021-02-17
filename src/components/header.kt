package components

import kotlinx.html.classes
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import react.dom.div
import react.dom.h3
import react.dom.span

class Header: RComponent<RProps,RState>() {
    override fun RBuilder.render() {
        div {
            attrs {
                classes = setOf("left_area")
            }
            h3 {
                + "Coding "
                span {
                    + "is Fun"
                }
            }
            div {
                attrs {
                    classes = setOf("right_area")
                }
                a {
                    attrs {
                        href = "#"
                        classes = setOf("logout_btn")
                    }
                    + "Logout"
                }
            }
        }
    }
}

fun RBuilder.header() = child(Header::class) {}
