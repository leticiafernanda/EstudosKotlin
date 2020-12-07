package com.example.afrodev_pokedex.model

import com.google.gson.annotations.SerializedName




class SpriteResponse {
    @SerializedName("id")
    private var id: Int? = null

    @SerializedName("image")
    private var image: String? = null

    @SerializedName("name")
    private var name: String? = null

    fun SpriteResponse(id: Int?, image: String?, name: String?) {
        this.id = id
        this.image = image
        this.name = name
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getImage(): String? {
        return image
    }

    fun setImage(image: String?) {
        this.image = image
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }
}