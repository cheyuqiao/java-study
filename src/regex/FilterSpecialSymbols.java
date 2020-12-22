package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterSpecialSymbols {
    public static void main(String[] args) {
        String str = "*adCVs*34_a _09_b5*[/435^*&城池()^$$&*).{}+.|.)%%*(*.中国}34{45[]12.fd'*&999下面是中文的字符￥……{}【】。，；’“‘”？";
        String name = "顺兴·政和国际";
        System.out.println(name);
        System.out.println(clear(name));
    }
    public static String clear(String string) {
        String regEx="[`~·!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(string);
        return m.replaceAll("").trim();
    }

}
