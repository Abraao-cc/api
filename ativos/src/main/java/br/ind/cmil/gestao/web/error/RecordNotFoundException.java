package br.ind.cmil.gestao.web.error;

/**
 *
 * @author Administrativo
 */
public class RecordNotFoundException extends RuntimeException {

    private final String attibuite;

    public RecordNotFoundException(String name, String message) {
        super(message);
        this.attibuite = name;
    }

    public String getAttibuite() {
        return attibuite;
    }
    
}
