package github.generics.boundedGenerics.multiBound;

public class Print <T extends ParentClass & Interface1 & Interface2>{

    T value;

    public T getPrintValue() {
        return value;
    }

    public void setPrintValue(T value){
        this.value = value;
    }
}
