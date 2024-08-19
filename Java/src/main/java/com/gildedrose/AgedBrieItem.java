package com.gildedrose;

/**
 * The type Aged brie.
 */
public class AgedBrieItem implements IUpdateItem{
    private final Item item;

    /**
     * Instantiates a new Aged brie.
     *
     * @param item the item
     */
    public AgedBrieItem(Item item)  {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}
