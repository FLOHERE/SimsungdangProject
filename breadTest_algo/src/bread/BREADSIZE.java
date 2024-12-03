package bread;

import java.util.Stack;

public class BREADSIZE {
	// 각 빵 종류별로 스택 생성 (static으로 변경)
	private static Stack<Integer> sandwichStack = new Stack<>();
	private static Stack<Integer> cakeStack = new Stack<>();
	private static Stack<Integer> soboroStack = new Stack<>();
	private static Stack<Integer> redBeanStack = new Stack<>();
	private static Stack<Integer> pizzaStack = new Stack<>();

	// 정적 초기화 블록 사용
	static {
		initializeStacks();
	}

	// 스택 초기화 메서드
	private static void initializeStacks() {
		// 각 스택에 20개씩 채우기
		for (int i = 0; i < 20; i++) {
			sandwichStack.push(1);
			cakeStack.push(1);
			soboroStack.push(1);
			redBeanStack.push(1);
			pizzaStack.push(1);
		}
	}

	// 현재 재고 확인 메서드
	public void breadSize() {
		System.out.println("남은 샌드위치 수량 : " + sandwichStack.size());
		System.out.println("남은 딸기케이크 수량 : " + cakeStack.size());
		System.out.println("남은 튀김소보로 수량 : " + soboroStack.size());
		System.out.println("남은 단팥빵 수량 : " + redBeanStack.size());
		System.out.println("남은 피자빵 수량 : " + pizzaStack.size());
	}

	// 빵 선택 및 재고 차감 메서드
	public boolean updateBreadInventory(String breadType, int quantity) {
		Stack<Integer> selectedStack = null;

		// 선택된 빵 종류에 따라 해당 스택 선택
		switch (breadType) {
			case "sandwich":
				selectedStack = sandwichStack;
				break;
			case "strawberryCake":
				selectedStack = cakeStack;
				break;
			case "soboro":
				selectedStack = soboroStack;
				break;
			case "redBeanBread":
				selectedStack = redBeanStack;
				break;
			case "pizzaBread":
				selectedStack = pizzaStack;
				break;
			default:
				return false;
		}

		// 재고 확인 및 차감
		if (selectedStack.size() >= quantity) {
			// 요청된 수량만큼 스택에서 pop
			for (int i = 0; i < quantity; i++) {
				selectedStack.pop();
			}
			return true;
		}

		return false; // 재고 부족 시 false 반환
	}
}