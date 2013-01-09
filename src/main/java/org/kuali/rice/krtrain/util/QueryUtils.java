package org.kuali.rice.krtrain.util;

import org.kuali.rice.krad.service.KRADServiceLocator;
import org.kuali.rice.krtrain.book.PublisherCode;

/**
 * Helper class for executing queries
 *
 * @author KRAD Training
 */
public class QueryUtils {

    public static PublisherCode retrievePublisherCode(String pubCode) {
   		return KRADServiceLocator.getBusinessObjectService().findBySinglePrimaryKey(PublisherCode.class, pubCode);
   	}
}
