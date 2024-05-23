package unlocktofuture;

public class Lock {

	private String lockModel;
	private int codeLength;
	private int[] code;
	private String lockState;
	public String getLockModel() {
		return lockModel;
	}
	public void setLockModel(String lockModel) {
		this.lockModel = lockModel;
	}
	public int getCodeLength() {
		return codeLength;
	}
	public Lock(String lockModel, int codeLength, int[] code, String lockState) {
		super();
		this.lockModel = lockModel;
		this.codeLength = codeLength;
		this.code = code;
		this.lockState = lockState;
	}
	public void setCodeLength(int codeLength) {
		this.codeLength = codeLength;
	}
	public int[] getCode() {
		return code;
	}
	public void setCode(int[] code) {
		this.code = code;
	}
	public String getLockState() {
		return lockState;
	}
	public void setLockState(String lockState) {
		this.lockState = lockState;
	}
	
	public String enterCodeToUnLock(int[] codeAttempts) {
		
		
		if(codeLength>=1) {
			if(lockState.equalsIgnoreCase("Unlocked")) {
				return "Lock is already unlocked.";
			}
			else {
				boolean b = true;
				for(int i=0;i<codeAttempts.length;i++) {
					
						if(codeAttempts[i]!= code[i]) {
							b=false;
						}
					
				}
				
				if(b==true) {
					lockState ="Unlocked";
					return "Code correct. Lock is now unlocked.";
				}
				else {
					return "Incorrect code. Please try again.";
				}
			}
		}
		return null;
	}
}
