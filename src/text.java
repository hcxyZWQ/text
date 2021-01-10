public class text {
    public static void main(String[] args) {
        student stu=new student();
        stu.setId(1234567899);
        stu.setName("李明");
        stu.setPhone("18778629693");
        System.out.println("该学生的姓名是:"+stu.getName());
        System.out.println("该学生的学号是:"+stu.getId());
        System.out.println("该学生的电话号码是:"+stu.getPhone());

        Teaxher teaxher=new Teaxher();
        teaxher.setZhicheng("教授");
        teaxher.setId(123456789);
        System.out.println("该学生的姓名是:"+teaxher.getZhicheng());
        System.out.println("该学生的学号是:"+teaxher.getId());
    }
}
