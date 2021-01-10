import java.io.UnsupportedEncodingException;

public class StrintD1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*----------------------------------------------------------------------*/
        String string="hjguygJavahihskj";
        char cstart=string.charAt(0);
        char cend=string.charAt(string.length()-1);
        System.out.println("第一个字母为："+cstart);
        System.out.println("最后一个字母为："+cend);
        /*----------------------------------------------------------------------*/
        String string1="Java";
        System.out.println("连接后的字符串为："+string.concat(string1));
        /*----------------------------------------------------------------------*/
        if (string.contains(string1))
        {
            System.out.println("string中有string1");
        }
        else
        {
            System.out.println("没有还字符串");
        }
        /*----------------------------------------------------------------------*/
        boolean retVal;
        retVal=string.endsWith("skj");
        System.out.println("返回值"+retVal);
        retVal=string.endsWith("skjjj");
        System.out.println("返回值"+retVal);
        /*----------------------------------------------------------------------*/
        retVal=string.equals(string1);
        System.out.println("返回值"+retVal);

        /*----------------------------------------------------------------------
        getBytes(String charsetName) 方法编码将此String使用指定的字符集的字节序列，并将结果存储到一个新的字节数组。*/
        String string2="ajh";
        // byte array with charset
        byte bval[] = string2.getBytes("UTF-8");

        // prints the byte array
        for (int i = 0; i < bval.length; i++) {
            System.out.print(bval[i]+"\t");
        }
        /*----------------------------------------------------------------------
         * indexOf(String str)//查找指定字符或字符串在字符串中第一次出现地方的索引，未找到的情况返回 -1.
         * String.indexOf(String str，int index)从index的地方开始找，返回第一次出现的索引*/
            System.out.println("\n"+string.indexOf(string1));
            System.out.println("索引位置为："+string.indexOf(string1, 3));

            /* -----------------------------------------------------------------
            lastIndexOf(String str)public int lastIndexOf(int ch): 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。

            public int lastIndexOf(int ch, int fromIndex): 返返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。

            public int lastIndexOf(String str): 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。

            public int lastIndexOf(String str, int fromIndex): 返回指定字符在此字符串中最后一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。*/

            /*String Str = new String("菜鸟教程:www.runoob.com");
            String SubStr1 = new String("runoob");
            String SubStr2 = new String("com");

            System.out.print("查找字符 o 最后出现的位置 :" );
            System.out.println(Str.lastIndexOf( 'o' ));
            System.out.print("从第14个位置查找字符 o 最后出现的位置 :" );
            System.out.println(Str.lastIndexOf( 'o', 14 ));
            System.out.print("子字符串 SubStr1 最后出现的位置:" );
            System.out.println( Str.lastIndexOf( SubStr1 ));
            System.out.print("从第十五个位置开始搜索子字符串 SubStr1最后出现的位置 :" );
            System.out.println( Str.lastIndexOf( SubStr1, 15 ));
            System.out.print("子字符串 SubStr2 最后出现的位置 :" );
            System.out.println(Str.lastIndexOf( SubStr2 ));*/
        }
    }
