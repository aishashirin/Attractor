package homeWork;

import java.util.Scanner;

public class TelevisionWork {
    public static void main(String[] args) {
       Channel channel = new Channel();
        Scanner scanner = new Scanner(System.in);
       Television tv = new Television(1,4);
        Channel[] array1 = new Channel[tv.maxChannel];
        array1[0] = (channel.add("Disney"));
        array1[1] = (channel.add("CN"));
        array1[2] = (channel.add("CCTV"));
        array1[3] = (channel.add("BBC"));

        tv.channels = array1;

        System.out.println("'+' - for next channel,\n'-' - for prev channel,\n'*' - to switch the TV to a specific channel by its serial number,\n'/' - display the current channel,\n'=' - to show channel by it's number,\n 'end' - to end program");

        String c = "";
        while(!c.equals("end")) {
            c = scanner.nextLine();


            switch (c) {
                case "+":
                    tv.nextChannel(tv.channels);
                    break;
                case "-":
                    tv.prevChannel(tv.channels);
                    break;
                case "*":
                    System.out.println("enter number of channel: ");
                    int n = scanner.nextInt();
                    tv.switchTo(n);
                    break;
                case "/":
                    tv.displayCurrentChannel();
                    break;
                case "=":
                    System.out.println("enter number of channel: ");
                    int l = scanner.nextInt();
                    tv.show(l);
            }
        }
    }
}
