package generics.util;

import generics.cake.Cake;
import generics.cake.ChocolateCake;
import generics.cake.StuffedChocolateCake;
import generics.cake.VanillaCake;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SwapUtilTest {
    @Test
    public void swapOfChocolateCakes() throws Exception {
        ChocolateCake[] arr  = new ChocolateCake[]{new ChocolateCake(1), new ChocolateCake(3)};

        assertThat(SwapUtil.swapElements(arr, 0, 1)).containsExactly(new ChocolateCake(3), new ChocolateCake(1));
    }

    @Test
    public void swapOfChocolateCakeAndSufferedChocolateCake() throws Exception {
        ChocolateCake[] arr  = new ChocolateCake[]{new ChocolateCake(1), new StuffedChocolateCake(3)};

        ChocolateCake[] swappedArr = SwapUtil.swapElements(arr, 0, 1);

        assertThat(swappedArr).containsExactly(new StuffedChocolateCake(3), new ChocolateCake(1));
    }

    @Test
    public void swapOfChocolateCakeAndSufferedChocolateCake2() throws Exception {
        Cake[] arr  = new Cake[]{new ChocolateCake(1), new StuffedChocolateCake(3)};

        Cake[] swappedArr = SwapUtil.swapElements(arr, 0, 1);

        assertThat(swappedArr).containsExactly(new StuffedChocolateCake(3), new ChocolateCake(1));
    }

    @Test
    public void swapOfChocolateCakeAndSufferedChocolateCakeAndVanillaCakes() throws Exception {
        Cake[] arr  = new Cake[]{new ChocolateCake(1), new StuffedChocolateCake(3), new VanillaCake(5)};

        Cake[] swappedArr = SwapUtil.swapElements(arr, 0, 1);
        assertThat(swappedArr).containsExactly(new StuffedChocolateCake(3), new ChocolateCake(1), new VanillaCake(5));

        swappedArr = SwapUtil.swapElements(arr, 1, 2);
        assertThat(swappedArr).containsExactly(new ChocolateCake(1), new VanillaCake(5), new StuffedChocolateCake(3));
    }

    // for List

    @Test
    public void swapOfChocolateCakesForList() throws Exception {
        List<ChocolateCake> list  = Arrays.asList(new ChocolateCake[]{new ChocolateCake(1), new ChocolateCake(3)});

        assertThat(SwapUtil.swapElementsForList(list, 0, 1)).containsExactly(new ChocolateCake(3), new ChocolateCake(1));
    }

    @Test
    public void swapOfChocolateCakeAndSufferedChocolateCakeForList() throws Exception {
        List<ChocolateCake> list  = Arrays.asList(new ChocolateCake[]{new ChocolateCake(1), new StuffedChocolateCake(3)});

        List<ChocolateCake> swappedList = SwapUtil.swapElementsForList(list, 0, 1);

        assertThat(swappedList).containsExactly(new StuffedChocolateCake(3), new ChocolateCake(1));
    }

    @Test
    public void swapOfChocolateCakeAndSufferedChocolateCake2ForList() throws Exception {
        List<Cake> list  = Arrays.asList(new Cake[]{new ChocolateCake(1), new StuffedChocolateCake(3)});

        List<Cake> swappedList = SwapUtil.swapElementsForList(list, 0, 1);

        assertThat(swappedList).containsExactly(new StuffedChocolateCake(3), new ChocolateCake(1));
    }

    @Test
    public void swapOfChocolateCakeAndSufferedChocolateCakeAndVanillaCakesForList() throws Exception {
        List<Cake> list  = Arrays.asList(new Cake[]{new ChocolateCake(1), new StuffedChocolateCake(3), new VanillaCake(5)});

        List<Cake> swappedList = SwapUtil.swapElementsForList(list, 0, 1);
        assertThat(swappedList).containsExactly(new StuffedChocolateCake(3), new ChocolateCake(1), new VanillaCake(5));

        swappedList = SwapUtil.swapElementsForList(list, 1, 2);
        assertThat(swappedList).containsExactly(new ChocolateCake(1), new VanillaCake(5), new StuffedChocolateCake(3));
    }

}
