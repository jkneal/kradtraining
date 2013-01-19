package org.kuali.rice.krtrain.bookproposal;

import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller for the Book Entry View
 *
 * @author KRAD Training
 */
@Controller
@RequestMapping(value = "/bookEntry")
public class BookEntryController extends UifControllerBase {

    protected UifFormBase createInitialForm(HttpServletRequest httpServletRequest) {
        return new BookEntryForm();
    }
}
