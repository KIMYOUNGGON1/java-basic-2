package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 결과 값 : valueObject = " + valueObject.value);
    }
}
