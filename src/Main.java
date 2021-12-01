import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Lambda lambda=(String s1,String s2,String s3,String s4,String s5,String s6,String s7)->{
            StringBuilder result=new StringBuilder("");
            result.append(s1.toUpperCase(Locale.ROOT));
            result.append(s2.toUpperCase(Locale.ROOT));
            result.append(s3.toUpperCase(Locale.ROOT));
            result.append(s4.toUpperCase(Locale.ROOT));
            result.append(s5.toUpperCase(Locale.ROOT));
            result.append(s6.toUpperCase(Locale.ROOT));
            result.append(s7.toUpperCase(Locale.ROOT));
            return new String(result);
        };

        System.out.println(lambda.concatenate("The", "lambda", "has", "too", "many", "string" ,"arguments."));
    }
}
