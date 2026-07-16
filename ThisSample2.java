class ThisSample2 {
    int field = 123;
    Object objField = new Object();

    void instanceMethod() {
        System.out.println("instanceMethod");
    }

    void thisTest() {
        System.out.println(field == this.field); // true、同じフィールドを指しているため
        System.out.println(objField == this.objField); // 同上

        instanceMethod(); // "instanceMethod"がprintされる
        this.instanceMethod(); // 同上、同じメソッドを呼び出しているため
    }
    public static void main(String[] args) {
        new ThisSample2().thisTest();
    }
}