package javase.oop;

public class ParameterPassQuote {

    private int i;

    public ParameterPassQuote(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private static void method(ParameterPassQuote parameterPass) {
        System.out.println(parameterPass.getI()); // 0
        parameterPass.setI(1);
        System.out.println(parameterPass.getI()); // 1
    }

    public static void main(String[] args) {
        ParameterPassQuote parameterPass = new ParameterPassQuote(0);
        System.out.println(parameterPass.getI()); // 0
        method(parameterPass);
        System.out.println(parameterPass.getI()); // 1
    }
}