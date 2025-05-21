Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.
package A2;
public class StringPerformanceTest {
	public static void main(String[] args) {
          int iterations = 10000;
	        String text = "AIET";
            // Measure time for StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }
	        long endBuffer = System.nanoTime();
	        long durationBuffer = endBuffer - startBuffer;

	        // Measure time for StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }
	        long endBuilder = System.nanoTime();
	        long durationBuilder = endBuilder - startBuilder;

	        // Print Results
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

	        // Justification
	        if (durationBuffer > durationBuilder) {
	            System.out.println("StringBuilder is faster than StringBuffer for single-threaded operations.");
	        } else {
	            System.out.println("StringBuffer is faster or comparable, but it is thread-safe (synchronized).");
	        }
	    }
	}


