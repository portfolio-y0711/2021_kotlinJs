package components

import kotlinx.html.classes
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class Sidebar : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            attrs {
                classes = setOf("sidebar")
            }
            div {
                img {
                    attrs {
                        classes = setOf("profile_image")
                        src = "./ggb2.jpg"
                        alt = ""
                    }
                }
                h4 {
                    +"ggb2"
                }
            }
            a {
                attrs {
                    href = "#"
                }
                i {
                    attrs {
                        classes = setOf("fas fa-file")
                    }
                }
                span {
                    + "Resume"
                }
            }
            a {
                attrs {
                    href = "#"
                }
                i {
                    attrs {
                        classes = setOf("fas fa-table")
                    }
                }
                span {
                    + "Achievement"
                }
            }
            a {
                attrs {
                    href = "#"
                }
                i {
                    attrs {
                        classes = setOf("fas fa-cogs")
                    }
                }
                span {

                }
            }
            a {
                attrs {
                    href = "#"
                }
                i {
                    attrs {
                        classes = setOf("fas fa-calendar")
                    }
                }
                span {
                    + "Schedule"
                }
            }
            a {
                attrs {
                    href = "#"
                }
                i {
                    attrs {
                        classes = setOf("fas fa-project-diagram")
                    }
                }
                span {
                    + "Projects"
                }
            }
        }
    }
}

fun RBuilder.sidebar() = child(Sidebar::class) {

}
