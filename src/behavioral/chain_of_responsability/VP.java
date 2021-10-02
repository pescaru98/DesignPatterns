package behavioral.chain_of_responsability;

public class VP extends Handler {
    /* Here, maybe the else going for the first if too ?*/
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VP can approbe purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
