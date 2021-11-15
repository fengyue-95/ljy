package com.ljy.designmode.Bridge;

/**
 * @author fengyue
 * @date 2021/11/11
 */
public class Client {

    public static void main(String[] args) {
        HouseProduct houseProduct = new HouseProduct();

        HouseCrop houseCrop = new HouseCrop(houseProduct);
        houseCrop.makeMoney();

        IpodProduct ipodProduct = new IpodProduct();
        IpodCrop ipodCrop = new IpodCrop(ipodProduct);
        ipodCrop.makeMoney();

        new CommonCrop(new ClothesProduct()).makeMoney();

        new CommonCrop(new IpodProduct()).makeMoney();
    }
}
