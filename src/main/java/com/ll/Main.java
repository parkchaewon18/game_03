package com.ll;
// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    String lastName;
    String lastWeaponName;

    void 공격(String name, String weaponName) {
        System.out.println(name + "이(가) " + weaponName + "(으)로 공격합니다.");

        lastName = name;
        lastWeaponName = weaponName;
    }
    void 재공격() {
        System.out.println(lastName + "이(가) " + lastWeaponName + "(으)로 공격합니다.");
    }
}

/* 중복제거 버전
class 전사 {
    String lastName;
    String lastWeaponName;

    void 공격(String name, String weaponName) {
        공격문구출력(name, weaponName);

        lastName = name;
        lastWeaponName = weaponName;
    }
    void 공격문구출력(String name, String weaponName) {
        System.out.println(name + "이(가) " + weaponName + "(으)로 공격합니다.");
    }
    void 재공격() {
        공격문구출력(lastName, lastWeaponName);
    }
}
 */

