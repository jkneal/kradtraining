package org.kuali.rice.krtrain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kuali.rice.krad.UserSession;
import org.kuali.rice.krad.util.GlobalVariables;
import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for the training menu view
 *
 * @author KRAD Training
 */
@Controller
@RequestMapping(value = "/menu")
public class KrtrainMenuController extends UifControllerBase {

	@Override
    protected UifFormBase createInitialForm() {
        return new KrtrainMenuForm();
    }
    
    @RequestMapping(params = "methodToCall=login")
    public ModelAndView login(@ModelAttribute("KualiForm") KrtrainMenuForm form, BindingResult result,
            HttpServletRequest request, HttpServletResponse response) {
    	
    	UserSession userSession = GlobalVariables.getUserSession();
    	userSession.setBackdoorUser(request.getParameter("backdoorId"));
        
    	return getModelAndView(form);
    }
}
