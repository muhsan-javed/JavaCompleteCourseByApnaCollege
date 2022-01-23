package banking;


class Account{
    public String name;
    public String last;
    public byte age;
    protected String email;
    private String password;
    // getters & Setters
    public String getPassword(){
        // setPassword(Randompass);
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }


}
public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Muhsan";
        account.last = "Javed";
        account.age = 19;
        account.email = "Muhsanjaved048@gmail.com";
        account.setPassword("sasdad");
        System.out.println(account.getPassword());

    }
    
}
