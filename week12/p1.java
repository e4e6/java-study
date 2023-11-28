package week12;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿈");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() );
		scanner.close();
	}
}

class WonToDollar extends Converter {
    public WonToDollar(double ratio) {
        this.ratio = ratio; 
    }

    @Override
    protected double convert(double src) {
        return src / ratio;
    }

    @Override
    protected String srcString() {
        return "원"; 
    }

    @Override
    protected String destString() {
        return "달러";
    }
}

public class p1 {

	public static void main(String[] args) {
        double exchangeRate = 1100.0; 
        WonToDollar converter = new WonToDollar(exchangeRate);

        converter.run(); 
    }

}
