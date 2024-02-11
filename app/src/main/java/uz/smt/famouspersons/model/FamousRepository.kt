package uz.smt.famouspersons.model

/**
 *  This file is created by Saidmurod Turdiyev SMT for Famous Persons app
 *  2/6/2024  7:47 PM  Asus Rog
 */
class FamousRepository {
    private var ls= ArrayList<FamousData>()
    fun getFamous(): ArrayList<FamousData> {
        return ls
    }
    fun getFamousById(id:Int): FamousData {
        return ls[id]
    }
}