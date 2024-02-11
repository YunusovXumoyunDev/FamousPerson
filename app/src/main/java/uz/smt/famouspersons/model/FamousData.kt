package uz.smt.famouspersons.model

import uz.smt.famouspersons.R

data class FamousData(
    var image: Int,
    var word: String
)

fun loadData(): List<FamousData> {
    val ls = ArrayList<FamousData>()
    ls.add(
        FamousData(
            image = R.drawable.alisher_navoiy,
            word = "Alisher Navoiy (1441-1501) - buyuk shoir va mutafakkir, davlat arbobi. To‘liq ismi Nizomiddin Mir Alisher. Navoiy tahallusi ostida chig‘atoy (eki o‘zbek tili) hamda forsiyda (fors tilidagi asarlarida) ijod qilgan. G‘arbda chig‘atoy adabiyoti hisoblanmish o‘zbek adabiyotining eng yirik namoyondasi. Umuman olganda, butun turkiy xalqlari orasida u kabi yirik shaxs yo‘qdir.\n" +
                    "\n" +
                    "Navoiy yoshligidan Xurosonning (Transoksaniya) bo‘lajak hukmdori Husayn Boyqaro bilan (1469-1506) do‘st bo‘lgan. 10-12 yoshidan she’rlar yozishni boshlagan. Navoiyning zamondoshi bo‘lmish tarixchi Xondamir (1473(76) -1534) qoldirgan ma’lumotlarga ko‘ra, mashhur o‘zbek shoiri Lutfiy (1369-1465) qarigan chog‘larida bolakay Navoiy bilan ko‘rishadi va uning she’riy iqtidorini yuqori baholaydi."
        )
    )
    return ls
}