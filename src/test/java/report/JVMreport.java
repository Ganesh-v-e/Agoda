package report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

	public static void generatrJvmReport(String jsonfile) {

		File f = new File(System.getProperty("user.dir") + "\\target\\reports\\JVMreport");

		Configuration con = new Configuration(f, "AgodaTesting");
		con.addClassifications("Platform", "Windows 11");
		con.addClassifications("Browser", "Google Chrome");
		con.addClassifications("Domain", "Travel");

		List<String> li = new ArrayList<String>();
		
		li.add(jsonfile);
		
		
		ReportBuilder r = new ReportBuilder(li, con);
		
		r.generateReports();  

	}

}
