package oxley.dave.fun.sport.stepcounter.parts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import oxley.dave.fun.sport.stepcounter.StepcounterFactory;
import oxley.dave.fun.sport.stepcounter.api.Cycle;
import oxley.dave.fun.sport.stepcounter.api.Day;
import oxley.dave.fun.sport.stepcounter.mycode.impl.EntryAdder;

public class SubmitNewEntryPart {

	private Text txtInput;
	private Button submitButton;
	private EntryAdder adder;
	private Day day;
	private Date date;

	@Inject
	private MDirtyable dirty;

	@PostConstruct
	public void createComposite(Composite parent) throws InvalidEntryException {
		parent.setLayout(new GridLayout(1, false));
		day = StepcounterFactory.eINSTANCE.createDay();
		Cycle cycle = StepcounterFactory.eINSTANCE.createCycle();
		adder = new EntryAdder(cycle);
		DateTime calendarDropDown = new DateTime(parent, SWT.DROP_DOWN);
		calendarDropDown.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				System.out.println("calendar date changed" + calendarDropDown.getDay());
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String dateAsString = calendarDropDown.getDay() + "/" + calendarDropDown.getMonth() + "/"
						+ calendarDropDown.getYear();
				try {
					date = dateFormat.parse(dateAsString);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// date.set
			}
		});
		txtInput = new Text(parent, SWT.SINGLE);
		submitButton = new Button(parent, SWT.PUSH);
		submitButton.setText("Submit Steps");
		submitButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event arg0) {

				if (date == null) {
					try {
						throw new InvalidEntryException("No Date. Please set a Date");
					} catch (InvalidEntryException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				String numberOfSteps = txtInput.getText();
				if (numberOfSteps.equals("")) {
					System.out.println("no steps");
					try {
						throw new Exception("No steps. Please set number of steps");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Button pressed " + numberOfSteps);
				adder.add();
				//adder.add(Integer.valueOf(numberOfSteps), date);

			}
		});
	}

	@Focus
	public void setFocus() {
		// tableViewer.getTable().setFocus();
	}

	@Persist
	public void save() {
		dirty.setDirty(false);
	}

	private List<String> createInitialDataModel() {
		return Arrays.asList("Sample item 1", "Sample item 2", "Sample item 3", "Sample item 4", "Sample item 5");
	}
}