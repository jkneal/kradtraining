package org.kuali.rice.krtrain;

import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Generic controller for training exercises
 *
 * @author KRAD Training
 */
@Controller
@RequestMapping(value = "/generic")
public class GenericController extends UifControllerBase {

	@Override
    protected UifFormBase createInitialForm() {
        return new GenericForm();
    }
}
