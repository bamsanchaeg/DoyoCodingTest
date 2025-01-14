package BasicCodingStudy.enumeration.ref2;

public enum Grade {
    //가로를 넣어서 생성자 값을 추가
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    //상수로 지정하는 것 외에 일반적인 방법으로 생성이 불가능하다.
    //따라서 생성자에 접근제어자를 선언할 수 없게 막혀있어 private이라고 생각하면 된다.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //열거형도 클래스이기 때문에 메서드를 추가할 수 있다.
    public int getDiscountPercent() {
        return discountPercent;
    }
}
