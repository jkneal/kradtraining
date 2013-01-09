package org.kuali.rice.krtrain.editors;

import org.apache.commons.lang.StringUtils;

import java.beans.PropertyEditorSupport;
import java.io.Serializable;

/**
 * Property Editor that add the ordinal suffix to the edition integer
 *
 * @author KRAD Training
 */
public class EditionPropertyEditor extends PropertyEditorSupport implements Serializable {
    private static final long serialVersionUID = 4402083661578535014L;

    /**
     * @see java.beans.PropertyEditorSupport#getAsText()
     */
    @Override
    public String getAsText() {
        Object obj = this.getValue();

        if (obj == null) {
            return null;
        }

        if (!(obj instanceof Integer)) {
            return obj.toString();
        }

        int edition = (Integer) obj;

        String displayValue = Integer.toString(edition);

        if (edition > 10 && edition < 14) {
            displayValue += "th";
        } else if (StringUtils.endsWith(displayValue, "1")) {
            displayValue += "st";
        } else if (StringUtils.endsWith(displayValue, "2")) {
            displayValue += "nd";
        } else if (StringUtils.endsWith(displayValue, "3")) {
            displayValue += "rd";
        } else {
            displayValue += "th";
        }

        displayValue += " Edition";

        return displayValue;
    }

    /**
     * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
     */
    @Override
    public void setAsText(String text) {
        String value = text;

        if (StringUtils.contains(value, "th")) {
            value = StringUtils.substringBefore(value, "th");
        } else if (StringUtils.contains(value, "st")) {
            value = StringUtils.substringBefore(value, "st");
        } else if (StringUtils.contains(value, "nd")) {
            value = StringUtils.substringBefore(value, "nd");
        } else if (StringUtils.contains(value, "rd")) {
            value = StringUtils.substringBefore(value, "rd");
        }

        if (StringUtils.contains(value, "Edition")) {
            value = StringUtils.substringBefore(value, "Edition");
        }

        value = StringUtils.remove(value, " ");

        this.setValue(Integer.parseInt(value));
    }
}
