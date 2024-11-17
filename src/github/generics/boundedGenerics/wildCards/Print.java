package github.generics.boundedGenerics.wildCards;

import java.util.List;

public class Print {

    public void setPrintValues(List<? super Vehicle> vehicleList){

    }


    public void computeList(List<? extends Number> source, List<? extends Number> destination){

    }

    public <T extends Number> void computeList1(List<T> source, List<T> destination){

    }
}
