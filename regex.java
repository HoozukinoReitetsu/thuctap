import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex{
     public static void main(String[] args) {
        String pattern= "^((https|http)?:\\/\\/|www\\.)[a-z0-9A-Z]+\\.[a-z]{2,6}([0-9a-zA-Z\\/\\?\\=\\-\\.\\@\\!\\$\\#\\^\\&\\*\\+\\_]*)$";
        String line = "https://tiki.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Match value: " + m.group(0) );
      }else {
         System.out.println("NO MATCH");
      }
    }
}
