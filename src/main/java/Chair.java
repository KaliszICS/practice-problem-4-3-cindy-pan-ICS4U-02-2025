/**
 * This program collects the length and width of a rectangle
 * it has different constructors 
 * @author cindy Pan
 * @version i dont know and i dont know how to check
 */
class Chair {
    private int legs;
    private String material;
/**
 * this constructor takes no parameters
 */
    public Chair(){
        this.legs=4;
        this.material="wood";

    }
    /**
     * this constructor takes 1 parameter
     * it takes an int value stored in legs1
     * @param legs1 an int variable used to set the legs variable
     * 
     */
    public Chair(int legs1){
        this.legs = legs1;
        this.material = "wood";
    }
    /**
     * this constructor takes 2 parameters
     * @param legs1 an int variable used to set the legs variable
     * @param material1 a String variable used to set the material variable
     */
    public Chair(int legs1, String material1){
        this.legs=legs1;
        this.material=material1;
    }
/**
 * These following getters get and return the variables
 * @return getLegs return the value in the legs varibale
 * @return getMaterial returns the value in the material variable
 */
    public int getLegs(){
        return legs;
    }
    public String getMaterial(){
        return material;
    }
}
