
/* 2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
   appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
   your answer which one is better. 
*/


public class StringBufferBuilderTest {
    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Test with StringBuffer (Thread-safe)
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("StringBuffer Time (ns): " + durationBuffer);

        // Test with StringBuilder (Non-thread-safe but faster)
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("StringBuilder Time (ns): " + durationBuilder);

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("\n StringBuilder is faster than StringBuffer for single-threaded operations.");
        } else {
            System.out.println("\n StringBuffer is safer in multi-threaded environments, but slower.");
        }
    }
}
