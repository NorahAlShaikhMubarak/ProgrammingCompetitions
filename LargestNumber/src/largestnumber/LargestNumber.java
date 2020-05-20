/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author norahalshaikhmubarak
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> numbers = Arrays.asList("10", "68", "97", "9", "21", "12");

	Collections.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
	numbers.stream().forEach(System.out::print);
    }
    
}
