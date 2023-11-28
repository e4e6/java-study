package week12;

import java.util.Scanner;

interface Stack {
	 int length(); // 현재 스택에 저장된 개수 리턴
	 int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	 String pop(); // 스택의 톱(top)에 값저장
	 boolean push(String val); // 스택의 톱(top)에 저장된 값 리턴
}

class StringStack implements Stack {
    private int stackSize;
    private int top;
    private String[] stackArray;

    public StringStack(int capacity) {
        this.stackSize = 0;
        this.top = -1;
        this.stackArray = new String[capacity];
    }

    @Override
    public int length() {
        return stackSize;
    }

    @Override
    public int capacity() {
        return stackArray.length;
    }

    @Override
    public String pop() {
        if (top >= 0) {
            String value = stackArray[top];
            stackArray[top] = null;
            top--;
            stackSize--;
            return value;
        } else {
            System.out.println("스택이 비어 있습니다.");
            return null;
        }
    }

    @Override
    public boolean push(String val) {
        if (top < stackArray.length - 1) {
            top++;
            stackArray[top] = val;
            stackSize++;
            return true;
        } else {
            System.out.println("스택이 가득 찼습니다.");
            return false;
        }
    }
}

public class p2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 스택의 저장공간의 크기 입력 >> ");
        int stackCapacity = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        StringStack stringStack = new StringStack(stackCapacity);

        for (int i = 0; i < stackCapacity; i++) {
            System.out.print("문자열 입력 >> ");
            String input = scanner.nextLine();
            stringStack.push(input);
        }

        System.out.println("\n입력된 문자열을 스택에서 꺼내어 출력합니다.");

        while (stringStack.length() > 0) {
            String value = stringStack.pop();
            System.out.println(value);
        }

        scanner.close();
    }

}