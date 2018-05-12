package com.example.usuario.app1_p2;

import java.util.ArrayList;

public class origen_de_datos {
    public origen_de_datos() {
    }

    public ArrayList<tarjeta> showAll()
    {
        ArrayList<tarjeta> resultado = new ArrayList<tarjeta>();

        tarjeta uno = new tarjeta();
        tarjeta dos = new tarjeta();
        tarjeta tres = new tarjeta();
        tarjeta cuatro = new tarjeta();
        tarjeta cinco = new tarjeta();
        tarjeta seis = new tarjeta();
        tarjeta siete = new tarjeta();
        tarjeta ocho = new tarjeta();
        tarjeta nueve = new tarjeta();
        tarjeta diez = new tarjeta();


        uno.Nombre = "Puffle";
        uno.Edad = "Azul";
        uno.Descripcion = "Es normal.";
        uno.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/0/00/Tipoisso.png/revision/latest/scale-to-width-down/285");
        uno.ID=0;

        dos.Nombre = "Puffle";
        dos.Edad = "Rojo";
        dos.Descripcion = "Era salvaje.";
        dos.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/e/e2/Red_Puffle_Old_Look.png/revision/latest/scale-to-width-down/282");
        dos.ID=1;

        tres.Nombre = "Puffle";
        tres.Edad = "Verde";
        tres.Descripcion = "Es loco y vuela con su gorrito.";
        tres.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/8/83/IMG_0880.PNG/revision/latest/scale-to-width-down/283");
        tres.ID=2;

        cuatro.Nombre = "Puffle";
        cuatro.Edad = "Rosa";
        cuatro.Descripcion = "Le gustan las burbujas.";
        cuatro.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/d/d5/Old_Pink_Puffle_old_look.png/revision/latest/scale-to-width-down/285");
        cuatro.ID=3;

        cinco.Nombre = "Puffle";
        cinco.Edad = "Morado";
        cinco.Descripcion = "Es muy cool y le gusta bailar.";
        cinco.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/b/b8/Lolz_icon.png/revision/latest/scale-to-width-down/283");
        cinco.ID=4;

        seis.Nombre = "Puffle";
        seis.Edad = "Negro";
        seis.Descripcion = "Está enojadito.";
        seis.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/3/3d/Puffle_negro_fdp.png/revision/latest/scale-to-width-down/280");
        seis.ID=5;

        siete.Nombre = "Puffle";
        siete.Edad = "Amarillo";
        siete.Descripcion = "Es artístico.";
        siete.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/f/f3/Yellowpuffleold.png/revision/latest/scale-to-width-down/284");
        siete.ID=6;

        ocho.Nombre = "Puffle";
        ocho.Edad = "Blanco";
        ocho.Descripcion = "Es frío.";
        ocho.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/3/3d/White_Puffle.png/revision/latest/scale-to-width-down/283");
        ocho.ID=7;

        nueve.Nombre = "Puffle";
        nueve.Edad = "Naranja";
        nueve.Descripcion = "Tiene la lengua morada jeje.";
        nueve.Imagen =("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/d/d2/Orangepuffleold.png/revision/latest/scale-to-width-down/270");
        nueve.ID=8;

        diez.Nombre = "Puffle";
        diez.Edad = "Café";
        diez.Descripcion = "Le gustan los carritos, y tiene unos lentes padres :D";
        diez.Imagen = ("https://vignette.wikia.nocookie.net/club-penguin-rewritten/images/9/9e/Brown_Puffle_Old_Look.png/revision/latest/scale-to-width-down/282");
        diez.ID=9;

        resultado.add(uno);
        resultado.add(dos);
        resultado.add(tres);
        resultado.add(cuatro);
        resultado.add(cinco);
        resultado.add(seis);
        resultado.add(siete);
        resultado.add(ocho);
        resultado.add(nueve);
        resultado.add(diez);

        return resultado;
    }
}
