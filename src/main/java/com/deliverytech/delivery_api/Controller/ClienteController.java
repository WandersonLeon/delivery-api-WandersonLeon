package com.deliverytech.delivery_api.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverytech.delivery_api.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
    // @Autowired
    // private ClienteService clienteService;

    // @PostMapping("path")
    // public ResponseEntity<?> cadastrar(@Validated @RequestBody Cliente cliente) {
    // try {
    // Cliente clienteSalvo = clienteService.cadastrar(cliente);
    // return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
    // } catch (IllegalArgumentExceptionm e) {
    // return ResponseEntity.badRequest().body("Erro: " + e.getMessage());
    // } catch (Exception e) {
    // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    // .body("Erro interno do servidor");
    // }

    // @GetMapping
    // public ResponseEntity<List<Cliente>> listarTodos() {
    // List<Cliente> clientes = clienteService.listarTodos();
    // return ResponseEntity.ok(clientes);
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Cliente> obterPorId(@PathVariable Long id) {
    //     Optional<Cliente> cliente = clienteService.obterPorId(id);
    //     if (cliente.isPresent()) {
    //         return ResponseEntity.ok(cliente.get());
    //     } else {
    //         return ResponseEntity.notFound().build();
    //     }
    // }
    // @PutMapping("/{id}")
    // public ResponseEntity<Cliente> atualizar(@PathVariable Long id, 
    //                                 @Validated @RequestBody Cliente cliente) {
    //     try {
    //         Cliente clienteSalvo = clienteService.cadastrar(cliente);
    //         return ResponseEntity.ok(clienteSalvo);
    //     } catch (IllegalArgumentException e) {
    //         return ResponseEntity.badRequest().body("Erro: " + e.getMessage());
    //     } catch (Exception e) {
    //         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    //                 .body("Erro interno do servidor");
    //     }

    
    }

