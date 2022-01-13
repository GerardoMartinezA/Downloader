package url;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String link= "https://downloads-global.3cx.com/downloads/debian10iso/debian-amd64-netinst-3cx.iso";
		String link1= "https://iweb.dl.sourceforge.net/project/reactos/ReactOS/0.4.14/ReactOS-0.4.14-iso.zip";
		File out = new File("C:\\Users\\a839591\\Desktop\\Debian.iso");
		File out1 = new File("C:\\Users\\a839591\\Desktop\\Reactos.zip");
		new Thread(new Download(link, out)).start();
		new Thread(new Download(link1, out1)).start();
	}
}
