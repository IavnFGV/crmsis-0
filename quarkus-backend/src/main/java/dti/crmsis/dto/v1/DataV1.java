package dti.crmsis.dto.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import dti.crmsis.dto.CustomField;

import java.util.List;
import java.util.Map;

public class DataV1 {
    @JsonProperty("add_time")
    private String addTime;

    private String channel;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("close_time")
    private String closeTime;

    @JsonProperty("creator_user_id")
    private Long creatorUserId;

    private String currency;

    @JsonProperty("custom_fields")
    private Map<String, CustomField> customFields;

    @JsonProperty("expected_close_date")
    private String expectedCloseDate;

    @JsonProperty("first_won_time")
    private String firstWonTime;

    private Long id;

    @JsonProperty("label_ids")
    private List<Integer> labelIds;

    @JsonProperty("lost_reason")
    private String lostReason;

    @JsonProperty("lost_time")
    private String lostTime;

    @JsonProperty("org_id")
    private String orgId;

    private String origin;

    @JsonProperty("origin_id")
    private String originId;

    @JsonProperty("owner_id")
    private Long ownerId;

    @JsonProperty("person_id")
    private Long personId;

    @JsonProperty("pipeline_id")
    private Integer pipelineId;

    private Integer probability;

    @JsonProperty("stage_change_time")
    private String stageChangeTime;

    @JsonProperty("stage_id")
    private Integer stageId;

    private String status;
    private String title;

    @JsonProperty("update_time")
    private String updateTime;

    private Double value;

    @JsonProperty("visible_to")
    private String visibleTo;

    @JsonProperty("won_time")
    private String wonTime;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Map<String, CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, CustomField> customFields) {
        this.customFields = customFields;
    }

    public String getExpectedCloseDate() {
        return expectedCloseDate;
    }

    public void setExpectedCloseDate(String expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public String getFirstWonTime() {
        return firstWonTime;
    }

    public void setFirstWonTime(String firstWonTime) {
        this.firstWonTime = firstWonTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public String getLostReason() {
        return lostReason;
    }

    public void setLostReason(String lostReason) {
        this.lostReason = lostReason;
    }

    public String getLostTime() {
        return lostTime;
    }

    public void setLostTime(String lostTime) {
        this.lostTime = lostTime;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Integer getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public String getStageChangeTime() {
        return stageChangeTime;
    }

    public void setStageChangeTime(String stageChangeTime) {
        this.stageChangeTime = stageChangeTime;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getVisibleTo() {
        return visibleTo;
    }

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public String getWonTime() {
        return wonTime;
    }

    public void setWonTime(String wonTime) {
        this.wonTime = wonTime;
    }
}
