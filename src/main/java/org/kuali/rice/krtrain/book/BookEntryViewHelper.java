package org.kuali.rice.krtrain.book;

import org.kuali.rice.krad.uif.element.Link;
import org.kuali.rice.krad.uif.service.impl.ViewHelperServiceImpl;
import org.kuali.rice.krad.uif.view.ViewModel;

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
}
