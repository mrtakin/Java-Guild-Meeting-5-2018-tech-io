package generics.util;

import generics.cake.Cake;
import generics.cake.ChocolateCake;
import generics.cake.StuffedChocolateCake;
import generics.cake.VanillaCake;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

public class SwapUtil {

    public static <T> T[] swapElements(T[] array, int firstIndex, int secondIndex) {
        @SuppressWarnings("unchecked")

        T[] copyOfArray = ((Object) array.getClass() == (Object) Object[].class)
            ? (T[]) new Object[array.length]
            : (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);

        System.arraycopy(array, 0, copyOfArray, 0, array.length);

        copyOfArray[firstIndex] = array[secondIndex];
        copyOfArray[secondIndex] = array[firstIndex];

        return copyOfArray;
    }

    public static <T> List<T> swapElementsForList(List<T> list, int firstIndex, int secondIndex) {
        List<T> copyOfList = new ArrayList<>(list);

        copyOfList.set(firstIndex, list.get(secondIndex));
        copyOfList.set(secondIndex, list.get(firstIndex));

        return copyOfList;
    }
}
