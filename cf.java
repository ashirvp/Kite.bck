
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
 class Main

{
public static void main(String args[])

{

Pattern pattern = Pattern.compile("Te[a-zA-Z0-9]nical"); 
Matcher m = pattern.matcher("Te7nical");
if (m.find())

System.out.println("true");
else

System.out.println("false");

}
}