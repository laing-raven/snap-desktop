package org.esa.snap.gui.util;

import org.openide.windows.TopComponent;

/**
 * Represents a document window.
 *
 * This interface is usually implemented by classes derived from {@code TopComponent}. A document window is usually
 * opened from a document data or node context and keeps a reference to the document data or node.
 * <p/>
 * A single document/node type may have multiple possible document window types.
 * There can be any number of document window instances for a single document/node. If a document is closed,
 * associated document windows will be closed as well.
 * <p/>
 * Only none or a single document window can be selected at a given time. Note that the selection of document windows
 * is independent from the activation of non-document {@code TopComponent} windows. But if a {@code TopComponent}
 * implementing the {@code DocumentWindow} interface is activated, it will always also be the
 * {@link #isSelected() selected} one.
 *
 * @author Norman Fomferra
 */
public interface DocumentWindow<T> extends NotifiableComponent {
    /**
     * @return The associated document data or node.
     */
    T getDocument();

    /**
     * @return The {@code TopComponent} for this window.
     */
    TopComponent getTopComponent();

    /**
     * @return {@code true} if this is window is selected.
     */
    boolean isSelected();

    /**
     * Requests that this document window shall be the only selected one. If it succeeds it will cause any previously
     * selected document window to become deselected.
     */
    void requestSelected();

    /**
     * Called when this component was selected.
     */
    void componentSelected();

    /**
     * Called when this component was deselected.
     */
    void componentDeselected();
}