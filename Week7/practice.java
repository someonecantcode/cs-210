class Parent {
    int num = 1;
    
    public void output(){

    }
}

class Child extends Parent {
    int num = 5;
    
    @Override
    public void output(){
        System.out.println(super.num);
        System.out.println(this.num);
    }
}

