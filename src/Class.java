public class Class {
    private int number;
    private String string;
    private int[] list;

    public Class(){}
    public Class(int number,String string,int[] list){
        this.number=number;
        this.string=string;
        this.list=list;
    }

    public Class(int number ,int[] list){
        this.number=number;
        this.list = list;
    }

    public Class(String string, int[] list){
        this.string=string;
        this.list=list;
    }

    void setNumber(int number){this.number=number;}
    void setString(String string){this.string=string;}
    void setList(int[] list){this.list=list;}

    int getNumber(){return number;}
    String getString(){return string;}
    int[] getList(){return list;}
}
