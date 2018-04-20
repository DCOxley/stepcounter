package oxley.dave.fun.sport.stepcounter.parts;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import static org.eclipse.swt.events.SelectionListener.*;

public class SubmitNewEntryPart {

	private Text txtInput;
	private Button submitButton;
	
	@Inject
	private MDirtyable dirty;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		DateTime calendarDropDown = new DateTime(parent, SWT.DROP_DOWN);
		 calendarDropDown.addSelectionListener (
		 widgetSelectedAdapter(e -> System.out.println ("calendar date changed via drop-down")));
		 
		txtInput = new Text(parent, SWT.SINGLE);
		submitButton = new Button(parent, SWT.PUSH);
		submitButton.setText("Submit Steps");
		submitButton.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				System.out.println("Button pressed "+txtInput.getText());
				
			}
		});
	}

	@Focus
	public void setFocus() {
		//tableViewer.getTable().setFocus();
	}

	@Persist
	public void save() {
		dirty.setDirty(false);
	}

	private List<String> createInitialDataModel() {
		return Arrays.asList("Sample item 1", "Sample item 2", "Sample item 3", "Sample item 4", "Sample item 5");
	}
}