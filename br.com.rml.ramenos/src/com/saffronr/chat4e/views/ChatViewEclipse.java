package com.saffronr.chat4e.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import br.com.chat4e.views.ChatViewerFactory;
import br.com.chat4e.views.core.ChatViewPart;

public class ChatViewEclipse extends ViewPart {

	ChatViewPart part;

	/**
	 * The constructor.
	 */
	public ChatViewEclipse() {
		part = ChatViewerFactory.createChatViewPart();
	}

	public void createPartControl(Composite parent) {
		parent = new Composite(parent, SWT.NONE);
		parent.setLayout(new GridLayout(1, false));
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		part.createPartControl(parent);
	}

	/**
	 * Passing the focus request to the form.
	 */
	public void setFocus() {
	}

}