package com.example.demo;

import java.util.*;

public class OrderProcessor {

    private List<String> unusedOrderLog = new ArrayList<>(); // dead code, never used

    public double calculateTotal(List<Double> prices, String couponCode, boolean isMember,
                                  boolean isFirstOrder, String region, boolean isHoliday) {
        double total = 0;
        for (Double p : prices) {
            total += p;
        }

        // deeply nested, high cyclomatic complexity
        if (couponCode != null) {
            if (couponCode.equals("SAVE10")) {
                if (isMember) {
                    if (isFirstOrder) {
                        total = total * 0.75;
                    } else {
                        total = total * 0.8;
                    }
                } else {
                    if (region.equals("US")) {
                        total = total * 0.85;
                    } else {
                        total = total * 0.9;
                    }
                }
            } else if (couponCode.equals("SAVE20")) {
                if (isHoliday) {
                    total = total * 0.6;
                } else {
                    total = total * 0.8;
                }
            }
        }

        return total;
    }

    public void processOrder(String orderId) {
        System.out.println("Processing order: " + orderId);
        // TODO: this method does nothing else, placeholder logic left in production
    }

    private void unusedHelperMethod() {
        // dead code, never called
        System.out.println("This is never used");
    }

    public String buildReceipt(String customerName, double total) {
        String receipt = "";
        receipt = receipt + "Customer: " + customerName + "\n";
        receipt = receipt + "Total: $" + total + "\n";
        receipt = receipt + "Thank you for your order!\n";
        return receipt; // inefficient string concatenation in a loop-prone pattern
    }
}