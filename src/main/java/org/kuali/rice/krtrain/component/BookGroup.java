package org.kuali.rice.krtrain.component;

import org.kuali.rice.krad.uif.component.Component;
import org.kuali.rice.krad.uif.container.Group;
import org.kuali.rice.krad.uif.view.View;

import java.util.List;

/**
 * Group who items are rendered as a book page using the booklet widget
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
public class BookGroup extends Group {
    private static final long serialVersionUID = 1221393415042482671L;

    private Booklet booklet;

    public BookGroup() {
        super();
    }

    @Override
    public void performFinalize(View view, Object model, Component parent) {
        super.performFinalize(view, model, parent);

        // add CSS selectors for booklet plugin
        getLayoutManager().getCssClasses().add("b-load");

        for (Component component : getItems()) {
            component.getCssClasses().add("b-loadPage");
        }

        String script = "jQuery('#" + getId() + "').booklet(" + booklet.getTemplateOptionsJSString() + ");";
        setOnDocumentReadyScript(script);
    }

    @Override
    public List<Component> getComponentsForLifecycle() {
        List<Component> components = super.getComponentsForLifecycle();

        components.add(booklet);

        return components;
    }

    public Booklet getBooklet() {
        return booklet;
    }

    public void setBooklet(Booklet booklet) {
        this.booklet = booklet;
    }
    
	@Override
	protected <T> void copyProperties(T component) {
		super.copyProperties(component);
		
		BookGroup bookGroup = (BookGroup) component;
		
		bookGroup.setBooklet((Booklet) this.booklet.copy()); 
	}
}
