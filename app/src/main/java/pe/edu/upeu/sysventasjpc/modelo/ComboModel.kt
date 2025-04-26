package pe.edu.upeu.sysventasjpc.modelo

data class ComboModel(val code:String, val name:String):
    PickerValue(){
    override fun searchFilter(query: String): Boolean {
        return this.name.startsWith(query)
    }
}
<<<<<<< HEAD

abstract class PickerValue{
    abstract fun searchFilter(query:String):Boolean
}
=======
abstract class PickerValue{
    abstract fun searchFilter(query:String):Boolean
}
>>>>>>> e7f4703 (crud)
