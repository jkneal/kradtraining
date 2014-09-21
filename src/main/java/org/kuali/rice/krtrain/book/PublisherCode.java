package org.kuali.rice.krtrain.book;

import org.kuali.rice.krad.bo.DataObjectBase;

/**
 * Book Type Entity
 *
 * @author KRAD Training
 */
public class PublisherCode extends DataObjectBase {
    private static final long serialVersionUID = 1154874729429390726L;

    private String code;
    private String name;

    public PublisherCode() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
