import java.util.Scanner;

class Codechef
{   public static int floorNo(int x){
    if(x>=1  && x<= 10){
        return 1;
    }
    else if(x>=11 && x<= 20){
       return 2;
    }
    else if(x>=21 && x<= 30){
        return 3;
    }
    else if(x>=31 && x<= 40){
        return 4;
    }
    else if(x>=41  && x<= 50){
        return 5;
    }
    else if(x>=51 && x<= 60){
       return 6;
    }
    else if(x>=61 && x<= 70){
        return 7;
    }
    else if(x>=71 && x<= 80){
        return 8;
    }
    else if(x>=81 &&x<= 90){
        return 9;
    }
    else {
        return 10;
    }
    
}
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the value of t");

		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{   
		System.out.println("Enter the value of x and y");

    		int x = read.nextInt();
    		int y = read.nextInt();
    		int chefFloor=floorNo(x);
            System.out.println("ChefFloor:"+chefFloor);
    		int chefinaFloor=floorNo(y);
            System.out.println("ChefinaFloor:"+chefinaFloor);

    		if(chefFloor>chefinaFloor){
    		    int result=chefFloor-chefinaFloor;
    		    System.out.println(result);
    		}

    		else if(chefFloor<chefinaFloor){
    		    int result=chefinaFloor-chefFloor;
    		    System.out.println(result);
    		}
            else {
                int result=chefinaFloor-chefFloor;
    		    System.out.println(result);
            }
    		
    		
		}
	}
}