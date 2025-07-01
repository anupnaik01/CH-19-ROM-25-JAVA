class SuperMarket {
    public static void main(String[] args) {
        String iceCreams[] = {
            "Vanilla", "Chocolate", "Strawberry", "Chocolate Chip", "Mint",
            "Mango", "Butterscotch", "Pista", "Rocky Road", "Coffee"
        };

        String perfumes[] = {
            "Chanel No. 5", "Dior Sauvage", "Versace Eros", "Gucci Bloom", "Tom Ford Noir",
            "CK One", "Armani Code", "YSL Libre", "Burberry Her", "1 Million"
        };

        String groceries[] = {
            "Rice", "Wheat Flour", "Sugar", "Salt", "Cooking Oil",
            "Lentils", "Tea", "Spices", "Milk", "Vegetables"
        };

        String cosmetics[] = {
            "Foundation", "Concealer", "Lipstick", "Eyeliner", "Mascara",
            "Blush", "Compact Powder", "Primer", "Highlighter", "Makeup Remover"
        };

        System.out.println("Ice Creams:");
        for (String ice : iceCreams) {
            System.out.println(ice);
        }

        System.out.println("\nPerfumes:");
        for (String perfume : perfumes) {
            System.out.println(perfume);
        }

        System.out.println("\nGroceries:");
        for (String item : groceries) {
            System.out.println(item);
        }

        System.out.println("\nCosmetics:");
        for (String cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
    }
}
