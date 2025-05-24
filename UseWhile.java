import javax.swing.JOptionPane;

public class UseWhile {
    public static void main(String[] args) {

	var per1 = new Person("David", "Pato1");
	var pass = "";
	var band = false;
	
	while ( band = !(per1.getPassword().equals(pass)) ) {
	    pass = JOptionPane.showInputDialog("You type a password: ");

	    if (!band)
		System.out.println("Password wront");
	}

	System.out.println("You pass!!");
      
    }
}

class Person {
    private String name;
    private String password;

    Person() {
	this.name = "";
	this.password = "";
    }

    Person(String name, String password) {
	this.name = name;
	this.password = password;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getName() {
	return this.name;
    }

    public String getPassword() {
	return this.password;
    }
}
