package dti.crmsis;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "RAW_REQUEST")
public class RawRequest extends PanacheEntity {

    public String requestData; // Содержимое запроса

    public String status; // "PENDING", "PROCESSED", "FAILED"

    @Column(updatable = false) // created_at не должен обновляться
    public java.time.LocalDateTime createdAt; // Время вставки

    public java.time.LocalDateTime processedAt; // Время обработки (обновляется автоматически)
}