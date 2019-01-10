Runtime.getRuntime().exec("mysql -u username -ppassword database_name  FILE.sql")



public static boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) { 
 
	String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName,"-e", " source "+source};  
	Process runtimeProcess;  
	
	try {  
		runtimeProcess = Runtime.getRuntime().exec(executeCmd);  
		int processComplete = runtimeProcess.waitFor();  
		if (processComplete == 0) {  
			System.out.println("Backup restored successfully");  
			return true;  
	}  
	
	} 
	else {  
		 System.out.println("Could not restore the backup");  
		   }  
			} catch (Exception ex) {  
				ex.printStackTrace();  
			}  
			return false;  
	}