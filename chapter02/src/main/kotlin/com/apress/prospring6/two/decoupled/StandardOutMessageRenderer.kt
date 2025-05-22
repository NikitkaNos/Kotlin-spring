package com.apress.prospring6.two.decoupled

class StandardOutMessageRenderer(): MessageRenderer {
    override var messageProvider: MessageProvider? = null
        set(value) {
            field = value
            println(" --> StandardOutMessageRender: setting the provider")
        }
    init {
        println(" --> StandardOutMessageRender: constructor called")
    }

    override fun render() {
        println(messageProvider?.message?:throw RuntimeException(
            "You must set the property messageProvider of class:"
            + StandardOutMessageRenderer::class.java.name
        ))
    }
}