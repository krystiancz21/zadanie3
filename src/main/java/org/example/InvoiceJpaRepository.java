package org.example;

import org.springframework.cache.annotation.Cacheable;

public class InvoiceJpaRepository implements InvoiceRepository {
    @Override
    @Cacheable("invoices")
    public Invoice find(final String invoiceNumber) {
        // ... implementation
        return new Invoice(invoiceNumber, "Example data");
    }
}
