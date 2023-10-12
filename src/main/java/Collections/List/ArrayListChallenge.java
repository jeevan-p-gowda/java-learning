package Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListChallenge {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>( );
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        //Challenge 1 - Students who is class 6
        List<String> classSix=students.stream().filter(i->i.classNo==6).map(i->i.name).collect(Collectors.toList());
        System.out.println(classSix);

        //Challenge 2 - students who is above age 8
        List<String> aboveEightYears=students.stream().filter(i->i.age>8).map(i->i.name).collect(Collectors.toList());
        System.out.println(aboveEightYears);

        //Challenge 3.1 - sort by name
        List<String> nameSort=students.stream().map(i->i.name).sorted().collect(Collectors.toList());
        System.out.println(nameSort);

        //Challenge 3.2 - sort by age


    }
   /*class ageComparator implements Comparator<Student> {
        @Override public int compare(Student s1, Student s2)
        {
            /*if (s1.age > s2.age) {
                return -1;
            }
            else if (s1.age < s2.age) {
                return 1;
            }
            else {
                return (s1.age).compareTo(s2.age);
            }
        }
    }*/

    private static class Student {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }

    }
}


