/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Payden Boughton
 */
public class Stock {
    
    private String companyName;
    private double numShares;
    private double purchasePrice;
    private double currentPrice;
    
//constructors
    public Stock() {
        companyName = "UnKnown";
        numShares = 0;
        purchasePrice = 0;
        currentPrice = 0;
    }

    public Stock(String companyName, double numShares, double purchasePrice, double currentPrice) {
        this.companyName = companyName;
        this.numShares = numShares;
        this.purchasePrice = purchasePrice;
        this.currentPrice = currentPrice;
    }
    //behaviors
    public double showProifitLoss(){
        return numShares * (currentPrice - purchasePrice);
    }

    @Override
    public String toString() {
        return companyName + ": " + numShares + " shares";
    }
    
    //getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public double getNumShares() {
        return numShares;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNumShares(double numShares) {
        this.numShares = numShares;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    
    
    
    
}
