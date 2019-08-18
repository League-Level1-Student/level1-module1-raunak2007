package _05_vault;

public class VaultRunner{
	public static void main(String[] args) {
		Vault v=new Vault(89385);
		JamesBond j=new JamesBond();
		System.out.println(j.FindCode(v));
	}
}
