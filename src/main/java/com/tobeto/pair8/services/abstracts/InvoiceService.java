package com.tobeto.pair8.services.abstracts;

import com.tobeto.pair8.services.dtos.invoice.requests.AddInvoiceRequest;
import com.tobeto.pair8.services.dtos.invoice.requests.DeleteInvoiceRequest;
import com.tobeto.pair8.services.dtos.invoice.requests.UpdateInvoiceRequest;
import com.tobeto.pair8.services.dtos.invoice.responses.GetByIdInvoiceResponse;
import com.tobeto.pair8.services.dtos.invoice.responses.GetListInvoceResponse;

import java.util.List;

public interface InvoiceService {
    void add(AddInvoiceRequest addInvoiceRequest);

    void update(UpdateInvoiceRequest updateInvoiceRequest);

    void delete (DeleteInvoiceRequest deleteInvoiceRequest);

    List<GetListInvoceResponse> getAll();

    GetByIdInvoiceResponse getById(int id);
}
