package com.fincatto.nfe.classes.nota;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import com.fincatto.nfe.classes.NFBase;
import com.fincatto.nfe.validadores.ListValidador;
import com.fincatto.nfe.validadores.StringValidador;

public class NFNotaInfoInformacoesAdicionais extends NFBase {
    @Element(name = "infAdFisco", required = false)
    private String informacoesAdicionaisInteresseFisco;

    @Element(name = "infCpl", required = false)
    private String informacoesComplementaresInteresseContribuinte;

    @ElementList(entry = "obsCont", inline = true, required = false)
    private List<NFNotaInfoObservacao> observacoesContribuinte;

    @ElementList(entry = "obsFisco", inline = true, required = false)
    private List<NFNotaInfoObservacao> observacoesFisco;

    @ElementList(entry = "procRef", inline = true, required = false)
    private List<NFNotaInfoProcessoReferenciado> processosRefenciado;

    public void setInformacoesAdicionaisInteresseFisco(final String informacoesAdicionaisInteresseFisco) {
        StringValidador.tamanho2000(informacoesAdicionaisInteresseFisco);
        this.informacoesAdicionaisInteresseFisco = informacoesAdicionaisInteresseFisco;
    }

    public void setInformacoesComplementaresInteresseContribuinte(final String informacoesComplementaresInteresseContribuinte) {
        StringValidador.tamanho5000(informacoesComplementaresInteresseContribuinte);
        this.informacoesComplementaresInteresseContribuinte = informacoesComplementaresInteresseContribuinte;
    }

    public void setObservacoesContribuinte(final List<NFNotaInfoObservacao> observacoesContribuinte) {
        ListValidador.tamanho10(observacoesContribuinte);
        this.observacoesContribuinte = observacoesContribuinte;
    }

    public void setObservacoesFisco(final List<NFNotaInfoObservacao> observacoesFisco) {
        ListValidador.tamanho10(observacoesFisco);
        this.observacoesFisco = observacoesFisco;
    }

    public void setProcessosRefenciado(final List<NFNotaInfoProcessoReferenciado> processosRefenciado) {
        this.processosRefenciado = processosRefenciado;
    }
}