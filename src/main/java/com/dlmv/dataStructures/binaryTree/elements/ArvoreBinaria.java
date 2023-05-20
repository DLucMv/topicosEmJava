package com.dlmv.dataStructures.binaryTree.elements;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> root;

    public ArvoreBinaria(){
        this.root = null;
    }

    public void insert(T data){
        BinNo<T> novoNo = new BinNo<>(data);
        root = insert(root, novoNo);
    }

    private BinNo<T> insert(BinNo<T> atual, BinNo<T> novoNo){

        if(atual == null){
            return novoNo;
        }
        else if(novoNo.getData().compareTo(atual.getData()) < 0){
            atual.setNoEsq(insert(atual.getNoEsq(), novoNo));
        }
        else{
            atual.setNoDir(insert(atual.getNoDir(), novoNo));
        }

        return atual;

    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.root);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getData() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.root);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getData() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.root);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getData() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public int high(){
        System.out.println("\nAltura da arvore: ");
        return 1 + high(this.root);
    }

    public int high(BinNo<T> atual){
        if(atual == null){
            return -1;
        }
        else if(atual != null && (atual.getNoEsq() == null && atual.getNoDir() == null)){
            return 0;
        }
        else{
            if(high(atual.getNoEsq()) > high(atual.getNoDir())){
                return 1 + high(atual.getNoEsq());
            }
            else{
                return 1 + high(atual.getNoDir());
            }
        }
    }

    public int contarNos(){
        System.out.println("\nElementos da arvore: ");
        return contarNos(this.root);
    }

    private int contarNos(BinNo<T> atual) {
        if(atual == null)  return 0;
        else return ( 1 + contarNos(atual.getNoEsq()) + contarNos(atual.getNoDir()));
    }

    public void exibirFolhas(){
        System.out.println("\nExibindo Folhas");
        exibirFolhas(this.root);
    }

    private void exibirFolhas(BinNo<T> atual){
        if(atual != null){
            if(atual.getNoEsq() == null && atual.getNoDir() == null){
                System.out.print(atual.getData() + ", ");
            }
            exibirFolhas(atual.getNoEsq());
            exibirFolhas(atual.getNoDir());
        }
    }

    public boolean extratamenteBinaria(){
        System.out.println("\nA arvore é estritamente binária?");
        return extratamenteBinaria(this.root);
    }

    private boolean extratamenteBinaria(BinNo<T> atual){
        if(atual != null){
            if(((atual.getNoDir() == null) && (atual.getNoEsq() != null))
                    || (atual.getNoDir() != null) && (atual.getNoEsq() == null)){
                return false;
            }
            else{
                return extratamenteBinaria(atual.getNoEsq())
                        && extratamenteBinaria(atual.getNoDir());
            }
        }
        return true;
    }

    public void remover(T conteudo){
        try{
            BinNo<T> atual = this.root;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getData().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getData()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if(pai == null){
                if(atual.getNoDir() == null){
                    this.root = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.root = atual.getNoDir();
                }else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(root.getNoEsq());
                        }
                    }
                    filho.setNoDir(root.getNoDir());
                    root = filho;
                }
            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for(
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}