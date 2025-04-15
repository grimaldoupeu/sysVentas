package pe.edu.upeu.sysventasjpc.data.remote

import pe.edu.upeu.sysventasjpc.modelo.ProductoRespon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface RestProducto {

    @GET("${BASE_URL}")
    suspend fun reportarProducto(@Header("Authorization") token:String):Response<List<ProductoRespon>>

    companion object{ const val BASE_URL="/productos" }
}