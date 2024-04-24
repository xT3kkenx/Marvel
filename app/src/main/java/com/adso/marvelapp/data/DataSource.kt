package com.adso.marvelapp.data

import com.adso.marvelapp.model.Superheroe

class DataSource {

    fun getSuperHeroe():MutableList<Superheroe>{
        var superheroe:MutableList<Superheroe> = mutableListOf()
        superheroe.add(Superheroe("Spiderman","Marvel","Peter Parker","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRctx0-thuSqK1OtKIG60RE4oYfxbcfVyyY2Gqv_k7Q1A&s"))
        superheroe.add(Superheroe("Deadpool","Marvel","Wade Winston","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRp-vPV6JM5Tne5HdBGAUBm4xGB_Z8EKjo2c4bUHsbLzw&s"))
        superheroe.add(Superheroe("Iron Man","Marvel","Anthony Edward Stark","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiLhqn5Cfuhy0BJ9ABSGvjcVZm04gBkmWfqyOKW8o2VA&s"))
        superheroe.add(Superheroe("Hulk","Marvel","Bruce Banner","https://i.pinimg.com/474x/a2/1f/72/a21f72fef0f8843a7cebb570fbf5685f.jpg"))
        superheroe.add(Superheroe("Thor","Marvel","Thor Odinson","https://i.pinimg.com/474x/ce/70/b0/ce70b0c48ffe6880b9e46bbf3c760b58.jpg"))
        superheroe.add(Superheroe("Capitan America","Marvel","Steven Rogers","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9_gbGIiImEzESENUmqIA4X2qEwvpMpJqH6sSZ2PnIJQ&s"))
        superheroe.add(Superheroe("Antman","Marvel","Scott Lang","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSPtx3ifvWlg_1in6B9IMqwLBYpI58Dc5A0ktFTDsBCQ&s"))

        return superheroe
    }
}