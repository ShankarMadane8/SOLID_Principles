package lsp;

//Violation of LSP
//class Penguin extends Bird {
//    @Override
//    public void fly() {
//        throw new UnsupportedOperationException("Penguins can't fly.");
//    }
//}


//Adhering To LSP
class Penguin extends WalkingBird {
    @Override
    public void walk() {
        System.out.println("Penguin is waddling.");
    }
}
