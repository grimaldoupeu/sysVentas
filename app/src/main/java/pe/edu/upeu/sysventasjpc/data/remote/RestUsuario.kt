package pe.edu.upeu.sysventasjpc.data.remote

<<<<<<< HEAD
import pe.edu.upeu.sysventasjpc.modelo.UsuarioDto
import pe.edu.upeu.sysventasjpc.modelo.UsuarioResp
import retrofit2.Response
=======

import pe.edu.upeu.sysventasjpc.modelo.UsuarioDto
import pe.edu.upeu.sysventasjpc.modelo.UsuarioResp
import retrofit2.Response

>>>>>>> e7f4703 (crud)
import retrofit2.http.Body
import retrofit2.http.POST

interface RestUsuario {
<<<<<<< HEAD
    @POST("/users/login")
    suspend fun login(@Body user:UsuarioDto): Response<UsuarioResp>
=======
    @POST("users/login")
    suspend fun login(@Body user: UsuarioDto):
            Response<UsuarioResp>
>>>>>>> e7f4703 (crud)
}