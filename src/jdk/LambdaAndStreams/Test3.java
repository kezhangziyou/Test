package jdk.LambdaAndStreams;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @author zhangke
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2019/5/16 4:48 PM
 **/
public class Test3 {
    public static void main(String[] args) {
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                //add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                //add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                //add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                //add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 12000));
                //add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                //add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                //add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                //add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                //add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };

        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 10000));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };

        //5、最大值和最小值：如果我们只对最低和最高的薪水感兴趣,比排序后选择第一个/最后一个更快的是min和max方法:
        System.out.println("工资最低的 Java programmer:");
        Person pers = javaProgrammers
                .stream()
                .min((p1, p2) -> (p1.getSalary() - p2.getSalary()))
                .get();

        System.out.printf("Name: %s %s; Salary: $%,d.", pers.getFirstName(), pers.getLastName(), pers.getSalary());

        System.out.println("工资最高的 Java programmer:");
        Person person = javaProgrammers
                .stream()
                .max((p, p2) -> (p.getSalary() - p2.getSalary()))
                .get();

        System.out.printf("Name: %s %s; Salary: $%,d.", person.getFirstName(), person.getLastName(), person.getSalary());
        System.out.println("");

        //6、map 的用法：使用 collect 方法来将我们的结果集放到一个字符串,一个拼接的字符串 或 一个 Set 或一个TreeSet中:
        System.out.println("将 PHP programmers 的 first name 拼接成字符串:");
        String phpDevelopers = phpProgrammers
                .stream()
                .map(Person::getFirstName)
                // 在进一步的操作中可以作为标记(token)
                .collect(joining(" ; "));
        System.out.println(phpDevelopers);


        System.out.println("将 Java programmers 的 first name 存放到 Set:");
        Set<String> javaDevFirstName = javaProgrammers
                .stream()
                .map(Person::getFirstName)
                .collect(toSet());
        System.out.println(javaDevFirstName);

        System.out.println("将 Java programmers 的 first name 存放到 TreeSet:");
        TreeSet<String> javaDevLastName = javaProgrammers
                .stream()
                .map(Person::getLastName)
                .collect(toCollection(TreeSet::new));
        System.out.println(javaDevLastName);

    }

}