package net.behoo.appmarket.downloadinstall;

public class Constants {
	
	public static final String ACTION_STATE = "net.behoo.appmarket.downloadinstall.DownloadAndInstall";
	
	public static final String PACKAGE_STATE = "package_state";
	public static final String PACKAGE_CODE = "pkg_uri";
	
	public enum PackageState {
		unknown, 			
		downloading, 
		download_failed, 	download_succeeded,
		installing, 
		install_failed, 	install_succeeded,
		uninstalled,		need_update,
	}
}