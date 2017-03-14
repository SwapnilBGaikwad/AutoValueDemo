package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AnimalTest {
    @Test
    public void testShouldReturnDogAnimalObject() {
        final Animal dog1 = Animal.builder()
                .setName( "Dog" )
                .setNoOfLegs( 4 )
                .build();

        final Animal dog2 = Animal.builder()
                .setName( "Dog" )
                .setNoOfLegs( 4 )
                .build();

        Assert.assertThat( dog1 , is( equalTo(dog2) ) );
    }
}