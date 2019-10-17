class book{
     String BId,Bname,Author;
	 double price;
	 int No_of_pages;
	 char Category;
	 
	 public void assignData(String BId,String Bname,String Author,double price,int No_of_pages,char Category){
		 
 		 this.BId=BId;
		 this.Bname= Bname;
		 this.Author=Author;
		 this.price=price;
		 this.No_of_pages=No_of_pages;
		 this.Category=Category;
		 
	 }
    public void display(){
		System.out.println("book id :"+BId+"\nbook name :"+Bname+"\nbook autor"+Author+"\nbook price"+price+"\n book pages"+No_of_pages+Category);
	}
    public void checkGroup(){
		
		if(Category=='B'){
			System.out .println("Biology");	
		}
		else if(Category=='M'){
			System.out .println("Mathematics");	
		}
		else if(Category=='C'){
			System.out .println("Commerce");
		}
		else if(Category=='A'){
			System.out .println("Arts");
		}
		else{
			System.out .println("Others");	
	    }
			
		}
		
}class Library{
	public static void main(String args[]){
			
			Library book1=new Library();
			Library book2=new Library();
			
			book1.assignData("M12534","The Principals of Mathematics","Bertand Russel",2500,576,'M');
			book1.display();
			book1.checkGroup();
			
			book2.assignData("O8934","Many Gina","Mansions Cerminana",2000,304,'O');
			book2.display();
			book2.checkGroup();
		}
	
	
}