# Android Studio Test Exercise
Aquest projecte és una aplicació de pràctica desenvolupada amb Jetpack Compose per demostrar la implementació d'una arquitectura MVVM i el procés de Testing Instrumental.

## Tecnologies utilitzades
Kotlin amb Jetpack Compose per a la UI.

ViewModel amb LiveData per a la gestió d'estats.

JUnit 4 i Compose Test Rule per als tests instrumentals.

---

## Procés de Testing
S'han realitzat tests instrumentals per verificar que la lògica de negoci al MainViewModel es comunica correctament amb la vista.

Tests implementats:
- **Cerca de text:** Verifica que en escriure al camp de text, el valor s'actualitza correctament al ViewModel.

- **Selecció de RadioButtons:** S'ha optimitzat l'experiència d'usuari permetent clicar a tota la fila per seleccionar un jugador.

- **Botó de cerca:** Comprova que es mostra el missatge d'èxit ("Acció completada!") en clicar el botó.

- **Dropdown:** Verifica l'obertura i tancament del menú d'opcions.

---

## Notes de desenvolupament
He corregit un error del test als RadioButtons millorant la semàntica dels components en fer tota la Row clicable.

## Link Video
https://youtu.be/rUmx8nn0_E0
