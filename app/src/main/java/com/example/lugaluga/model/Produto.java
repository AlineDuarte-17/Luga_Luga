package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Produto implements Parcelable {

    private String nome;

    private double preco;

    private String descricao;

    private String status;

    private double quantidade;

    public Produto(String nome, double preco, String descricao, String status, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.status = status;
        this.quantidade = quantidade;
    }

    protected Produto(Parcel in) {
        nome = in.readString();
        preco = in.readDouble();
        descricao = in.readString();
        status = in.readString();
        quantidade = in.readDouble();
    }

    public static final Creator<Produto> CREATOR = new Creator<Produto>() {
        @Override
        public Produto createFromParcel(Parcel in) {
            return new Produto(in);
        }

        @Override
        public Produto[] newArray(int size) {
            return new Produto[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeDouble(preco);
        dest.writeString(descricao);
        dest.writeString(status);
        dest.writeDouble(quantidade);
    }

}
