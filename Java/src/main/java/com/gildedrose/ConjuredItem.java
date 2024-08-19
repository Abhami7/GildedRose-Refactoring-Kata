package com.gildedrose;

/**
 * The type Conjured.
 */
public class ConjuredItem implements IUpdateItem {
    private final Item item;

    /**
     * Instantiates a new Conjured.
     *
     * @param item the item
     */
    public ConjuredItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.quality > 0) {
            item.quality -= 2;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality -= 2;
        }
        // Prevents quality from becoming negative
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
