public class Main {
    public static void main(String[] args) {
            IDandPW iDandPW = new IDandPW();
            LoginPage loginPage = new LoginPage(iDandPW.getLoginInfo());
    }
}
