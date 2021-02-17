package components

import kotlinx.html.classes
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class Header : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        header {
            div {
                attrs {
                    classes = setOf("left_area")
                }
                h3 {
                    +"Code "
                    span {
                        +"is Fun"
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
                        +"Logout"
                    }
                }
            }
        }
    }
}

fun RBuilder.header() = child(Header::class) {}
