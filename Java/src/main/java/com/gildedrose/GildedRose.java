package com.gildedrose;

/**
 * The type Gilded rose.
 */
class GildedRose {
    /**
     * The Items.
     */
    Item[] items;

    /**
     * Instantiates a new Gilded rose.
     *
     * @param items the items
     */
    public GildedRose(Item[] items) {
        this.items = items;
    }

    /**
     * Update quality.
     */
    public void updateQuality() {
        for (Item item : items) {
            IUpdateItem type = getItemType(item);
            type.updateQuality();
        }
    }

    private IUpdateItem getItemType(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieItem(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesItem(item);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem(item);
            default:
                if (item.name.startsWith("Conjured")) {
                    return new ConjuredItem(item);
                }
                return new DefaultItem(item);
        }
    }
}
