package my_sand_pit

class TestProperties {
    var mutableProperty: Int = 1
    set(value) {
        mutableProperty = 3}
}

fun test()  {
    val testProperties = TestProperties()
    testProperties.mutableProperty = 2

    testProperties
}