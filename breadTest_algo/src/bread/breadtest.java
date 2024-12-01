package breadTest_algo.src.bread;
import java.util.Scanner;
public class breadtest {
	static Scanner scanner = new Scanner(System.in);
	static bread.SHOWMENU showmenu = new bread.SHOWMENU(); //메뉴메서드 불러오기
	static bread.SELECTMENU selectmenu = new bread.SELECTMENU(); //선택 메뉴 불러오기
	static bread.BREADSIZE breadsize = new bread.BREADSIZE();
	//bread.ADDORDER addorder = new bread.ADDORDER();

	public static void finish() {
		System.out.println("주문이 종료되었습니다. 안녕히 가십시오");
	}
	public static void addselect() {
		System.out.println("이어서 주문하시겠습니까?\n1.네 \n2.아니요" );
	}

	public static void main (String[]args){
		while (true) {
			showmenu.showmenu();
			selectmenu.selectMenu();
			int menu = scanner.nextInt();
			scanner.nextLine();

			switch (menu) {
				case 1: //남은 수량 보기
					breadsize.breadSize();
					break;

				case 2: //빵 선택하기
					showmenu.showmenu();
					System.out.println("빵을 선택해주세요 : ");
					int bread = scanner.nextInt();
					scanner.nextLine();
				case 3:
					finish();

			}
			if(menu == 3){
				break;
			}
		}
	}

	public static void breadSelected(){
		showmenu.showmenu();
		System.out.println("빵을 선택해 주세요");
		int bread = scanner.nextInt();
		scanner.nextLine();
		switch (bread) {

			case 1: //샌드위치 선택
				System.out.println("샌드위치를 선택하셨습니다.");
				System.out.println("수량을 입력해주세요 : ");
				int sandbread = scanner.nextInt();
				scanner.nextLine();
				System.out.println("샌드위치" + sandbread + "개 선택하였습니다.");
				addselect();
				break;

			case 2: //딸기케이크 선택
				System.out.println("딸기케이크를 선택하셨습니다.");
				System.out.println("수량을 입력해주세요 : ");
				int cakebread = scanner.nextInt();
				scanner.nextLine();
				System.out.println("딸기케이크" + cakebread + "개 선택하였습니다.");
				addselect();
				break;

			case 3: //튀김소보로 선택
				System.out.println("튀김소보로를 선택하셨습니다.");
				System.out.println("수량을 입력해주세요 : ");
				int sobobread = scanner.nextInt();
				scanner.nextLine();
				System.out.println("튀김소보로" + sobobread + "개 선택하였습니다.");
				addselect();
				break;

			case 4: //단팥빵 선택
				System.out.println("단팥빵를 선택하셨습니다.");
				System.out.println("수량을 입력해주세요 : ");
				int danbread = scanner.nextInt();
				scanner.nextLine();
				System.out.println("단팥빵" + danbread + "개 선택하였습니다.");
				addselect();
				break;

			case 5: //피자빵 선택
				System.out.println("피자빵를 선택하셨습니다.");
				System.out.println("수량을 입력해주세요 : ");
				int pizzabread = scanner.nextInt();
				scanner.nextLine();
				System.out.println("피자빵" + pizzabread + "개 선택하였습니다.");
				addselect();
				break;

		}
	}

	/*public static void main (String[] args) {

		while (true) {
			showmenu.showmenu();
			selectmenu.selectMenu();
			int menu = scanner.nextInt();
			scanner.nextLine();

			switch (menu) {
				case 1: //남은 수량 보기
					breadsize.breadSize();
					break;

				case 2: //빵 선택하기
					showmenu.showmenu();
					System.out.println("빵을 선택해주세요 : ");
					int bread = scanner.nextInt();
					scanner.nextLine();
				case 3:
					finish();

					switch (bread) {
						case 1: //샌드위치 선택
							System.out.println("샌드위치를 선택하셨습니다.");
							System.out.println("수량을 입력해주세요 : ");
							int sandbread = scanner.nextInt();
							scanner.nextLine();
							System.out.println("샌드위치" + sandbread + "개 선택하였습니다.");
							addselect();
							break;

						case 2: //딸기케이크 선택
							System.out.println("딸기케이크를 선택하셨습니다.");
							System.out.println("수량을 입력해주세요 : ");
							int cakebread = scanner.nextInt();
							scanner.nextLine();
							System.out.println("딸기케이크" + cakebread + "개 선택하였습니다.");
							addselect();
							break;

						case 3: //튀김소보로 선택
							System.out.println("튀김소보로를 선택하셨습니다.");
							System.out.println("수량을 입력해주세요 : ");
							int sobobread = scanner.nextInt();
							scanner.nextLine();
							System.out.println("튀김소보로" + sobobread + "개 선택하였습니다.");
							addselect();
							break;

						case 4: //단팥빵 선택
							System.out.println("단팥빵를 선택하셨습니다.");
							System.out.println("수량을 입력해주세요 : ");
							int danbread = scanner.nextInt();
							scanner.nextLine();
							System.out.println("단팥빵" + danbread + "개 선택하였습니다.");
							addselect();
							break;

						case 5: //피자빵 선택
							System.out.println("피자빵를 선택하셨습니다.");
							System.out.println("수량을 입력해주세요 : ");
							int pizzabread = scanner.nextInt();
							scanner.nextLine();
							System.out.println("피자빵" + pizzabread + "개 선택하였습니다.");
							addselect();
							break;

					}
				case 3: //주문종료
					break;
			}

		}

	}*/

}