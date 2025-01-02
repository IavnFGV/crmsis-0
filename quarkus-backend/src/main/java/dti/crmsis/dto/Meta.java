package dti.crmsis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meta {
    private String action;

    @JsonProperty("company_id")
    private String companyId;

    @JsonProperty("correlation_id")
    private String correlationId;

    @JsonProperty("entity_id")
    private String entityId;

    private String entity;
    private String id;

    @JsonProperty("is_bulk_edit")
    private boolean isBulkEdit;

    private String timestamp;
    private String type;

    @JsonProperty("user_id")
    private String userId;

    private String version;

    @JsonProperty("webhook_id")
    private String webhookId;

    @JsonProperty("webhook_owner_id")
    private String webhookOwnerId;

    private Integer attempt;
    private String host;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isBulkEdit() {
        return isBulkEdit;
    }

    public void setBulkEdit(boolean bulkEdit) {
        isBulkEdit = bulkEdit;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getWebhookOwnerId() {
        return webhookOwnerId;
    }

    public void setWebhookOwnerId(String webhookOwnerId) {
        this.webhookOwnerId = webhookOwnerId;
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
