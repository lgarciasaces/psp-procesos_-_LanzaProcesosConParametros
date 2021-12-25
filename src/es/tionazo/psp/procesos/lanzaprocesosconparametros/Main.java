package es.tionazo.psp.procesos.lanzaprocesosconparametros;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
            for (int i = 0; i < 3; i++) {
                /* Lanzamos varios procesos de Ms Word creando documentos a partir de otro ya existente.
                */
                // puedes insertar la hora actual en word y que se actualice automáticamente
                ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.EXE", "/f", "C:\\basura\\plantilla.docx" );
                try {
                    // dormimos el proceso durante 2 segundos
                    Thread.sleep(2000);
                } // debemos capturar la excepción en caso de que el proceso "padre" sea interrumpido durante su "siesta"
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    pb.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
