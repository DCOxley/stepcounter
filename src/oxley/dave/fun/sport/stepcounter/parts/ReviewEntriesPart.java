package oxley.dave.fun.sport.stepcounter.parts;

import static org.eclipse.swt.events.SelectionListener.widgetSelectedAdapter;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class ReviewEntriesPart {

	private Text txtInput;
	private Button submitButton;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		DateTime calendarDropDown = new DateTime(parent, SWT.DROP_DOWN);
		calendarDropDown.addSelectionListener(
				widgetSelectedAdapter(e -> System.out.println("calendar date changed via drop-down")));

		txtInput = new Text(parent, SWT.SINGLE);
		submitButton = new Button(parent, SWT.PUSH);
		submitButton.setText("Submit Steps");
		submitButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event arg0) {
				System.out.println("Button pressed " + txtInput.getText());

			}
		});
	}

}
