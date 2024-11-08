public class Superhero implements Contract {
    // Attributes
    private String name;
    private double height;

    /**
     * Superhero constructor
     * @param name
     * @param height
     */
    public Superhero(String name, double height) {
        this.name = name;
        this.height = height;
    }

    /**
     * Grab method
     * 
     * @param item
     */
    public void grab(String item) {
        System.out.println(name + "grabbedd " + item);
    }

    /**
     * Drop function
     * 
     * @param item
     * @return item dropped
     */
    public String drop(String item) {
        return item;
    }

    /**
     * Examine function
     * 
     * @param item
     */
    public void examine(String item) {
        if (item == null) {
            throw new RuntimeException("Can't examine that item.");
        }
        System.out.println("Examining the item.");
        System.out.println(item + " is examined.");
    }

    /**
     * Use function
     * 
     * @param item
     */
    public void use(String item) {
        if (item == null) {
            throw new RuntimeException("Can't use that item.");
        }
        System.out.println("Using the item.");
        System.out.println(item + " is used.");
    }

    /**
     * Walk function
     * 
     * @param direction
     * @return walk boolean
     */
    public boolean walk(String direction) {
        boolean walk = false;
        return walk;
    }

    /**
     * Fly method
     * 
     * @param x
     * @param y
     * @return fly boolean
     */
    public boolean fly(int x, int y) {
        boolean fly = false;
        if (x >= 0 && y > 0) {
            fly = true;
            System.out.println(name + "is flying for " + x + " units long and " + y + "units high.");
        } else {
            throw new RuntimeException(name + "can't fly at the distance.");
        }
        return fly;
    }

    /**
     * Shrink function
     * 
     * @return height after shrinking
     */
    public Number shrink() {
        height -= 1;
        return height;
    }

    /**
     * Grow function
     * 
     * @return height after growing
     */
    public Number grow() {
        height += 1;
        return height;
    }

    /**
     * Rest method
     */
    public void rest() {
        System.out.println(name + " is resting.");
    }

    /**
     * Undo method
     */
    public void undo() {

    }
}
