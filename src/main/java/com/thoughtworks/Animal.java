package com.thoughtworks;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Animal {
    /**
     * Get name of animal.
     * @return {@link String}
     */
    abstract String getName();

    /**
     * Get no of legs of animal.
     * @return {@link Integer}
     */
    abstract int getNoOfLegs();

    public static Builder builder() {
        return new AutoValue_Animal.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        /**
         * Set name of Animal.
         */
        abstract Builder setName(String name);

        /**
         * Set no. of legs of Animal.
         */
        abstract Builder setNoOfLegs(int noOfLegs);

        /**
         * Get builder of {@link Builder}
         * @return {@link Builder}
         */
        abstract Animal build();

    }
}
