package pe.edu.upeu.sysventasjpc.modelo

<<<<<<< HEAD

data class ProductoDto (
    val idProducto: Long,
    val nombre: String,
    val pu: Double,
    val puOld: Double,
    val utilidad: Double,
    val stock: Double,
    val stockOld: Double,
    val categoria: Long,
    val marca: Long,
    val unidadMedida: Long
)

data class ProductoRespon (
=======
data class ProductoDto (
    var idProducto: Long,
    var nombre: String,
    var pu: Double,
    var puOld: Double,
    var utilidad: Double,
    var stock: Double,
    var stockOld: Double,
    var categoria: Long,
    var marca: Long,
    var unidadMedida: Long
)
data class ProductoResp(
>>>>>>> e7f4703 (crud)
    val idProducto: Long,
    val nombre: String,
    val pu: Double,
    val puOld: Double,
    val utilidad: Double,
    val stock: Double,
    val stockOld: Double,
    val categoria: Categoria,
    val marca: Marca,
    val unidadMedida: UnidadMedida
)
<<<<<<< HEAD

=======
fun ProductoResp.toDto(): ProductoDto {
    return ProductoDto(
        idProducto = this.idProducto,
        nombre = this.nombre,
        pu = this.pu,
        puOld = this.puOld,
        utilidad = this.utilidad,
        stock = this.stock,
        stockOld = this.stockOld,
        categoria = this.categoria.idCategoria,
        marca = this.marca.idMarca,
        unidadMedida = this.unidadMedida.idUnidad
    )
}
>>>>>>> e7f4703 (crud)
