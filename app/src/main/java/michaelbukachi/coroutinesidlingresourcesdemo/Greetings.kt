package michaelbukachi.coroutinesidlingresourcesdemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import michaelbukachi.coroutinesidlingresourcesdemo.utils.launchIdling

object Greetings {

    fun sayHelloAfterSomeTime(name: String): String {
        GlobalScope.launchIdling {
            delay(3000)
        }

        return "Hello, $name!"
    }
}