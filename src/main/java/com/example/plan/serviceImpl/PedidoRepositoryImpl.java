/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.plan.serviceImpl;

import com.example.plan.entity.Pedido;
import com.example.plan.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javier_gr
 */
@Service
public class PedidoRepositoryImpl implements PedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;
    @Override
    public Pedido create(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido update(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public void delete(int id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public Pedido read(int id) {
        return pedidoRepository.findById(id).get();
    }

    @Override
    public List<Pedido> readAll() {
        return pedidoRepository.findAll();
    }
    
}
