package bank;


class Account{
    public String name; //public modifier
    protected String email; //protected modifier
    private String password; //private modifier
    // when we declare any variable as private we cannot access it outside the class
    // even we cannot access it in the child class

    // so we use getter and setter method to access it
    // getter
    public String getPassword(){
        setPassword(randomPass);
        return this.password;
    }
    // setter
    public void setPassword(String pass){
        this.password=pass;
    }
}

public class Bank {
    public static void main(String args[]){
        Account account1=new Account(); //public modifier so we can used here directly
        account1.name="Apna College";
        account1.email= "apnacollege@gmail.com";
        account1.setPassword(account1.getPassword());
        System.out.println(account1.getPassword());

    }
}

