package my_sand_pit

import org.junit.Test

class TestProperties {
    var mutableProperty: Int = 1
    var counter = 0 // the initializer value is written directly to the backing field
        set(value) {
            if (value >= 0) field = value
        }
}

class TestPropertiesSpec {
    @Test fun test()  {
        val testProperties = TestProperties()
        testProperties.mutableProperty = 2

        println(testProperties.mutableProperty)

        testProperties.counter = -1

        print(testProperties.counter)
    }
}

object TestSomething {
    const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
}
