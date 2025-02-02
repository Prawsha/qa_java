package org.example;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestsForFeline {

    @Spy
    Feline feline = new Feline();

    @Test
    public void eatMeatSuccess() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilySuccess() throws Exception {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParams() throws Exception {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParams() throws Exception {
        Assert.assertEquals(5, feline.getKittens(5));
    }
}
