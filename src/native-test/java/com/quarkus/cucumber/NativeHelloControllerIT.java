package com.quarkus.cucumber;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeHelloControllerIT extends HelloControllerTest {

    // Execute the same tests but in native mode.
}