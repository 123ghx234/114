package Expection.classCastExpcetion;

public class Test
{
    public static void main(String[] args) {
        Student stu1=new Student(1,"xiaohua");
        Student stu2=new Student(2,"xiaohua");

        System.out.println(stu1 == stu2);//存储的是栈的地址

        System.out.println(stu1.equals(stu2));//而带有equals的在条件满足的情况下，存储的是内容
        /*
            public boolean equals(Object obj) {    //向上转型
        return (this == obj);

    }
         */
    }
}
