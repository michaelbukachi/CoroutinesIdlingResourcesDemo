package michaelbukachi.coroutinesidlingresourcesdemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class GreetingsTest {

    @Test
    fun sayHelloReturnsAfterDelay() {
        val greetings = Greetings.sayHelloAfterSomeTime("2019")
        Assert.assertEquals(greetings, "Hello, 2019!")
    }
}