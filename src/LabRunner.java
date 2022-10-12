public class LabRunner {
    public static void main(String[] args) {
        String str = new String("good morning");
        int strLen = str.length();
        System.out.println(strLen);

        String str1 = "Hello how are you today?";
        System.out.println(str1.indexOf("you"));
        System.out.println(str1.indexOf("You"));

        String myString = "AP CSA is awesome!";
        String aweStr = myString.substring(10, 13);
        System.out.println(aweStr);
        String s = myString.substring(4, 5);
        System.out.println(s);
        String awe = myString.substring(10);
        System.out.println(awe);

        String origStr = "Hello how are you today?";
        String str9 = origStr.substring(6, 9);
        System.out.println(str9);

        String blah = "What's for dinner?";
        String ugh = blah.substring(11, 17);
        System.out.println(ugh);

        String today = "FRIDAY!";
        String x = today.substring(3, 7).substring(0, 3).substring(1, 3);
        System.out.println(x);

        String blah2 = "What's for dinner?";
        String ugh2 = blah2.substring(11);
        System.out.println(ugh2);
        String ugh3 = blah2.substring(11, 18);
        System.out.println(ugh3);

        String random = "Hello there!";
        String there = random.substring(6);
        System.out.println(there);
        String there1 = random.substring(6, 12);
        System.out.println(there1);

        String work = "Hello there!";
        String sucks = new String("Hello there!");
        System.out.println(work.equals(sucks));
        System.out.println(work == sucks);

    }
}
