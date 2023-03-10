package com.example.mymvvm.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ModelClas {
    @SerializedName("postId")
    @Expose
    var postId: Int? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("body")
    @Expose
    var body: String? = null
}