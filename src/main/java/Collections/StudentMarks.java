package Collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class StudentMarks {
    public static void main(String[] args) {
        Comparator<Student> studentComparator = // Custom Comparator to verify student marks
                new Comparator<Student>() {
                    @Override
                    public int compare(Student firstStudent, Student secondStudent) {
                        return firstStudent.marks.compareTo(secondStudent.marks);
                    }
                };

        TreeSet<Student> studentsMarks = new TreeSet<>(studentComparator);
        studentsMarks.add(new Student("Barrett Lee", 62));
        studentsMarks.add(new Student("Matthew Moore", 29));
        studentsMarks.add(new Student("Nellie Mcgrath", 18));
        studentsMarks.add(new Student("Jerrod Blair", 59));
        studentsMarks.add(new Student("Jack Mccoy", 70));
        studentsMarks.add(new Student("Andy Farrell", 60));

        SortedSet<Student> name = studentsMarks.tailSet(new Student(35)); // Use tailSet to find all students with marks 35 or above. A sorted set by marks.
        name.forEach(System.out::println);
    }

    private static class Student {
        private String name;
        private Integer marks;

        public Student(Integer marks) {
            this.marks = marks;
        }

        public Student(String name, Integer marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMarks() {
            return marks;
        }

        public void setMarks(Integer marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "{"
                    + "\"name\":\"" + name + "\""
                    + ", \"marks\":\"" + marks + "\""
                    + "}";
        }
    }
}