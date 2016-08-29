# Facundia
Librería para manipulación de palabras en español. Esta librería es un simple jar sin acceso a APIs REST, aplicaciones existentes o bases de datos internas (excepto listas de excepciones, inevitables cuando se trata del español), que puede ser incluida en cualquier aplicación Java que use un gestor de dependencias.

## Funcionalidades

<a href="#cardinal"></a>
- Escritura de números cardinales: Permite que se escriban números cardinales en su forma textual. Los números en ka mayoría de los país hispanoparlantes siguen la [escala larga](https://es.wikipedia.org/wiki/Escalas_num%C3%A9ricas_larga_y_corta#Escala_num.C3.A9rica_larga), uno de los sistemas numéricos más populares existentes en el planeta. Esto hace que la escritura de cardinales sea muy simple, excepto algunos casos particulares como 21 y 100. Facundia permite la escritura de cualquier número entre 0 y 10<sup>25</sup>-1. Este rango es totalmente arbitrario, ya que es sencillo extenderse a los números negativos y a períodos superiores al cuatrillón (quintillones, sextillones...) Nótese sin embargo que la Real Academia reconoce cuatrillón como la mayor palabra dedicada a nombrar una cantidad, siendo las demás neologismos aún no reconocidos.
<a href="#syllabes"></a>
- Sílabas: Permite la separacion de palabras en sílabas según un enfoque tónico. Esto significa que las palabras se dividen de acuerdo a como se pronuncian y no de acuerdo a su etimología. Por ejemplo, etimológicamente la palabra desahucio se dividiría en des-ahu-cio, mientras que tónicamente la división silábica es de-sahu-cio. También existen otros enfoques para la división silábica que no considero tan naturales como la división tónica.
<a href="#plural"></a>
- Pluralización: Permite obtener el plural de cualquier palabra, siguiendo un conjunto de reglas estructurales y una lista de plurales excepcionales, [plurale tantum](https://es.wikipedia.org/wiki/Plurale_tantum) y [singulare_tantum](https://es.wikipedia.org/wiki/Singulare_tantum).
