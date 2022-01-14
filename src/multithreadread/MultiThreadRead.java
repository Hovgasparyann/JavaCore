package multithreadread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class MultiThreadRead implements Runnable {

    public static String path = "C:\\Users\\Asus\\Downloads/sample.txt";
    public static AtomicInteger countOfKeyword = new AtomicInteger();
    List<String> string;
    Thread t1;

    MultiThreadRead(List<String> strings) {

        this.string = strings;
        t1 = new Thread(this);
        t1.start();
    }


    @Override
    public void run() {
        String keyword = ";";
        for (String string : string) {
            if (string.contains(keyword)) {
                countOfKeyword.incrementAndGet();
            }
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        long count = Files.lines(Paths.get(path)).count();
        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();


        List<String> strings = Files.readAllLines(Paths.get(path));
        List<String> substring1 = strings.subList(0, 689726);
        List<String> substring2 = strings.subList(689726, 1379452);
        List<String> substring3 = strings.subList(1379456, 2069178);
        List<String> substring4 = strings.subList(2069178, 2758904);
        List<String> substring5 = strings.subList(2758904, 3448632);

        MultiThreadRead multiThreadRead1 = new MultiThreadRead(substring1);
        MultiThreadRead multiThreadRead2 = new MultiThreadRead(substring2);
        MultiThreadRead multiThreadRead3 = new MultiThreadRead(substring3);
        MultiThreadRead multiThreadRead4 = new MultiThreadRead(substring4);
        MultiThreadRead multiThreadRead5 = new MultiThreadRead(substring5);

        multiThreadRead1.t1.join();
        multiThreadRead2.t1.join();
        multiThreadRead3.t1.join();
        multiThreadRead4.t1.join();
        multiThreadRead5.t1.join();

        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));

    }

}
