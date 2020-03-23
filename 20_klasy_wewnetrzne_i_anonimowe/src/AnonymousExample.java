public class AnonymousExample {

    public interface GreetingModule {
        void sayHello();
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModule() { //nie nadajemy nazwy dlatego anonimowa

            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        };
    }


    //Inaczej możemy zapisać to tak
   /* public interface GreetingModule {
        void sayHello();
    }

    public class GreetingModuleImpl implements GreetingModule {
        @Override
        public void sayHello() {
            System.out.println("good morning");
        }
    }
    public void someMethod() {
        GreetingModule greeting = new GreetingModuleImpl();
    }*/


}