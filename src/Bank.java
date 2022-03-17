public interface Bank {
    int getBalance();
}

class BankA implements Bank {

    public int getBalance() {
        return 100;
    }
}

class BankB implements Bank{

    public int getBalance() {
        return 150;
    }
}

class BankC implements Bank{
    public int getBalance() {
        return 200;
    }
}

class main{
    public static void main(String[] args) {
        BankA aObj = new BankA();
        BankB bObj = new BankB();
        BankC cObj = new BankC();

        System.out.println("Bank A="+aObj.getBalance());
        System.out.println("Bank B="+bObj.getBalance());
        System.out.println("Bank C="+cObj.getBalance());
    }
}