package com.marcelo.appminhaideia.controller;

import android.content.ContentValues;
import android.content.Context;

import com.marcelo.appminhaideia.datamodel.ProdutoDataModel;
import com.marcelo.appminhaideia.datasource.AppDataBase;
import com.marcelo.appminhaideia.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put("nome", obj.getNome());
        dadoDoObjeto.put("fornecedor", obj.getFornecedor());

        return insert(ProdutoDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean alterar(Produto obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put("id", obj.getId());
        dadoDoObjeto.put("nome", obj.getNome());
        dadoDoObjeto.put("fornecedor", obj.getFornecedor());

        return update(ProdutoDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean deletar(int id) {
        return deleteById(ProdutoDataModel.TABELA, id);
    }

    @Override
    public List<Produto> listar() {
        List<Produto> produtoLista = new ArrayList<>();
        return produtoLista;
    }
}
