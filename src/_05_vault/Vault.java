package _05_vault;

public class Vault {
	int secretCode;
	Vault(int s){
		this.secretCode=s;
	}
	boolean tryCode(int num) {
		if(num==secretCode) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
class JamesBond{
	int FindCode(Vault v) {
		for(int i=0;i<1000000;i++) {
			if(v.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
