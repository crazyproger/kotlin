package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

fun foo(catch: String) {
    assertEquals("123", catch)
    testRenamed("catch", { catch })
}

fun box(): String {
    foo("123")

    return "OK"
}