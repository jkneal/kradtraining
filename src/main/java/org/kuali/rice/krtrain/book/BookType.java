/**
 * Copyright 2005-2012 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 */
package org.kuali.rice.krtrain.book;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.kuali.rice.core.api.mo.common.active.MutableInactivatable;
import org.kuali.rice.krad.bo.DataObjectBase;
import org.kuali.rice.krad.data.jpa.converters.BooleanYNConverter;

/**
 * Book Type Entity
 *
 * @author KRAD Training
 */
@Entity
@Table(name="KRTRAIN_BOOK_TYP_T")
public class BookType extends DataObjectBase implements MutableInactivatable {
    private static final long serialVersionUID = 8499633675478827977L;

	@Id
	@Column(name="TYP_CD")
    private String typeCode;
	
	@Column(name="NM")
    private String name;
	
	@Column(name="DESC_TXT")
    private String description;
	
	@Convert(converter = BooleanYNConverter.class)
	@Column(name="ACTV_IND")
    private boolean active;

    public BookType() {
        super();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
