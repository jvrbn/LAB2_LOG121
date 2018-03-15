package test;

import cadriciel.*;

public class FabriqueMock extends FabriqueJeu {

    CollectionDes des;

    public FabriqueMock(CollectionDes des){
        this.des = des;
    }

    @Override
    protected CollectionDes fabriquerDes() {
        return des;
    }
}
