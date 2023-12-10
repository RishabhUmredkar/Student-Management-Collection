import java.util.Scanner;

class A
{int a,n,i;
	String Name,correct;
	A st[];
	int choice,Roll;
    double maths,science,english,percentage;
    Scanner p=new Scanner(System.in);
     public void setRoll(int r) {
		Roll= r;
	}
	public int getRoll() {
		return Roll;
	}
	public void setName(String na) {
		Name = na;
	}
public String getName() {
		return Name;
	}
	public void setMaths(double ma) {
		maths = ma;
	}
	public double getMaths() {
		return maths;
	}
	public void setScience(double sc) {
		science = sc;
	}
	public double getScience() {
		return science;
	}
	public void setEnglish(double en) {
		english = en;
	}
	public double getEnglish() {
		return english;
	}
	public void setPercentage(double pe) {
		percentage = pe;
	}
	public double getPercentage() {
		return percentage;
	}
		void insert()
		{
			int roll;
		    double Math,Sci,Eng,per;
		    System.out.println("Enter Number Of Students :");
			n=Integer.parseInt(p.nextLine());
			st=new A[n]; 
			for(i=0;i<st.length;i++)
			{
				st[i]=new A();
				//if(st[i].Roll == 0) 
				//{
				System.out.println("Student "+(i+1));
				System.out.print("Enter Roll Number :");
				roll=Integer.parseInt(p.nextLine());
				System.out.print("Enter Student Name :");
				Name=p.nextLine();
				System.out.println("Enter Maths marks :");
				Math=Double.parseDouble(p.nextLine());
				System.out.println("Enter Science marks :");
				Sci=Double.parseDouble(p.nextLine());
				System.out.println("Enter English marks :");
				Eng=Double.parseDouble(p.nextLine());
				per=((Math+Eng+Sci)/300)*100;
				
				st[i].setRoll(roll);
				st[i].setName(Name);
				st[i].setMaths(Math);
				st[i].setScience(Sci);
				st[i].setEnglish(Eng);
				st[i].setPercentage(per);
				//}
				
			}list();}
		
		void show()
		{System.out.println("----------::ALL STUDENTS RECORD::-----------");
		System.out.println("Roll no"+"\t\tNAME"+ "\t\tMaths"+"\t\tScience"+"\t\tEnglish"+"\t\tPercentage");
		for(i=0;i<st.length;i++)
		{
			System.out.println(st[i].getRoll()+"\t\t"+st[i].getName()+"\t\t"+st[i].getMaths()+"\t\t"+st[i].getScience()+"\t\t"+st[i].getEnglish()+"\t\t"+st[i].getPercentage()+"%");
		
		}
		list();
			
		}
		void update()
		{
			int rollnew,ch,z=0;
			String newName=null;
	        double maths1,scie1,eng1,perc;
	        
	        
	        System.out.print("Enter Your Roll no:");
	        rollnew=Integer.parseInt(p.nextLine());
	        for(i=0;i<st.length;i++)
	        {
	        	if(rollnew==st[i].getRoll())
	        	{
	        		System.out.println("\tRoll no"+"\t\tNAME"+ "\t\tMaths"+"\t\tScience"+"\t\tEnglish"+"\t\tPercentage");
	        		System.out.println("\t"+st[i].getRoll()+"\t\t"+st[i].getName()+"\t\t"+st[i].getMaths()+"\t\t"+st[i].getScience()+"\t\t"+st[i].getEnglish()+"\t\t"+st[i].getPercentage());

	        		System.out.println("=================================================================");
	        		System.out.println("ok....What You Want To Update.");
	        		System.out.println("1.Name \n 2.Maths \n 3.Science \n 4.English");
	        		System.out.print("Enter The Choice :");
	        		 
	        		choice=Integer.parseInt(p.nextLine());
	        		switch(choice) {
	        		
	        		case 1:
	        			System.out.println("Your Old Name is :"+st[i].getName());
	        			System.out.println("What is your Correct Name ?");
	        			newName=p.nextLine();
	        			System.out.println("Your New Name is "+newName+" And Your Old Name is "+st[i].getName()+".");
	        		break;
	        		case 2:
	        			System.out.println("Your Old Maths Marks is :"+st[i].getMaths());
	        			System.out.println("What is Your Correct Marks? ");
	        			maths1=Double.parseDouble(p.nextLine());
	        			System.out.println("Your New Maths Marks is "+maths1+"And Your old Marks is "+st[i].getMaths()+".");
	        			perc=((maths1+st[i].getScience()+st[i].getEnglish())/300)*100;
	        			System.out.println("Do you Really Want to Change?");
	        			System.out.println("1.yes \n 2.No");
	        			System.out.println("Enter Choice :");
	        			ch=Integer.parseInt(p.nextLine());
	        			 switch(ch)
	        			 {
	        			 case 1:
	        				 st[i].setMaths(maths1);
	        				 st[i].setPercentage(perc);
	        				 break;
	        			 case 2:
	        				 list();
	        				 break;
	        			 }
	        		break;
	        		
	        	case 3:
	    			System.out.println("Your Old Science Marks is :"+st[i].getScience());
	    			System.out.println("What is Your Correct Marks? ");
	    			scie1=Double.parseDouble(p.nextLine());
	    			System.out.println("Your New Science Marks is "+scie1+"And Your old Marks is "+st[i].getScience()+".");
	    			perc=((scie1+st[i].getMaths()+st[i].getEnglish())/300)*100;
	    			System.out.println("Do you Really Want to Change?");
	    			System.out.println("1.yes \n 2.No");
	    			System.out.println("Enter Choice :");
	    			ch=Integer.parseInt(p.nextLine());
	    			 switch(ch)
	    			 {
	    			 case 1:
	    				 st[i].setScience(scie1);
	    				 st[i].setPercentage(perc);
	    				 break;
	    			 case 2:
	    				 list();
	    				 break;
	    			 }
	    		break;

	        	case 4:
	    			System.out.println("Your Old English Marks is :"+st[i].getEnglish());
	    			System.out.println("What is Your Correct Marks? ");
	    			eng1=Double.parseDouble(p.nextLine());
	    			System.out.println("Your New English Marks is "+eng1+"And Your old Marks is "+st[i].getEnglish()+".");
	    			perc=((eng1+st[i].getMaths()+st[i].getScience())/300)*100;
	    			System.out.println("Do you Really Want to Change?");
	    			System.out.println("1.yes \n 2.No");
	    			System.out.println("Enter Choice :");
	    			ch=Integer.parseInt(p.nextLine());
	    			 switch(ch)
	    			 {
	    			 case 1:
	    				 st[i].setEnglish(eng1);
	    				 st[i].setPercentage(perc);
	    				 break;
	    			 case 2:
	    				 list();
	    				 break;
	    			 }
	    		break;
	    		}
	        		if(choice==1)
	        		{
	        		
	        			System.out.println("Do you Really Want to Change?");
	        			System.out.println("1.yes \n 2.No");
	        			System.out.println("Enter Choice :");
	        			ch=Integer.parseInt(p.nextLine());
	        			 switch(ch)
	        			 {
	        			 case 1:
	        				st[i].setName(newName);
	        				 break;
	        			case 2:
	        				 list();
	        				 break;
	        				 default:
	        					 System.out.println("Invalid option");
	        			 }
	        		}
	        		else {
	        			z++;
	        		}
	        	}
	        }
	        if(z==n)
	        {
	        	System.out.println("Sorry......invalid Roll no ");
	        	System.out.println("Please check your Roll");
	        	
	        	z=0;
	        
	        }
	        System.out.println("Ok done record updated....");
	        System.out.println("============================================================");
	        list();

		}
		void search()
		{int rollnew;
        System.out.print("Enter Your Roll no:");
        rollnew=Integer.parseInt(p.nextLine());
        for(i=0;i<st.length;i++)
        {
        	if(rollnew==st[i].getRoll())
        	{
        		System.out.println("Roll no"+"\t\tNAME"+ "\t\tMaths"+"\t\tScience"+"\t\tEnglish"+"\t\tPercentage");
        		System.out.println(st[i].getRoll()+"\t\t"+st[i].getName()+"\t\t"+st[i].getMaths()+"\t\t"+st[i].getScience()+"\t\t"+st[i].getEnglish()+"\t\t"+st[i].getPercentage());
        	}
        	
        
        else
        {System.out.println("Roll no. does not exist");}}
        list();}
        		
        		void list()
		     {
				System.out.println(":::::::List:::::::");
				System.out.println("1.Add Student");
				System.out.println("2.Show student details");
				System.out.println("3.Update information of the student");
				System.out.println("4.Search for detail");
				System.out.println("0.Exit");
				System.out.print("Enter choice :");
				a=Integer.parseInt(p.nextLine());
				switch(a)
		        {
		        case 1:
		            insert();
		            break;
		        case 2:
		      show();
		            break;
		        case 3:
		         update();  
		            break;
		        case 4:
		           search();
		            break;
		        case 0:
		           i=0;
		            break;
		        
		        default:
		        	System.out.println("Sorry..Wrong Input..! Start again.");
		        	list();}}}
public class newpro {

	public static void main(String[] args) {
		A st1=new A();
		st1.list();
	}

}
