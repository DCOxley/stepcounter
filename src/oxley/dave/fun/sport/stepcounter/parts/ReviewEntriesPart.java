package oxley.dave.fun.sport.stepcounter.parts;

import static org.eclipse.swt.events.SelectionListener.widgetSelectedAdapter;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class ReviewEntriesPart {

	private Text txtInput;
	private Button submitButton;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		DateTime calendar = new DateTime(parent, SWT.CALENDAR);
		calendar.addSelectionListener(widgetSelectedAdapter(e -> System.out.println("calendar date changed")));
		
		calendar.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_BLUE));
		
        ColoredCalendar cd = new ColoredCalendar(parent);
        cd.open(parent);
	}

}
