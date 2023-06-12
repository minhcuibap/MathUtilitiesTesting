/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minh.mathutil.core.test;

import static com.minh.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DELL
 */
public class MathUtilityAdvancedTest {

    // Hàm chuẩn bị bộ data test để sau đó fill vào hàm
    // assertEquals() ở dưới
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {6, 720}};
        return testData;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
}
