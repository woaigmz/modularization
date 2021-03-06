package com.credithc.hhr.library_common;



import com.credithc.hhr.library_common.bean.BaseResult;
import com.credithc.hhr.library_common.bean.CardListBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by haoran on 2017/11/2.
 */

public interface IApiService {

    //api/getCardList 获取推荐明信片列表
    @POST("getCardList")
    @FormUrlEncoded
    Observable<BaseResult<CardListBean>> getCardList(@Field("name") String name, @Field("page") String page, @Field("max") String max);

}


