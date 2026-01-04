package org.example.warehouseapp.controller;

import org.example.warehouseapp.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttachmentController {
    @Autowired
    private AttachmentService attachmentService;

}
