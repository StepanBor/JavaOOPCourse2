package pack1;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	String[] checkArgs;
	
	public MyFileFilter(String... checkArgs) {
		super();
		this.checkArgs = checkArgs;
	}

	public boolean check(String arg) {
		for (String str : checkArgs) {
			if (str.equals(arg)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {

		int pointIndex = pathname.getName().lastIndexOf('.');

		if (pointIndex == -1) {
			return false;
		}

		String fileExt = pathname.getName().substring(pointIndex + 1);

		return check(fileExt);
	}

}
