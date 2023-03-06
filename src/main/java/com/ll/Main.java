package com.ll;

public class Main {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.
    }
}

class 무기 {
    void 공격() {
    } //리모콘의 공격 버튼을 만들기 위한 코드여서 필요함

      /* 무기 리모콘이 칼을 가리키게 되어 칼은 무기리모콘화로 자동형변환이 이루지는데
         무기에는 공격버튼이 없기 때문에, 공격 버튼을 추가하지 않으면
         칼의 공격이 이루어지지 않음
       */
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }

}