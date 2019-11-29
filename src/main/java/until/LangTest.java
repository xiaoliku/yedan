package until;
import org.apache.commons.lang3.CharSet;
//import org.apache.commons.lang3.CharSetUtils;

import org.apache.commons.lang3.StringUtils;
import util.MycharSetUtils;

import java.io.File;
import java.util.*;

public class LangTest {

    public void charSetUtilsDemo() {
        System.out.println ("**CharSetUtilsDemo**");
        System.out.println("请输入内容(只允许输入1(计算),2(删除),3(保留),4(合并))：");
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
     //   for(int i=1;i<5;i++) {
            switch (i) {
                case 1:
                    System.out.println ("计算字符串中包含某字符数.");
                    System.out.println (MycharSetUtils.count (
                            "The quick brown fox jumps over the lazy dog.", "aeiou"));
                    break;

                case 2:
                    System.out.println ("删除字符串中某字符.");
                    System.out.println (MycharSetUtils.delete (
                            "The quick brown fox jumps over the lazy dog.", "aeiou"));
                    break;

                case 3:
                    System.out.println ("保留字符串中某字符.");
                    System.out.println (MycharSetUtils.keep (
                            "The quick brown fox jumps over the lazy dog.", "aeiou"));
                    break;
                case 4:
                    System.out.println ("合并重复的字符.");
                    System.out.println (MycharSetUtils.squeeze ("a  bbbbbb     c dd", "b d"));
                    break;
                default:
                    System.out.println ("输入错误");
                    break;
            }
     //   }



    }

    /**
     * @param args
     */
    public static void main(String[] args){
        LangTest langDemo = new LangTest ( );
        langDemo.charSetUtilsDemo ();

}
}