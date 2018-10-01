package com.allan.studies.singleton;

import com.allan.studies.SingleObject;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class SingleObjectTest {

    @Test
    @DisplayName("Test singleton creation")
    public void test() {
        SingleObject first = SingleObject.getInstance();
        assertEquals("There are 1 instances", first.showMessage());
        SingleObject second = SingleObject.getInstance();
        assertEquals("There are 1 instances", first.showMessage());
        assertEquals("There are 1 instances", second.showMessage());
    }
}
