/** 10.9.1 Developing a Payable Interface Hierarchy
 
 To build an application that can determine payments for employees and invoices alike, we
 first create interface Payable, which contains method getPaymentAmount that returns a
 double amount that must be paid for an object of any class that implements the interface.
**/

// Fig. 10.11: Payable.java
// Payable interface declaration.

public interface Payable {

	double getPaymentAmount(); // calculate payment; no implementation
}
