package com.hs.dgsw.android.qvick.service.remote.service

import com.hs.dgsw.android.qvick.service.remote.request.LoginRequest
import com.hs.dgsw.android.qvick.service.remote.response.BaseResponse
import com.hs.dgsw.android.qvick.service.remote.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("/auth/sign-in")
    suspend fun postLogin(
        @Body body: LoginRequest
    ): BaseResponse<LoginResponse>
}