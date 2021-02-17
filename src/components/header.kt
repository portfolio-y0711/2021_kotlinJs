package components

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class Header: RComponent<RProps,RState>() {
    override fun RBuilder.render() {
        div {
            + "kotlin react in header now"
        }
    }
}

fun RBuilder.header() = child(Header::class) {}
