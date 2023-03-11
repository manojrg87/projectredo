class Students
 {
     public String name;
     public String course;
     public int roll_no;
     public int mm1, mm2, mm3;
     public int total()
     {
         return  mm1 + mm2 + mm3;
     }
     public int average()
     {
         return  total() / 3;
     }
     char grade()
     {
         if (average ()> 75)
             return 'a';
         else
             return 'b';
     }
     public String Details()
    {
        return "roll_no:"+roll_no+"\n"+"name:"+name+"\n"+"course:"+course+"\n";
    }
}
class ClassStudent
{
        public static void main(String args[])
        {
            Students sas = new Students();

            sas.roll_no=12323;
            sas.name="sita";
            sas.course="BE";
            sas.mm1=90;
            sas.mm2=98;
            sas.mm3=100;
            System.out.println("total:"+sas.total());
            System.out.println("average:"+sas.average());
            System.out.println(sas.grade());
            System.out.println(sas.Details());
        }
    }



