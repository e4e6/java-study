package week13;

import java.util.Scanner;

// 학생을 나타내는 Student 클래스
class Student {
    private int studentID;
    private String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
}

// 시간이 이미 사용 중일 때 발생하는 예외 처리 클래스
class TimeInUseException extends Exception {
    public TimeInUseException(String message) {
        super(message);
    }
}

// 유효하지 않은 시간일 때 발생하는 예외 처리 클래스
class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}

public class TimeScheduler {
    private Student[] appointments = new Student[6]; 

    private boolean isTimeSlotAvailable(int timeSlot) {
        return appointments[timeSlot - 1] == null;
    }

    public void reserveTime(int timeSlot, Student student) throws TimeInUseException, InvalidTimeException {
        if (timeSlot < 1 || timeSlot > 6) {
            throw new InvalidTimeException("선택한 시간이 범위 밖에 있음");
        } else if (!isTimeSlotAvailable(timeSlot)) {
            throw new TimeInUseException("선택한 시간은 이미 예약됨");
        } else {
            appointments[timeSlot - 1] = student;
            System.out.println("상담 시간 " + timeSlot + "시가 " + student.getName() + " 학생에게 예약되었습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeScheduler scheduler = new TimeScheduler();

        while (true) {
            try {
                System.out.print("상담 시간을 입력하세요 (1~6): ");
                int time = Integer.parseInt(scanner.nextLine());

                if (time < 1 || time > 6) {
                    throw new InvalidTimeException("선택한 시간이 범위 밖에 있음");
                }

                System.out.print("학번을 입력하세요: ");
                int studentID = Integer.parseInt(scanner.nextLine());

                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();

                Student student = new Student(studentID, name);
                scheduler.reserveTime(time, student);

                scanner.close();
            } catch (NumberFormatException e) {
                System.out.println("예외됨: 시간은 정수여야합니다.");
                System.out.println("예외 발생 이유: " + e.getMessage());
            } catch (InvalidTimeException | TimeInUseException e) {
                System.out.println("예외 발생 이유: " + e.getMessage());
            }
        }
    }
}