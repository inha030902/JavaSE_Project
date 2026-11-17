package workshop.person.control;
import workshop.person.entity.PersonEntity;

public class PersonManager {
    public static void main(String[] args) {
        PersonManager pManager = new PersonManager();
        //PersonEntity 배열 선언 및 생성
        PersonEntity[] persons = new PersonEntity[10];
        pManager.fillPersons(persons);
        
    }

    //PersonEntity 타입 배열을 채우는 메소드
    public void fillPersons(PersonEntity[] persons) {
        // Implementation for filling person array
    }

    //PersonEntity 타입 배열을 출력하는 메소드
    public void showPersons(PersonEntity[] persons) {
        // Implementation for showing person array
    }

    //입력받은 성별 값과 일치하는 PersonEntity 객체의 건수를 찾는 메서드
    public int findByGender(PersonEntity[] persons, char gender) {
        int personCount = 0;
        return personCount;
    }

    //입력받은 이름 값과 일치하는 PersonEntity 객체를 찾아서 세부정보를 출력하는 메서드
    public int showPerson(PersonEntity[] persons, String name) {
        int personCount = 0;
        return personCount;
    }
}
