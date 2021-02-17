package components

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div

class App: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        header()
    }
}

fun RBuilder.app() = child(App::class) {}

