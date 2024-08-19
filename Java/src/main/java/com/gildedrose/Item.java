package com.gildedrose;

/**
 * The type Item.
 */
public class Item {

    /**
     * The Name.
     */
    public String name;

    /**
     * The Sell in.
     */
    public int sellIn;

    /**
     * The Quality.
     */
    public int quality;

    /**
     * Instantiates a new Item.
     *
     * @param name    the name
     * @param sellIn  the sell in
     * @param quality the quality
     */
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
