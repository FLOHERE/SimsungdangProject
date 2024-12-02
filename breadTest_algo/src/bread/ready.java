package bread;

import java.util.ArrayList;
import java.util.Scanner;

public class ready {
    static ArrayList<Integer> readypeople = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addreadypeople(int peopleToAdd) {
        for (int i = 0; i < peopleToAdd; i++) {
            readypeople.add(0); //
        }
    }

    public static void setReadypeople() {
        System.out.println("===현재대기인원은 \"" + readypeople.size() + "\"명입니다===.\n대기 인원을 몇명 추가 하시겠습니까?(취소하고 싶으시면 숫자 0을 입력해 주세요)");

        int selectPeople = sc.nextInt();
        System.out.println("선택한 추가 인원 수 : " + selectPeople);

        addreadypeople(selectPeople);
        System.out.println("당신의 순서는 " + readypeople.size() +"번입니다. \n감사합니다");
    }

    public static void main(String[] args) {
        setReadypeople();
    }
}