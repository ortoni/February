public class LogicTable {
	public void main() {
		
		boolean p, q;
		System.out.println("P\tQ\tPANDQ\tPORQ\tPEXORQ\tPNOT");
		p = true; q = true;
		System.out.print(p+"\t"+q+("\t"));
		System.out.print((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		p = true; q = false;
		System.out.print(p+"\t"+q+("\t"));
		System.out.print((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		p = false; q = true;
		System.out.print(p+"\t"+q+("\t"));
		System.out.print((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		p = false; q = false;
		System.out.print(p+"\t"+q+("\t"));
		System.out.print((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		/*p = true; q = false;
		System.out.print("P\tQ\t");
		System.out.print((p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));*/
	}

}
