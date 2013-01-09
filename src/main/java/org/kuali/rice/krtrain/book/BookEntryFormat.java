package org.kuali.rice.krtrain.book;

import java.io.Serializable;

/**
 * Holds format configuration for a book entry view request
 *
 * @author KRAD Training
 */
public class BookEntryFormat implements Serializable {
    private static final long serialVersionUID = -3011032572790104856L;

    private int summaryRows;
    private boolean hideRatings;
    private boolean readOnlyView;

    public BookEntryFormat() {
        summaryRows = 8;
    }

    public int getSummaryRows() {
        return summaryRows;
    }

    public void setSummaryRows(int summaryRows) {
        this.summaryRows = summaryRows;
    }

    public boolean isHideRatings() {
        return hideRatings;
    }

    public void setHideRatings(boolean hideRatings) {
        this.hideRatings = hideRatings;
    }

    public boolean isReadOnlyView() {
        return readOnlyView;
    }

    public void setReadOnlyView(boolean readOnlyView) {
        this.readOnlyView = readOnlyView;
    }
}
