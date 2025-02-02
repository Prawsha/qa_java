package org.example;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestForCat {

    @Mock
    Feline feline = new Feline();

    Cat cat = new Cat(feline);

    @Test
    public void getSoundSuccess() throws Exception {
        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodSuccess() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
