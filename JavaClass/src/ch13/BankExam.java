package ch13;

import java.util.EmptyStackException;

public class BankExam {
    public static void main(String[] args) {
        // 1. 기준금리 3.5%
        BankOfKorea bankOfKorea = BankOfKorea.getInstance();
        bankOfKorea.setBaseRate(3.5f);
        
        // 2. 근로자(choi)는 은행별 계좌 생성
        Employee choi = new Employee("choi", 1);
        WooriBank wooriBank = WooriBank.getInstance();
        KakaoBank kakaoBank = KakaoBank.getInstance();


        choi.setWooriAccount(wooriBank.makeAccount());
        choi.setKakaoAccount(kakaoBank.makeAccount());

        System.out.println("기준 금리: " + bankOfKorea.getBaseRate());
        System.out.println("choi의 우리은행 계좌번호 : " + choi.getWooriAccount());
        System.out.println("choi의 카카오뱅크 계좌번호 : " + choi.getKakaoAccount());
        System.out.println(wooriBank.getRate());
        System.out.println(kakaoBank.getRate());

        // 3. 저금
        // 1. 우리은행 5000원
        choi.saving(wooriBank, 5000);
        choi.saving(wooriBank, 10000);
        choi.saving(kakaoBank, 10000);
        choi.showMoney(wooriBank);
        choi.showMoney(kakaoBank);
        // 2. 카카오뱅크 5000원

        // 4. 대출
        // 1. 우리은행에 10,000원 대출
        choi.borrowMoney(wooriBank, 10000);
        choi.borrowMoney(kakaoBank, 10000);
        // 2. 연간 이자금액
        choi.showMoney(wooriBank);
        choi.showMoney(kakaoBank);
    }
}
