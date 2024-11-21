package ma.projet.graph.entities.dtos;

import ma.projet.graph.entities.TypeTransaction;

public class TransactionRequest {

    private TypeTransaction type; // Type de transaction : DEPOT ou RETRAIT
    private Double montant;       // Montant de la transaction
    private Long compteId;        // ID du compte associé à la transaction

    // Getters et setters
    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Long getCompteId() {
        return compteId;
    }

    public void setCompteId(Long compteId) {
        this.compteId = compteId;
    }
}
