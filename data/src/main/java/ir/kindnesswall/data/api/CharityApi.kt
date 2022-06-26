package ir.kindnesswall.data.api

import ir.kindnesswall.data.db.dao.charity.CharityModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage: a interface to define end points
 *
 * How to call: just add in appInjector and repositoryImpl that you wanna use
 *
 */

interface CharityApi {
  @GET("charity/list")
  suspend fun getCharities(): Response<List<CharityModel>>

  @GET("charity/user/{id}")
  suspend fun getCharity(@Path("id") id: Long): Response<CharityModel>
}