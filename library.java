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
		
		if(Category=='T'){//H.M.M.K Disanayaka ITT/16/17/020
			System.out .println("Technology");	
		}
		else if(Category=='B'){
			System.out .println("Biology");	
		}
		else if(Category=='A'){
			System.out .println("Art");
		}
		else if(Category=='C'){
			System.out .println("Commerce");
		}
		else{
			System.out .println("Others");	//H.M.M.K Disanayaka ITT/16/17/020
	    }
			
		}
		
}class Library{
	public static void main(String args[]){
			
			book book1=new book();//G.W.B.D.D.WEERASEKARA  ITT/16/17/087
			book book2=new book();//G.W.B.D.D.WEERASEKARA  ITT/16/17/087
			
			book1.assignData("T12345","Ict Application","D.R sanjay",2000,580,'T');//I.W.N.P Jayawardana ITT/16/17/038
			book1.display();
			book1.checkGroup();
			
			book2.assignData("C1205","The complete E=Commerce book","Janice Reynolds",1800,290,'C');// P.D. Weerasuriya  ITT/16/17/088
			book2.display();
			book2.checkGroup();
		}
	
	
}
