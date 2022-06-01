package com.kadazi.poliklinikapps.Api;

import com.kadazi.poliklinikapps.Model.ResponseModelDetailPemeriksaan;
import com.kadazi.poliklinikapps.Model.ResponseModelResep;
import com.kadazi.poliklinikapps.Model.ResponseModelResepDetails;
import com.kadazi.poliklinikapps.Model.ResponseModelRiwayat;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIRequestData {
    @GET("resep/{id}")
    Call<ResponseModelResep> listResep(@Path("id")int id);
    @GET("riwayat_pemeriksaan/{id}")
    Call<ResponseModelRiwayat> listRiwayat(@Path("id") int id);
    @GET("detail_pemeriksaan/{id}")
    Call<ResponseModelDetailPemeriksaan> Detail(@Path("id") int id);
    @GET("details_resep/{id}")
    Call<ResponseModelResepDetails> DetailS_Resep(@Path("id") int id);
}
