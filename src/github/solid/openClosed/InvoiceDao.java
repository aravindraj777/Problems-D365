package github.solid.openClosed;

import github.solid.Invoice;

/**
 This is an interface for the implementation for open closed principle.
 This states that a class should be open for extension but not for modification.

 In that context
 I had created an interface InvoiceDao which contains a common save method and that save method can be extended
 for different kinds of save purposes like saving to database, saving to file etc.
 */
public interface InvoiceDao {

    public void save(Invoice invoice);

}

class DatabaseInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
//        This method is used for saving to database
    }
}

class FileInvoiceDao implements  InvoiceDao{


    @Override
    public void save(Invoice invoice) {
//        This method is used for saving to file
    }
}
/*
    This is how a class can be reused in future for many other purposes . In future if there is any other kind of
    saving purposes happen then the interface InvoiceDao can be implemented and modify the save method in it .
 */