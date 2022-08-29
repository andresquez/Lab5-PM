package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Team
import com.squareup.picasso.Picasso

class Datasource() {

    fun loadAffirmations(): List<Team> {
        return listOf<Team>(
            Team(R.string.team1, "https://i.imgur.com/NPfQXPA.png"),
            Team(R.string.team2, "https://i.imgur.com/a5jn5E5.png"),
            Team(R.string.team3,"https://i.imgur.com/tNEvx0K.png"),
            Team(R.string.team4, "https://i.imgur.com/FUuHP6A.png"),
            Team(R.string.team5, "https://i.imgur.com/PNCVYvP.png"),
            Team(R.string.team6, "https://i.imgur.com/Ka9BKif.png"),
            Team(R.string.team7, "https://i.imgur.com/56XOqFh.png"),
            Team(R.string.team8, "https://i.imgur.com/gXPwPdV.png"),
            Team(R.string.team9,"https://i.imgur.com/nZO5f1e.jpg"),
            Team(R.string.team10,"https://i.imgur.com/y37atm0.jpg")
        )
    }
}