package org.kuali.rice.krtrain.book;

import org.kuali.rice.krad.uif.UifConstants;
import org.kuali.rice.krad.uif.component.Component;
import org.kuali.rice.krad.uif.container.Group;
import org.kuali.rice.krad.uif.control.ControlBase;
import org.kuali.rice.krad.uif.element.Link;
import org.kuali.rice.krad.uif.field.InputField;
import org.kuali.rice.krad.uif.service.impl.ViewHelperServiceImpl;
import org.kuali.rice.krad.uif.util.ComponentFactory;
import org.kuali.rice.krad.uif.util.ComponentUtils;
import org.kuali.rice.krad.uif.view.View;
import org.kuali.rice.krad.uif.view.ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * View helper service for the Book Entry view
 *
 * @author KRAD Training
 */
public class BookEntryViewHelper extends ViewHelperServiceImpl {
    private static final long serialVersionUID = -1266486040584339781L;

    public void setupAuthorBlogLink(Link link, ViewModel model) {
        link.setLinkText("Author Blog");
        link.setHref("http://www.goodreads.com/author_blogs");
    }

    @Override
    protected void performCustomInitialization(View view, Component component) {
        super.performCustomInitialization(view, component);

        if (component != null && ("Krtrain-BookEntryPage1".equals(component.getId()))) {
            Group page = (Group) component;

            Group group = ComponentFactory.getVerticalBoxSection();
            view.assignComponentIds(group);

            group.setHeaderText("Top Book Awards");

            List<Component> groupItems = new ArrayList<Component>();

            InputField field = ComponentFactory.getInputField("bookAwardOne", "Award One",
                    UifConstants.ControlType.TEXT);
            view.assignComponentIds(field);

            InputField field2 = ComponentUtils.copy(field);
            view.assignComponentIds(field2);

            field2.setPropertyName("bookAwardTwo");
            field2.setLabel("Award Two");

            field.getControl().setOnFocusScript("showLightboxComponent('addAwardDialog');");

            groupItems.add(field);
            groupItems.add(field2);
            group.setItems(groupItems);

            List<Component> pageItems = new ArrayList<Component>();
            pageItems.addAll(page.getItems());
            pageItems.add(group);

            page.setItems(pageItems);
        }
    }
}
