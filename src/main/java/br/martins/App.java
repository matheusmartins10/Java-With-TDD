package br.martins;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        FizzBuzz eu = new FizzBuzz();
        for(int i = 0; i < 100; i++){
         System.out.println(eu.concat(i));
        }
    }
}
