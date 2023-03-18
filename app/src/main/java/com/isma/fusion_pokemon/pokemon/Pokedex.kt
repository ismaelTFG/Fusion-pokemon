package com.isma.fusion_pokemon.pokemon

class Pokedex(
    override val numero: Int,
    override val nombre: String,
    override val tipo1: String,
    override val tipo2: String,
    override val img: String,
    val descripcion: String
) : Base {}