package com.educavalieri.producerspring.resource;


import com.educavalieri.producerspring.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {

    @Autowired
    private MensagemService mensagemService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String msg){
        mensagemService.sendMessage(msg);
        return ResponseEntity.ok().body("mensagem enviada com sucesso" + msg);
    }

}
