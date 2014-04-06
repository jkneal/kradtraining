package org.kuali.rice.krtrain.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.kuali.rice.krad.bo.DataObjectBase;

/**
 * Book Type Entity
 *
 * @author KRAD Training
 */
@Entity
@Table(name="KRTRAIN_PUB_CD_T")
public class PublisherCode extends DataObjectBase {
    private static final long serialVersionUID = 1154874729429390726L;

	@Id
	@Column(name="PUB_CD")
    private String code;
	
	@Column(name="NM")
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
