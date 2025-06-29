//Name: safiya abdi rahmaan
//ID:C6230068
//Class:Cns231

import java.util.Date;
import java.util.Scanner;

public class EVC_plus{
    static Scanner input = new Scanner(System.in);
    static Date currenDateAndTime = new Date();
    static int haraa = 3000;
    static double money;
    static int opp, phone;
    static int password = 2288;

    public static void main(String[] args) {
        System.out.print("Geli *770# : ");
        String n = input.nextLine();
        if (n.equals("*770#")) {
            System.out.println("fadlan gali PIN-kaaga");
            int pass = input.nextInt();
            if (pass == password) {
                EVC_pls();
            } else {
                System.out.println("pinkaaga waa qalad");
            }
        }
    }
    //----start evc_plus
    static void EVC_pls() {
        String[] EVC_pls = {
                "1.itus Haraagaga",
                "2.Kaarka hadalka",
                "3.Bixi bill",
                "4.U wareeji EVCplus",
                "5.Warbixin kooban",
                "6.Salam bank",
                "7.Maareynta",
                "8.Bill payment"
        };
        System.out.println("EVPLus");
        for (String item : EVC_pls) {
            System.out.println(item);
        }
        int option = input.nextInt();
        chooseOption(option);

    }
//---list of Evc_plus
    static void chooseOption(int option) {
        switch (option) {
            case 1:
                System.out.println("haraagaga waa " + haraa + "$");
                break;
            case 2:
                kaarkaHadalka();

                break;
            case 3:
                bixiBill();
                break;
            case 4:
                uWareejiEVCplus();
                break;
            case 5:
                warbixinKooban();
                break;
            case 6:
//                salaamBank();
                break;
            case 7:
                maareynta();
                break;
            case 8:
                System.out.println("Bill payment not implemented yet.");
                break;
            default:
                System.out.println("fadlan doora numberka saxda ah");
        }
    }
    // ----kaarka hadalka
    static void kaarkaHadalka() {
        String[] options = {
                "1.ku shuba Airtime",
                "2.ugu dhub airtime",
                "3.mIFI Packages",
                "4.ku shuba internet",
                "5.ugu shub qof kle (MMT)"
        };

        for (String item : options) {
            System.out.println(item);
        }
        int op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println("fadlan geli lacagta");
                money = input.nextDouble();
                System.out.println("ma hubtaa inaa $" + money + "ugu shubtid? ");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();
                if (opp == 1) {
                    if (money > haraa)
                        System.out.println("xisaabtaada kugu ma filna");
                    else {
                        System.out.println("EVC PLUS");
                        System.out.println("waxaad ku shubatay $$" + money + "Tar:" + currenDateAndTime + ",haraagaagu waa " + ((haraa - money)) + "$");
                    }
                } else
                    System.out.println("mahadsanid");
                break;
            case 2:
                System.out.println("fadlan geli numberka");
                phone = input.nextInt();
                System.out.println("fadlan geli lacagta");
                money = input.nextDouble();
                System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "?");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();

                if (opp == 1) {

                    if (money > haraa)
                        System.out.println("xisaabtaada kugu ma filna");
                    else {
                        System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                + phone + "Tar:" + currenDateAndTime + "\n Haraagaaga waa $" + ((haraa - money)));
                    }
                } else
                    System.out.println("mahadsanid");
                break;
            case 3:
                System.out.println("-- Internet Bundle Recharge --");
                System.out.println("1. Isbuucle (Weekly)");
                System.out.println("2. Bille (Mifi)");
                System.out.println("3. Maalinle (Daily)");
                opp = input.nextInt();

                System.out.println("Fadlan dooro qiimaha u baahantahy:");
                System.out.println("1. $5 = 10GB");
                System.out.println("2. $10 = 25GB");
                opp = input.nextInt();

                if (opp == 1) {
                    money = 5;
                } else if (opp == 2) {
                    money = 10;
                } else {
                    System.out.println("Doorasho khaldan.");
                    break;
                }

                input.nextLine();

                boolean validUser = false;
                String WifiUser = "";
                String correctUser = "safa123";

                while (!validUser) {
                    System.out.print("Fadlan Gali wIFI user: ");
                    WifiUser = input.nextLine();

                    if (!WifiUser.matches("[a-zA-Z0-9]+")) {
                        System.out.println("Invalid input format (dataType).");
                    } else if (!WifiUser.equals(correctUser)) {
                        System.out.println("User-ka lama helin. Fadlan isku day mar kale.");
                    } else {
                        validUser = true;
                    }
                }

                if (validUser) {
                    if (haraa >= money) {
                        haraa -= money;
                        System.out.println("Waxaad ku shubatay $" + money + " Tar: " + currenDateAndTime + ", haraagaagu waa $" + haraa);
                    } else {
                        System.out.println("Haraagaaga kuma filna inaad ku shubto $" + money);
                    }
                }
                break;
            case 4:

                System.out.println("fadl doora numberka ku shubeyso");
                System.out.println("1.Isbuucle(weekly");
                System.out.println("2.Bille (Wifi)");
                System.out.println("3.Maalinle (Daily)");
                System.out.println("4.TIME BASED PACKAGES");
                System.out.println("5.DATA");
                opp = input.nextInt();
                System.out.println("Fadlan Gali Numberka");
                phone = input.nextInt();
                System.out.println("fadlan gali lacgta");
                money = input.nextDouble();
                System.out.println("ma hubtaa inaad $" + money + "ugu shubtid" + phone + "?");
                System.out.println("1. haa");
                System.out.println("2. maya");
                opp = input.nextInt();
                if (opp == 1) {
                    if (phone >= 610000000 && phone <= 619999999) {
                        if (money > haraa)
                            System.out.println("xisaabtaada kugu ma filna");
                        else {
                            System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                    + phone + "Tar:" + "\n Haraagaaga waa $" + ((haraa - money)));
                        }

                    } else
                        System.out.println("lambarka aad galisi ma ahan mid jiro");
                }
                break;
            case 5:
                System.out.println("fadlan geli numberka");
                phone = input.nextInt();
                System.out.println("fadlan geli lacagta");
                money = input.nextInt();
                System.out.println("ma hubtaa inaad $" + money + "ugu shubtid " + phone + "?");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();
                if (opp == 1) {

                    if (money > haraa)
                        System.out.println("xisaabtaada kugu ma filna");
                    else {
                        System.out.println("EVC PLUS \n waxaad ugu shubty $" + money + "\n lambarka "
                                + phone + "Tar:" + currenDateAndTime + "\n Haraagaaga waa $" + ((haraa - money)));
                    }

                } else
                    System.out.println("mahadsanid");
                break;
            default:
                System.out.println("fadlan doora numberka saxda ah");
        }

    }




//--------Bixi biil
    static void bixiBill() {
        System.out.println("Bixi Biil");
        System.out.println("1.Post pad");
        System.out.println("2.ku libso");
        opp = input.nextInt();
        if (opp == 1) {
            System.out.println("Post paid");
            System.out.println("1.ogow Biilka");
            System.out.println("2.Bixi Bill");
            System.out.println("3.Ka Bixi Bill");
            opp = input.nextInt();
            switch (opp) {

                case 1:
                    System.out.println("error ocurred ,please try agin");

                    break;

            case 2:

                System.out.println("fadlan geli lacagta");
                money = input.nextInt();
                System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay:$" + money + "?");
                System.out.println("1. Haa");
                System.out.println("2. Maya");
                opp = input.nextInt();
                if (opp == 1) {
                    if (money > haraa)
                        System.out.println("haraaga xisaabtaada kugu ma filana");
                    else
                        System.out.println("waxaad bixisay bill \nlacagtiissu tahay $" + money + "Tar:" + currenDateAndTime + "haraagaagu waa" + ((haraa - money)));
                } else
                    System.out.println("mahadsanid");
                break;
                case 3:
                    System.out.println("fadlan geli numberka");
                    phone = input.nextInt();
                    System.out.println("fadlan geli lacagta");
                    money = input.nextInt();
                    System.out.println("Ma Hubtaa inaad bixisid bill \n lacagtiisu tahay $" + money + "oo laga rabo tel No" + phone + " ");
                    System.out.println("1.Haa");
                    System.out.println("1.Maya");
                    opp = input.nextInt();
                    if (opp == 1) {
                        if (money > haraa)
                            System.out.println("haraaga xisaabtaada kugu ma filana");
                        else
                            System.out.println("waxaad bixisay bill lacagtiisu tahay $" + money + "oo laga rabay tel No" + phone + "Tar:" + currenDateAndTime + "haraagaagu waa" + ((haraa - money)));
                    } else
                        System.out.println("mahadsanid!");
                    break;
                default:
                    System.out.println("fadlan doora numberka sax ah");
            }
        }
    }
//-----u wareeji Evc_plus
    static void uWareejiEVCplus() {
        System.out.println("fadlan geli numberka");
        phone = input.nextInt();
        System.out.println("fadlan geli lacagta");
        money = input.nextDouble();
        System.out.println("Ma Hubtaa inaad $" + money + " u wareejisay " + phone + " ");
        System.out.println("1.Haa");
        System.out.println("2.Maya");
        opp = input.nextInt();
        if (opp == 1) {
            if (money > haraa)
                System.out.println("haraaga xisaabtaada kugu ma filana");
            else
                System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + phone + " Tar:" + currenDateAndTime + " haraagaagu waa " + ((haraa - money)));
        } else
            System.out.println("mahadsanid!");
    }
    //------warbixin kooban
    static void warbixinKooban() {
        System.out.println("1: Last Action\n2: Wareejintii u dambeysay\n3: Iibsashadii u dambeysay\n4: Last 3-Action");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("$1 Ayaad u wareejisay 252618260535, Taariikh: 26/10/24 14:06:52");
        } else {
            System.out.println("No Transactions to display!");
        }
    }

/// ----maareynta
    static void maareynta() {
        System.out.println("1. Badal PIN\n2. Badal Luqadda\n3. Wargelin Mobile Lumay\n4. Lacag Xirasho\n5. U celi lacag qaldantay");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Fadlan geli PIN-ka cusub:");
            int newPin = input.nextInt();
            System.out.println("Hubi PIN-ka cusub:");
            int confirm = input.nextInt();
            if (newPin == confirm) {
                password = newPin;
                System.out.println("PIN-ka waad badashay");
            } else {
                System.out.println("PIN isku mid maaha");
            }
            System.out.println("waxaad ku guuleysaty inaad badasho PIN-kaaga");
        } else if (option == 2) {
            System.out.println("Fadlan dooro luqada");
            System.out.println("1.English");
            System.out.println("2.Somali");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("[-EVCPLUS-] you have successfully changed your language");

            if (opp == 2)
                System.out.println("[-EVCPLUS-] waad ku guulaysatay in aad badasho luqadda");
        } else if (option == 3) {
            System.out.println("Fadlan geli mobileka lumay");
            phone = input.nextInt();
            System.out.println("fadlan geli  sirta numberka");
            int pas = input.nextInt();
            System.out.println("Ma hubtaa in aad u diiwaan geliso lumid number-kan" + phone + "?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysatay inaad diwaan geliso" + phone + currenDateAndTime);
            else
                System.out.println("Mahadsanid");
        } else if (option == 4) {
            System.out.println("Fadlan geli numberka lagu Qalday");
            phone = input.nextInt();
            System.out.println("Fadlan geli numberka loo rabay");
            phone = input.nextInt();
            System.out.println("Fadlan geli macluumaad");
            opp = input.nextInt();
            System.out.println("Ma hubtaa in aad xirto lacagtan?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysty inaad xirto lacagtan");
            else
                System.out.println("Mahsanid");
        } else if (option == 5) {
            System.out.println("Fadlan geli aqoonsiga lacag diridda");
            phone = input.nextInt();

            while (phone != phone) {
                System.out.println("invalid input format(length)\n fad geli aqoosiga");
                phone = input.nextInt();
            }

            System.out.println("Fadlan geli macluumaad");
            opp = input.nextInt();
            System.out.println("Ma hubtaa in aad celiso lacagta ?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");
            opp = input.nextInt();
            if (opp == 1)
                System.out.println("Waxaad ku guuleysty inaad celiso lacagtan");
            else
                System.out.println("Mahsanid");
 }
}
}
