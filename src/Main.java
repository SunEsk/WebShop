public class Main {

    public static void main(String[] args) {
        WebShop ws = new WebShop();
        ws.buyStuff();
		
		//Add magic here, step 3
        ws.webShopUI(WebShop.InfoRequest.ShowShippingCosts);



        //For step 5
        PurchaseConfirmation pc = new PurchaseConfirmation();
        pc.confirmationEmail(ws);
    }

}
