/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.plan.serviceImpl;


import com.example.plan.entity.Pedido;
import java.util.List;

/**
 *
 * @author javier_gr
 */
public interface PedidoService {
    Pedido create( Pedido  pedido);
    Pedido  update( Pedido  pedido);
    void delete(int id);
     Pedido  read(int id);
    List< Pedido > readAll();
    
}
