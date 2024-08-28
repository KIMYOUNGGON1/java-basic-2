package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    private static boolean payOption(String option, int amount) {
        if (option.equals("kakao")) {
            Pay kakaoPay = new KakaoPay();
            return kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            Pay naverPay = new NaverPay();
            return naverPay.pay(amount);
        } else {
            Pay defaultPay = new DefaultPay();
            return defaultPay.pay(amount);
        }
    }
}
