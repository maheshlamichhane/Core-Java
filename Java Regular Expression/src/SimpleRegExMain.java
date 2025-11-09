import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegExMain {

    public static void main(String[] args) {
//        int count = 0;
//        Pattern p = Pattern.compile("ba");
//        Matcher m = p.matcher("abbababjklab");
//
//        while(m.find()) {
//            count++;
//            System.out.println(m.start()+" "+m.end()+" "+m.group());
//        }
//        System.out.println("The total number of occurrences="+count);
//
//
//        Pattern pattern = Pattern.compile("[abc]");
//        Matcher matchers = pattern.matcher("ajfsdkjb");
//        while(matchers.find()) {
//            System.out.println(matchers.start()+"..."+matchers.end()+"..."+matchers.group());
//        }

//        Pattern pattern2 = Pattern.compile("\\D");
//        Matcher matchers2 = pattern2.matcher("a434 3j44b");
//        while(matchers2.find()) {
//            System.out.println(matchers2.start()+"..."+matchers2.end()+"..."+matchers2.group());
//        }

//        Pattern pattern = Pattern.compile("a?");
//        Matcher matchers = pattern.matcher("abaabaaaddd");
//        while(matchers.find()) {
//            System.out.println(matchers.start()+"..."+matchers.end()+"..."+matchers.group());
//        }

//        Pattern p = Pattern.compile("\\."); // [.] can write also
//        String[] s = p.split("www.durgasoft.com");
//        for(String s1:s) {
//            System.out.println(s1);
//        }

//        Pattern p = Pattern.compile("\\s");
//        String[] s = p.split("www durgasoft com");
//        for(String s1:s) {
//            System.out.println(s1);
//        }

//        StringTokenizer token = new StringTokenizer("01-01-1994","-");
//        while(token.hasMoreTokens()) {
//            System.out.println(token.nextToken());
//        }

//        StringTokenizer token = new StringTokenizer("Durga Software Solutions");
//        while(token.hasMoreTokens()) {
//            System.out.println(token.nextToken());
//        }

//        String mobileno= "917293949596";
//        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
//        String mobileno= "9818567284";
//        Pattern p = Pattern.compile("(98)[0-9]{8}");
//        Matcher m = p.matcher(mobileno);
//        String s = m.find() ?  m.group() : "";
//        System.out.println(s);
//        if(m.find() && m.group().equals(mobileno)) {
//            System.out.println("Valid Mobile Numbers");
//        }
//        else {
//            System.out.println("Invalid Mobile Numbers");
//        }

//        String email= "mahesh@gmail.co.in";
//
//        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
//        Matcher m = p.matcher(email);
//        if(m.find() && m.group().equals(email)) {
//            System.out.println("Valid email");
//        }
//        else {
//            System.out.println("Invalid email");
//        }

        String email= "maheshlamichhane 048@gmail.com";

        Pattern p = Pattern.compile("[a-z0-9]{19}@gmail.com");
        Matcher m = p.matcher(email);
        if(m.find() && m.group().equals(email)) {
            System.out.println("Valid email");
        }
        else {
            System.out.println("Invalid email");
        }
    }
}
