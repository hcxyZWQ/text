public class StringDmo {
    public static void main(String[] args) {
        String str="hechixueyuan will be better";
        String string[]=str.split("\\s");

        StringBuffer st=new StringBuffer();
        for (int i=0;i<str.length();i++)
        {
            st.append(string[i]);
            st.append("\t");
        }
        System.out.println("最终处理结果："+st.toString());//用toString来
    }
}
