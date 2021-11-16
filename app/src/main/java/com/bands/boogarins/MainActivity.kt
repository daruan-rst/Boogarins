package com.bands.boogarins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textID: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textID =findViewById(R.id.textview)

        textID?.setText("Boogarins")

        val biography = findViewById<Button>(R.id.biographyButton)
        biography.setOnClickListener {
            biography()
        }

        val members = findViewById<Button>(R.id.membersButton)
        members.setOnClickListener {
                members()
        }

        val disco = findViewById<Button>(R.id.discographyButton)
        disco.setOnClickListener {
            discography()
        }
    }

    fun biography(){
        val textViewBiography = findViewById<TextView>(R.id.biographyView)
        textViewBiography.text = BIO
    }

    fun discography(){
        val textViewDiscography = findViewById<TextView>(R.id.discography)
        textViewDiscography.text = DISCOGRAPHY
    }

    fun members(){
        val textViewMembers = findViewById<TextView>(R.id.members)
        textViewMembers.text = MEMBERS
    }




    

    companion object{

        val BIO = "Tropical psychedelic rockers Boogarins were formed by friends Fernando Almeida and Benke Ferraz when they were still in high school together. They took their inspiration from the sunny weirdness of '60s Tropicalia pop and transplanted it into the decidedly more D.I.Y. context of teenagers recording songs on borrowed gear and glitchy computers in the basements of their parents' homes. They sharpened their approach with a full band on humid, exciting albums like 2017's La Vem a Morte.\n" +
                "\n" +
                "Boogarins were formed in the Brazilian city of Goiania in the early 2010s. The project began as an untitled, recording-only entity, and before ever playing a single show, filling out the band to include a rhythm section, or even choosing a name, Ferraz and Almeida had recorded an album's worth of material. These recordings caught the ears of music hounds and tastemakers the world over, eventually landing in the hands of Other Music Recording Co., the label offshoot of long-standing New York record shop and cultural institution Other Music." + "\n" +" Once signed to the label, the duo had to make haste in becoming a \"real band\" and quickly named themselves Boogarins after a type of jasmine flower. They titled their debut album As Plantas Que Curam, the English translation of which is \"Plants That Heal.\" The band expanded to include drummer Hans Castro and bassist Raphael Vaz, and played their first shows in April of 2013. Their album saw release in September of the same year and the group toured internationally in support. After the tour, Castro left the band, replaced by new drummer Ynaiã Benthroldo. In 2015, the band issued their sophomore studio long-player Manual, again on Other Music. Their next record, 2017's La Vem a Morte was first posted on YouTube with no press leadup – it was intended as a surprise gift for their listeners. The album was met with positive reviews and more touring ensued. Two years later, Boogarins returned with fourth album Sombrou Dúvida."


        val MEMBERS ="Dinho - Lead Guitar\n" +
                     "Benke - Solo Guitar\n" +
                     "Ynaiã - Drums\n" +
                     "Fefel Costa - Bass"

        val DISCOGRAPHY =   "2013 - As Plantas Que Curam\n" +
                            "2015 - Manual\n" +
                            "2017 - La vem a Morte\n" +
                            "2019 - Sombrou Duvida\n" +
                            "2020 - Manchaca Vol1.\n" +
                            "2021 - Manchaca Vol2."


    }

}