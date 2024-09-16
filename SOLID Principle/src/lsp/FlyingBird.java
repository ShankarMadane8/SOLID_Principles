package lsp;

//Violating LSP
//class Sparrow extends Bird {
//    @Override
//    public void fly() {
//        System.out.println("Sparrow is flying.");
//    }
//}


//Adhering To LSP
class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}
