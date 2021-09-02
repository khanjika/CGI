public class Action {

    Fan fan = new Fan ();

    /**
     * The method increases the speed of the fan everytime it is called and if
     * the fan is at speed 3, it is turned off (i.e. speed 0)
     */
    public void speedChange() {
        int speed = fan.getSpeed ();
        if (speed != 3) {
            speed++;
        } else {
            speed = 0;
        }
        fan.setSpeed (speed);
    }

    /**
     * The method reverses the direction of the fan by maintaining the current speed
     */
    public void directionChange() {
        String direction = "";
        if (fan.getDirection () == "Forward") {
            direction = "Reversed";
        } else {
            direction = "Forward";
        }
        fan.setDirection (direction);
    }

    /**
     * This method prints the current speed and direction of the fan
     *
     * @return String - This returns the current speed and direction of the fan
     */
    public String output() {
        return "The speed of the fan : " + fan.getSpeed () + " and the direction : " + fan.getDirection ();
    }

}
