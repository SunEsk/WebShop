public class PurchaseConfirmation {


    /**
     * Prints all the product descriptions
     * And the Total purchase price
     */
    public void confirmationEmail(WebShop ws)
    {
		//Add magic here, step 5
        double totalprice = 0;
        for (var i : ws.shoppingCart.getItems())
        {
            System.out.println(i.getDescription());
            totalprice = i.getPrice() + totalprice;
        }

        System.out.println(totalprice + "kr.");




    }

}
