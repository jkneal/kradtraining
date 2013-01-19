package org.kuali.rice.krtrain.finders;

import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.uif.control.UifKeyValuesFinderBase;
import org.kuali.rice.krad.uif.view.ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves language options for books
 *
 * @author KRAD Training
 */
public class BookLanguageOptions extends UifKeyValuesFinderBase {
    private static final long serialVersionUID = 6326043803276624915L;

    public List<KeyValue> getKeyValues(ViewModel model) {
        List<KeyValue> options = new ArrayList<KeyValue>();

        options.add(new ConcreteKeyValue("E", "English"));
        options.add(new ConcreteKeyValue("G", "German"));
        options.add(new ConcreteKeyValue("F", "French"));
        options.add(new ConcreteKeyValue("S", "Spanish"));
        options.add(new ConcreteKeyValue("I", "Italian"));
        options.add(new ConcreteKeyValue("R", "Russian"));
        options.add(new ConcreteKeyValue("C", "Chinese"));
        options.add(new ConcreteKeyValue("K", "Korean"));

        return options;
    }
}
