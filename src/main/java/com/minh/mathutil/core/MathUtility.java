/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minh.mathutil.core;

/**
 *
 * @author DELL
 */
// class này clone lại 100% class java.util.Math của 
public class MathUtility {

    public static final double PI = 3.1415;

    // tính n! = 1.2.3...n
    // thiết kế/ quy ước cho hàm/method này
    // 0! = 1! = 1
    // ko áp dụng giai thừa cho số âm. Nếu n < 0: CHỬI; NÉM RA EXEPTION
    // ko áp dụng giai thừa cho số > 20. Vì 20! vừa đủ khít/khớp kiểu long
    //                                            18 con số 0
    // 21!: CHỬI, NÉM RA NGOẠI LỆ
    public static long getFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be in range [0.20]");
        }
        
        long product = 1; // tích khỏi đầu là 1, sau đo nhân dồn vào
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        return product;
    }
}
