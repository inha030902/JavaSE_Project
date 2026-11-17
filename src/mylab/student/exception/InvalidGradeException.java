package mylab.student.exception;

/*
Student의 학년(grade)이 1~4 범위를 벗어날 때 사용되는 사용자정의 Exception 클래스
*/

public class InvalidGradeException extends Exception {

    public InvalidGradeException(String message) {
        //부모 클래스의 생성자를 호출한다.
        super(message);
    }
}
