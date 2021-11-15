import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class studentdata
{
protected List<Integer> id=new ArrayList<Integer>();
protected List<String> name=new ArrayList<String>();
protected List<Integer> Age=new ArrayList<Integer>();
protected List<Integer> marks=new ArrayList<Integer>();
protected List<Integer> rollno=new ArrayList<Integer>();
public static void main(String [] Arg)
{
Scanner sc=new Scanner(System.in);
student s=new student();
s.getdata();
loop:while(true)
{
System.out.println("1 --> to add student data");
System.out.println("2 --> to watch student data");
System.out.println("0 --> to exit");
int choose=sc.nextInt();
switch(choose)
{
case 0:
break loop;
case 1:
System.out.println("ID : ");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Name : ");
String name=sc.nextLine();
int age;
l1:while(true)
{
System.out.println("Age (should less than 30) ");
age=sc.nextInt();
if(age<30&&age>0)
{
break l1;
}
else
System.out.println("age restriction");
}
System.out.println("roll no. (should less than 5 digits) ");
int roll=sc.nextInt();
System.out.println("marks (should less than 1100) ");
int mark=sc.nextInt();
s.setdata(id,name,age,roll,mark);
break;
case 2:
{
s.getdata();
break;
}
default:
System.out.println("invalid option!! try again");
break;
}
}
}
}
class student extends studentdata
{
    void setdata(int id1,String n,int age,int roll,int mark)
    {
        this.id.add(id1);
        this.name.add(n);
        this.Age.add(age);  
        this.rollno.add(roll);
        this.marks.add(mark);
    }    
    void getdata()
    {
        for(int i=0;i<name.size();i++)
        {
            System.out.println("id :"+this.id.get(i)+" name : "+this.name.get(i)+" Age : "+this.Age.get(i)+" roll no : "+this.rollno.get(i)+" marks : "+this.marks.get(i));
        }
    }
}

