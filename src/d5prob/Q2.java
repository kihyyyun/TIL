package d5prob;
/*
### Q2

은행 계좌를 나타내는 `BankAccount` 클래스를 만들어보자.

1. 계좌 번호, 잔고, 비밀번호에 대한 정보가 담겨있다.
   - 계좌 번호는 0~9 사이의 숫자로 이루어진 8자리 문자열이다.
   - 비밀번호는 0~9 사이의 숫자로 이루어진 4자리 문자열이다.
2. 입금을 나타내는 `deposit` 메서드를 가지고 있다.
   - 입금액을 인자로 받는다.
3. 출금을 나타내는 `withdraw` 메서드를 가지고 있다.
   - 성공 여부를 `boolean` 데이터로 반환한다.
   - 출금액과 비밀번호를 인자로 받는다.
   - 비밀번호가 일치하지 않으면 실패한다.
   - 계좌 잔고가 부족하면 실패한다.
4. 총 생성된 계좌의 숫자와, 전체 계좌들의 잔고 총합에 대한 정보를 가지고 있다.
   - 이 정보를 반환하는 메서드를 가지고 있다.
 */
public class Q2 {
    public class BankAccount {
        /*
   1.계좌 번호, 잔고, 비밀번호에 대한 정보가 담겨있다.
   - 계좌 번호는 0~9 사이의 숫자로 이루어진 8자리 문자열이다.
   - 비밀번호는 0~9 사이의 숫자로 이루어진 4자리 문자열이다.
         */
        private String password;
        private String accountNumber;
        private int money;

        public BankAccount(String password, String accountNumber) {
            if (accountNumber.length() == 8 && password.length() == 4) {

            }

        }

        //2. 입금을 나타내는 `deposit` 메서드를 가지고 있다.
        // - 입금액을 인자로 받는다.
        public void deposit(int amount) {
            amount = 0;
        }
        //3. 출금을 나타내는 `withdraw` 메서드를 가지고 있다.
        //   - 성공 여부를 `boolean` 데이터로 반환한다.
        //   - 출금액과 비밀번호를 인자로 받는다.
        //   - 비밀번호가 일치하지 않으면 실패한다.


    }
}
