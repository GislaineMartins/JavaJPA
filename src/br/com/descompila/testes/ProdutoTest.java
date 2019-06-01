/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.descompila.testes;

import br.com.descompila.model.bean.Categoria;
import br.com.descompila.model.bean.Produto;
import br.com.descompila.model.dao.ProdutoDAO;

/**
 *
 * @author ESCRITÓRIO II
 */
public class ProdutoTest {
    public static void main(String[] args) {
//        //TESTE PARA SAVAR
//        ProdutoDAO dao = new ProdutoDAO();
//        Produto produto = new Produto();
//        Categoria categoria = new Categoria();
//        categoria.setId(4);
//        
//        produto.setDescricao("Tênis Nike");
//        produto.setQtd(50);
//        produto.setValor(250.50);
//        produto.setCategoria(categoria);
//        
//        dao.save(produto);
        
//        //TESTE PARA UPDATE
//        ProdutoDAO dao = new ProdutoDAO();
//        Produto produto = new Produto();
//        produto.setId(2);
//        Categoria categoria = new Categoria();
//        categoria.setId(2);
//        
//        produto.setDescricao("Feijão");
//        produto.setQtd(10);
//        produto.setValor(4.5);
//        produto.setCategoria(categoria);
//        
//        dao.update(produto);
        
        //TESTE PARA MOSTRAR PRODUTO POR ID
//        ProdutoDAO dao = new ProdutoDAO();
//        
//        Produto produto = dao.findById(2);
//        
//        System.out.println("Descrição: "+produto.getDescricao());
//        System.out.println("QTD: "+produto.getQtd());
//        System.out.println("Valor: "+produto.getValor());
//        System.out.println("Categoria: "+produto.getCategoria().getDescricao());
        
        
        ProdutoDAO dao = new ProdutoDAO();
        
        for(Produto produto: dao.findAll()){
                   System.out.println("Descrição: "+produto.getDescricao());
       System.out.println("QTD: "+produto.getQtd());
     System.out.println("Valor: "+produto.getValor());
          System.out.println("Categoria: "+produto.getCategoria().getDescricao());
            System.out.println("---------------------------------");
        }
        
        
        
        
        
                
    }
    
}
