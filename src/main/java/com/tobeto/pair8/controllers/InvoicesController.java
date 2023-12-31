package com.tobeto.pair8.controllers;

import com.tobeto.pair8.services.abstracts.InvoiceService;
import com.tobeto.pair8.services.dtos.invoice.requests.AddInvoiceRequest;
import com.tobeto.pair8.services.dtos.invoice.requests.DeleteInvoiceRequest;
import com.tobeto.pair8.services.dtos.invoice.requests.UpdateInvoiceRequest;
import com.tobeto.pair8.services.dtos.invoice.responses.GetByIdInvoiceResponse;
import com.tobeto.pair8.services.dtos.invoice.responses.GetListInvoceResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/invoices")
@AllArgsConstructor
public class InvoicesController {
    private InvoiceService invoiceService;

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody @Valid AddInvoiceRequest addInvoiceRequest){ invoiceService.add(addInvoiceRequest);}

    @PutMapping("/update")
    public void update(@RequestBody @Valid UpdateInvoiceRequest updateInvoiceRequest) {invoiceService.update(updateInvoiceRequest);}

    @DeleteMapping("/delete")
    public void delete(@RequestBody @Valid DeleteInvoiceRequest deleteInvoiceRequest) {invoiceService.delete(deleteInvoiceRequest);}

    @GetMapping("/getAll")
    public List<GetListInvoceResponse> getAll() { return invoiceService.getAll();}

    @GetMapping("/getById")
    public GetByIdInvoiceResponse getById(@RequestParam @Valid int id){
        return invoiceService.getById(id);
    }

}
