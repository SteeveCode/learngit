package com.designpatterns;
/*
* The prototype pattern is used when your object is very expensive to create. An example will be creating
* a very complex object that require a lot of memories to store all of its properties and methods. Usually
* the prototype pattern fits when your object is costly to create and cloning your object by copying all its
* member variables will do the trick.
* New objects are typically not created with the "new" keyword but with the "clone" method. Only the first
* instance will use the keyword "new" and when requiring other objects of the same type the clone method will
* be used instead.
* The example below is a shallow copy. It copies only the instance primitives and instance reference types and
* not the object itself. The memory address of the component object is the same but that of the robot object
* is not the same.
 */
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform Task");
        features.add("Shut down");
        Components components = new Components();
        components.setName("Infrared Goggles");
        components.setFunctionality("Read temperature of objects");

        Robot robot = new Robot(1, features, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getId());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeatures());
        System.out.println(robot);

        System.out.println(anotherRobot.getId());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeatures());
        System.out.println(anotherRobot);
    }
}
