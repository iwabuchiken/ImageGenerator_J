package ig.main;

import ig.gui.GuiBuilder;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class Main {

	protected Shell shlSwtApplication;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSwtApplication.open();
		shlSwtApplication.layout();
		while (!shlSwtApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void 
	createContents() {
		shlSwtApplication = new Shell();
		shlSwtApplication.setSize(577, 491);
		shlSwtApplication.setText("ImageGenerator");

		GuiBuilder.createContents__Buttons(shlSwtApplication);
		GuiBuilder.createContents__Menues(shlSwtApplication);
		
//		_createContents__Buttons();
		
		
//		_createContents__Menues();

	}//createContents()
/*
	private void 
	_createContents__Buttons() {
		// TODO Auto-generated method stub
		Button btnQuit = new Button(shlSwtApplication, SWT.NONE);
		btnQuit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnQuit.setBounds(395, 357, 115, 37);
		btnQuit.setText("Quit");

//		_createContents__Buttons_Execute();
		Button btnExecute = new Button(shlSwtApplication, SWT.NONE);
		btnExecute.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnExecute.setBounds(395, 278, 115, 37);
		btnExecute.setText("Execute");
		
	}//_createContents__Buttons()
	*/

	private void 
	_createContents__Menues() {
		// TODO Auto-generated method stub
		Menu menu = new Menu(shlSwtApplication, SWT.BAR);
		shlSwtApplication.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_3 = new Menu(mntmFile);
		mntmFile.setMenu(menu_3);
		
		MenuItem mntmQuit_1 = new MenuItem(menu_3, SWT.NONE);
		mntmQuit_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				System.exit(0);
				
			}
		});
		mntmQuit_1.setText("Quit");
		
		MenuItem mntmOthers = new MenuItem(menu, SWT.CASCADE);
		mntmOthers.setText("Others");
		
		Menu menu_2 = new Menu(mntmOthers);
		mntmOthers.setMenu(menu_2);
		
		MenuItem mntmQuit = new MenuItem(menu_2, SWT.NONE);
		mntmQuit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				System.exit(0);
				
			}
		});
		mntmQuit.setText("Quit");
		
		Menu menu_1 = new Menu(shlSwtApplication);
		shlSwtApplication.setMenu(menu_1);
		
	}//_createContents_Menues()
	
}
