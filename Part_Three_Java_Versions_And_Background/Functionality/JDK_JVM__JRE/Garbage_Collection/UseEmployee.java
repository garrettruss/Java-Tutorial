package Part_Three_Java_Versions_And_Background.Functionality.JDK_JVM__JRE.Garbage_Collection;

public class UseEmployee {
    public static void main(String[] args) {
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();

        {
            // It is sub block to keep
            // all those interns.
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();

            /*
             * Now garbage collector(gc) will see 2 objects free. Now to decrement
             * nextId,gc(garbage collector) will call method to finalize() only when we
             * programmers have overridden it in our class. And as mentioned previously, we
             * have to request gc(garbage collector), and for this, we have to write the
             * following 3 steps before closing brace of sub-block.
             * 
             * Set references to null(i.e X = Y = null;)
             * Call, System.gc();
             * Call, System.runFinalization();
            
             */


            X = Y = null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}