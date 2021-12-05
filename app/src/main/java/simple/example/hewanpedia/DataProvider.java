package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Harimau;
import simple.example.hewanpedia.model.Kumbang;
import simple.example.hewanpedia.model.Tikus;
public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Harimau> initDataHarimau(Context ctx) {
        List<Harimau> harimaus = new ArrayList<>();
        harimaus.add(new Harimau("Panthera leo bleyenberghi", "Zaire",
                "Singa besar ini mampu mencapai berat hingga 280 kilogram", R.drawable.harimau1));
        harimaus.add(new Harimau("Panthera leo azandica", "Kongo",
                "Singa Kongo dicirikan oleh panjangnya yang berkisar antara 2,5 meter sampai atau 2,8 meter. Selain itu, subspesies singa ini dapat memiliki berat antara 150 dan 190 kg", R.drawable.harimau2));
        harimaus.add(new Harimau("Panthera leo krugeri", "Afrika Selatan",
                "Singa Afrika ini adalah varietas dari bagian selatan Afrika dan dianggap sebagai saudara singa Katanga", R.drawable.harimau3));
        harimaus.add(new Harimau("Panthera leo leo", "Hutan Afrika",
                "Subspesies ini merupakan salah satu yang terbesar, ditandai dengan surai besar dan suburnya", R.drawable.harimau4));
        harimaus.add(new Harimau("Panthera leo nubica", "Afrika Timur",
                "Bobot tubuhnya sama dengan spesies singa pada umumnya, yaitu antara 150 hingga 200 kg", R.drawable.harimau5));
        harimaus.add(new Harimau("Panthera leo persica", "India",
                "Varietas ini lebih kecil dari jenis singa lainnya dan memiliki bulu yang lebih terang, dengan surai kemerahan pada pejantan", R.drawable.harimau6));
        return harimaus;
    }

    private static List<Kumbang> initDataKumbang(Context ctx) {
        List<Kumbang> kumbangs = new ArrayList<>();
        kumbangs.add(new Kumbang("Panthera pardus kotiya", "Sri Lanka",
                "Macan tutul ini memiliki bulu kuning kecoklatan atau berkarat dengan warna merah jambu dan bintik-bintik gelap", R.drawable.kum1));
        kumbangs.add(new Kumbang("Panthera pardus melas", "Jawa, Indonesia",
                " Macan tutul ini benar-benar hitam karena fenotipe resesif atau memiliki bulu berbintik biasa", R.drawable.kum2));
        kumbangs.add(new Kumbang("Panthera pardus delacouri", "Cina Selatan dan Asia Tenggara",
                "Macan tutul Indochina muncul dalam bentuk yang didominasi warna hitam", R.drawable.kum3));
        kumbangs.add(new Kumbang("Panthera pardus orientalis", "Tenggara Rusia dan Timur Laut Cina",
                "Hewan ini berbeda dari subspesies macan tutul lainnya karena bulunya yang tebal dan tertutup bintik yang cocok untuk bertahan hidup di iklim dingin tempat macan tutul ini hidup", R.drawable.kum4));
        kumbangs.add(new Kumbang("Panthera pardus japonensis", "Tiongkok Utara",
                "Macan tutul ini berukuran kira-kira sama dengan macan tutul Amur. Namun bulu mereka lebih gelap dan lebih berwarna oranye", R.drawable.kum5));
        kumbangs.add(new Kumbang("Panthera pardus ciscaucasica", "Kaukasus",
                "Subspesies macan tutul terbesar dan berasal dari wilayah Kaukasus di mana jangkauannya meliputi Turkmenistan, Azerbaijan, Iran, dan Afghanistan barat", R.drawable.kum6));
        return kumbangs;
    }

    private static List<Tikus> initDataTikus(Context ctx) {
        List<Tikus> tikuss = new ArrayList<>();
        tikuss.add(new Tikus("Bengal", "India",
                "Harimau ini memiliki bulu oranye dengan jumbai putih di sekitar telinga dan garis-garis hitam di bagian belakang, dan ia memiliki rahang yang kuat, kaki belakang dan cakar depan kuat", R.drawable.tikus1));
        tikuss.add(new Tikus("Indochina", "Indochina Asia (Perbukitan atau Gunung)",
                "Harimau Indocina ini memiliki ukuran tubuh yang lebih kecil. Selain itu juga memiliki warna bulu yang lebih gelap", R.drawable.tikus2));
        tikuss.add(new Tikus("Himalayan", "Semenanjung Malaysia",
                "Harimau Malaya memiliki banyak kemiripan dengan harimau Indochina", R.drawable.tikus3));
        tikuss.add(new Tikus("Panthera tigris", "Sumatera, Indonesia",
                "Harimau ini termasuk ke dalam harimau yang berukuran kecil. Ukuran tubuhnya untuk jantan mencapai 250 centimeter  sedangkan betina 198 cm", R.drawable.tikus4));
        tikuss.add(new Tikus("Siberia", "Siberia",
                "Panjang ukuran rata-ratanya sekitar 5 – 7 kaki, dan beberapa jantan bisa mencapai 10 kaki atau lebih. Yang terberat dalam catatan adalah 273Kg", R.drawable.tikus5));
        tikuss.add(new Tikus("Cina Selatan", "Hutan Cina Selatan",
                "Harimau Cina Selatan adalah spesies yang sangat langka. Bisa dibilang spesies ini terancam punah. Hanya tersisa 30 – 40 ekor, dan semuanya ada di kebun binatang", R.drawable.tikus6));
        return tikuss;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataHarimau(ctx));
        hewans.addAll(initDataKumbang(ctx));
        hewans.addAll(initDataTikus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
