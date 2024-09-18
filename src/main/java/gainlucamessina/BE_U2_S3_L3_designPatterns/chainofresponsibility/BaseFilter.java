package gainlucamessina.BE_U2_S3_L3_designPatterns.chainofresponsibility;

public abstract class BaseFilter {
    private BaseFilter next;

    public abstract void doWork();

    public void goNext(){
        if(this.next!=null){
            //andiamo al prossimo filtro se non siamo alla fine della catena

        }else {
            System.out.println("CATENA FINITA");
        }
    }

}
