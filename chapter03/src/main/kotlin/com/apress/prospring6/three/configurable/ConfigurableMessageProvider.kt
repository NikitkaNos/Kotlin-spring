/*
package com.apress.prospring6.three.configurable


import com.apress.prospring6.two.decoupled.MessageProvider
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
internal class ConfigurableMessageProvider(
    @Value("Configurable message") override var message: String
) :
    MessageProvider {

    init {
        println("~~ Inject '$message' value into constructor ~~")
        this.message = message
    }
}
*/
