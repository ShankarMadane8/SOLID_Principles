package lsp;

public class LiskovSubstitutionPrinciple {
	
	
	public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); // Sparrow is flying
        
        Bird penguin = new Penguin();
        penguin.eat(); // Penguin is eating
    }

}
