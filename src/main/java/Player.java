 public class Player {
        public static Object move;
        public Account account = new Account();
        int position = 0;
        int startBalance;

        public void setStartBalance(int startBalance) {
            this.startBalance = startBalance;
            account.isBoothBought(startBalance);
        }

        public Player() {

        }

        public void setPosition(int position) {
            this.position = position;
        }

        public void adjustBalance(int money) {
            account.isBoothBought(money);
        }

        public Account getAccount() {
            return account;
        }
    }
