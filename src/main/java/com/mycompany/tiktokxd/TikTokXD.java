/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiktokxd;

/**
 *
 * @author alfon
 */
public class TikTokXD {
    public static void main(String[] args) {
        // Crear instancias
        Usuario usuario = new Usuario("SenseiAlfonso");
        Video video = new Video("Poo", 60, "https://www.youtube.com/watch?v=hMZFSSF-JkQ&t=1s");

        // Subir video
        usuario.subirVideo(video);

        // Mostrar información del usuario
        usuario.mostrarInfoUsuario();
        System.out.println("ESTO ES NUEVO");
    }
}
