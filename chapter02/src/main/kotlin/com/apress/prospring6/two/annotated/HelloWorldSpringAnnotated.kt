package com.apress.prospring6.two.annotated

import com.apress.prospring6.two.decoupled.MessageRenderer
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

object HelloWorldSpringAnnotated {
    @JvmStatic
    fun main(args: Array<String>){
        val ctx: ApplicationContext =
            AnnotationConfigApplicationContext(HelloWorldConfiguration::class.java)
        val mr: MessageRenderer = ctx.getBean("renderer",MessageRenderer::class.java)
        mr.render()
    }
}