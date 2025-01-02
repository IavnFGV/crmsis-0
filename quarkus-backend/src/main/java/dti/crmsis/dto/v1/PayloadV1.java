package dti.crmsis.dto.v1;

import dti.crmsis.dto.Meta;

public class PayloadV1 {
    private DataV1 data;
    private PreviousV1 previous;
    private Meta meta;

    // Getters and Setters

    public DataV1 getData() {
        return data;
    }

    public void setData(DataV1 data) {
        this.data = data;
    }

    public PreviousV1 getPrevious() {
        return previous;
    }

    public void setPrevious(PreviousV1 previous) {
        this.previous = previous;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
