package ch.zhaw.sml.iwi.pmis.meng.artikeltrainer.model;

public enum Artikel {

    DER, DIE, DAS;
    
    @Override
    public String toString() {
        return name().toLowerCase();
    }

    
}