/* Bird.java provides a Bird class.
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 * Completed by: David Reidsma
 * Date: 04/30/2020
 ******************************************************/

public abstract class Bird
{

    /* default constructor
     * PostCond: myName == "".
     */
    public Bird() {
	myName = "";
    }

    /* explicit constructor
     * Receive: name, a String 
     * PostCond: myName == name.
     */
    public Bird(String name) {
	myName = name;
    }

    /* Name accessor
     * Return: myName.
     */
    public String getName() {
	return myName;
    }

    /* A Bird's Call
     * Return: a default bird-call ("Squawk!").
     */
    public String getCall() {
	return "Squawk!";
    }

    /**
     * Get a Bird's movement.
     * @return The movement of the bird.
     */
    public abstract String getMovement();
    
    /* Output a Bird 
     * Output: Everything known about myself
     *          to the standard output stream.
     */
    public void print() {
	System.out.println(getName() + ' ' + getClass().getName() + " just " + getMovement() + " and said " + getCall());
    }

    private String myName;
}

