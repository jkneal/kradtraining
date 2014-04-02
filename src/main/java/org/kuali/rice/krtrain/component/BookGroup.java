package org.kuali.rice.krtrain.component;

import org.kuali.rice.krad.uif.component.Component;
import org.kuali.rice.krad.uif.container.GroupBase;
import org.kuali.rice.krad.uif.util.LifecycleElement;

/**
 * Group who items are rendered as a book page using the booklet widget.
 */
public class BookGroup extends GroupBase {
    private static final long serialVersionUID = 1221393415042482671L;

    private Booklet booklet;

    public BookGroup() {
        super();
    }

    @Override
    public void performFinalize(Object model, LifecycleElement parent) {
        super.performFinalize(model, parent);

        // add CSS selectors for booklet plugin
        getLayoutManager().getCssClasses().add("b-load");

        for (Component component : getItems()) {
            component.getCssClasses().add("b-loadPage");
        }

        String script = "jQuery('#" + getId() + "').booklet(" + booklet.getTemplateOptionsJSString() + ");";
        setOnDocumentReadyScript(script);
    }

    public Booklet getBooklet() {
        return booklet;
    }

    public void setBooklet(Booklet booklet) {
        this.booklet = booklet;
    }
    
}
