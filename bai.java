package baiUUDD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;





class Student {
    String firstName;
    String lastName;
    String birthdate;
    String address;
    String studentClass;
    Map<String, Integer> scores;

    public Student(String firstName, String lastName, String birthdate, String address, String studentClass, Map<String, Integer> scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.studentClass = studentClass;
        this.scores = scores;
    }

    public String calculateRank() {
    	double totalScore = 0;
        int subjectCount = 0;

        for (int score : scores.values()) {
            totalScore += score;
            subjectCount++;
        }

        double avgScore = (subjectCount > 0) ? (totalScore / subjectCount) : 0;
        if (avgScore >= 8.5) return "A";
        else if (avgScore >= 7) return "B";
        else if (avgScore >= 6.5) return "C";
        else if (avgScore >= 4) return "D";
        else return "<D";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Rank: " + calculateRank();
    }
}

class ClassRoom {
    String className;
    List<Student> students;

    public ClassRoom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Map<String, Integer> getRankDistribution() {
        Map<String, Integer> rankCount = new HashMap<>();
        rankCount.put("A", 0);
        rankCount.put("B", 0);
        rankCount.put("C", 0);
        rankCount.put("D", 0);
        rankCount.put("<D", 0);

        for (Student student : students) {
            String rank = student.calculateRank();
            rankCount.put(rank, rankCount.get(rank) + 1);
        }
        return rankCount;
    }

    public void displayStudents() {
        System.out.println("Danh sach lop " + className + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public String getClassName() {
        return className;
    }
}
public class bai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ClassRoom> classRooms = DataInitializer.initializeData();
        System.out.println("Danh sach cac lop hoc:");
        for (ClassRoom classroom : classRooms) {
            System.out.println(classroom.getClassName());
        }

        System.out.print("Nhap ma lop: ");
        String selectedClassName = scanner.nextLine();

        for (ClassRoom classroom : classRooms) {
            if (classroom.getClassName().equalsIgnoreCase(selectedClassName)) {
                classroom.displayStudents();
                Map<String, Integer> rankDistribution = classroom.getRankDistribution();
                System.out.println("Tong ket so sv theo rank:");
                for (Map.Entry<String, Integer> entry : rankDistribution.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                break;
            }
        }

        scanner.close();
    }
}