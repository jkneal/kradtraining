package org.kuali.rice.krtrain.finders;

import org.kuali.rice.krad.valuefinder.ValueFinder;

/**
 * Retrieves the default binding type value
 *
 * @author KRAD Training
 */
public class DefaultBindingTypeValueFinder implements ValueFinder {

    public String getValue() {
        // normally this would be querying the database or a service

        return "SPIRAL";
    }
}
