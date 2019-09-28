package generics.util;

import generics.cake.Cake;
import generics.cake.ChocolateCake;
import generics.cake.StuffedChocolateCake;
import generics.cake.VanillaCake;

import java.util.ArrayList;
import java.util.List;

public class UnionUtil {
    static public <E> List<E> union(List<? extends E> firstList, List<? extends E> secondList){
        List<E> unionList = new ArrayList<>();

        unionList.addAll(firstList);
        unionList.addAll(secondList);

        return unionList;
    }
}
