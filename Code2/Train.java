2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.

package MethodOverriding;
public class train extends vehicle{
    
    public void start() {
        System.out.println("The train started");
    }
    public void stop() {
        System.out.println("The train stopped");
    }
}
