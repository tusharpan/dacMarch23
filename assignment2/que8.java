import java.util.Scanner;
 class que8 {
    int num1 , deno1 ,num2,deno2;

    public void printmenu(){
        System.out.println("ENTER CHOICE"); 
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
    }
    public void reduceForm(int newdeno ,int newnum){
        int temp = Math.min(newdeno,newnum);
        int flag=0;
        for(int i =2 ;i<=temp;i++){
            if((newdeno%i==0)&&(newnum%i==0)){
                newdeno/=i;
                newnum/=i;
                flag=1;
                break;
            }
           
            
        }
        if(flag==1){
          reduceForm(newdeno, newnum);
          
        }
        else{
            System.out.println(newnum +"/"+ newdeno);
        }
        
    }
    public void getData(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter the numerator of the first number");
       this.num1=sc.nextInt();
        System.out.println("enter the demomenator of the first number");
        this.deno1=sc.nextInt();
        System.out.println("enter the numerator of the second number");
        this.num2=sc.nextInt();
        System.out.println("enter the denomenator of the second number");
        this.deno2=sc.nextInt();
    }
    public void add(){
        int newdeno = this.deno1*this.deno2;
        int newnum = ((this.deno2*this.num1)+(this.deno1*this.num2));
        int temp = Math.min(newdeno,newnum);
       
        System.out.print(this.num1+"/"+this.deno1+"+"+this.num2+"/"+this.deno2+" is "); 
        reduceForm(newdeno, newnum) ;

        
        }

        public void substract( ){
            int newdeno = this.deno1*this.deno2;
            int newnum = ((this.deno2*this.num1)-(this.deno1*this.num2));
            int temp = Math.min(newdeno,newnum);
            
            System.out.print(this.num1+"/"+this.deno1+"-"+this.num2+"/"+this.deno2+" is ");
            reduceForm(newdeno, newnum) ;
            
    
            
            }
        
           
            public void mult(){
                int newdeno = this.deno1*this.deno2;
                int newnum = this.num1*this.num2;
                int temp = Math.min(newdeno,newnum);
                
                System.out.print(this.num1+"/"+this.deno1+"*"+this.num2+"/"+this.deno2+" is ");
                reduceForm(newdeno, newnum) ;
        
                
                }
                public void div(){
                    int newdeno = this.num1*this.deno2;
                    int newnum = this.deno1*this.num2;
                    int temp = Math.min(newdeno,newnum);
                    
                    System.out.print(this.num1+"/"+this.deno1+"/"+this.num2+"/"+this.deno2+" is ");
                    reduceForm(newdeno, newnum) ;
            
                    
                    }


    public static void main(String[] args) {
        char choice;
        que8 obj = new que8();
        obj.printmenu();
        Scanner sc= new Scanner(System.in);
        String temp = sc.next();
        choice = temp.charAt(0);
        obj.getData();
        switch(choice){
            case '+' : obj.add();
            break;
            case '-' : obj.substract();
            break;
            case '*' : obj.mult();
            break;
            case '/'  : obj.div();
            break;
        }
        
    }
}
