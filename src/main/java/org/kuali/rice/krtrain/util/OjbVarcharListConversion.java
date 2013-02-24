package org.kuali.rice.krtrain.util;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.ojb.broker.accesslayer.conversions.ConversionException;
import org.apache.ojb.broker.accesslayer.conversions.FieldConversion;

/**
 * Converts between a comma delimited string in the database to a List<String>
 * 
 * @author KRAD Training
 */
public class OjbVarcharListConversion implements FieldConversion {
	private static final long serialVersionUID = 1711323616780884850L;

	@Override
	public Object javaToSql(Object arg0) throws ConversionException {
		String value = "";

		if ((arg0 != null) && arg0 instanceof List) {
			List<String> list = (List<String>) arg0;

			value = StringUtils.join(list, ",");
		}

		return value;
	}

	@Override
	public Object sqlToJava(Object arg0) throws ConversionException {
		List<String> value = null;

		if ((arg0 != null) && arg0 instanceof String) {
			String string = (String) arg0;

			String[] values = StringUtils.split(string, ",");
			value = Arrays.asList(values);
		}

		return value;
	}

}
