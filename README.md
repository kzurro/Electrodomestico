# EJERCICIO HERENCIA

1. Crear una supeclase llamada `Electrodomestico` con las siguientes características:
   - ​Sus atributos son `precio base`, `color`, `consumo energético` (letras entre A y F) y `peso` .
   - Por defecto, el `color` será blanco, el `consumo energético` sera F, el `precioBase` es de 100 € y el `peso` de 5 kg.
   - Los `colores` disponibles son blanco, negro, rojo, azul y gris.
   - Los `constructores` que se implementaran serán​:
     1. Un `constructor` por defecto.
     1. Un `constructor` con el precio y peso. El resto por defecto.
     1. Un `constructor` con todos los atributos.
1. Los métodos que implementara serán:

   - Métodos `get` de todos los atributos.
   - `comprobarConsumoEnergetico(char letra)`: comprueba que la letra es correcta, sino es correcta usará la letra por defecto. Se invocara al crear el objeto y no será visible.
   - `comprobarColor(String color)`: comprueba que el `color` es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no será visible.
   - `precioFinal()`: según el `consumo energético`, aumentara su `precio`, y según su tamaño, también. Esta es la lista de precios:

       <div class="sl-block is-focused" data-block-type="table"        data-name="table-90f703" style="height: auto; min-width: 120px;     width: 203px; left: 80px; top: 435.482px;"       data-origin-id="688d1fffdca14cb892ea187965641153"><div    class="sl-block-content" style="z-index: 12; font-size: 66%;      text-align: center;" data-table-cols="2" data-table-rows="7"     data-table-padding="0px" data-table-border-width="1px"><table><tbody>
       <tr>
       <th style="padding: 0px; width: 80px;">LETRA</th>
       <th style="padding: 0px;">PRECIO</th>
       </tr>
       <tr>
       <td style="padding: 0px; width: 80px;">A</td>
       <td style="padding: 0px;">100€</td>
       </tr>
       <tr>
       <td style="padding: 0px; width: 80px;">B</td>
       <td style="padding: 0px;">80€</td>
       </tr>
       <tr>
       <td style="padding: 0px; width: 80px;">C</td>
       <td style="padding: 0px;">60 €</td>
       </tr>
       <tr>
       <td style="padding: 0px; width: 80px;">D</td>
       <td style="padding: 0px;">50 €</td>
       </tr>
       <tr>
       <td style="padding: 0px; width: 80px;">E</td>
       <td style="padding: 0px;">30€</td>
       </tr>
       <tr>
       <td style="padding: 0px; width: 80px;">F</td>
       <td style="padding: 0px;">10€</td>
       </tr>
       </tbody></table><div class="editing-ui sl-table-column-resizer"         data-column-index="0" style="left: 80px;"></div></div></div><div        class="sl-block is-focused" data-block-type="table"     data-name="table-4b58c3" style="height: auto; min-width: 120px;      width: 261.957px; left: 509.022px; top: 466.445px;"       data-origin-id="47cebe9e90e9667cf24065c4adbdd3bf"><div         class="sl-block-content" style="z-index: 13; font-size: 48%;        text-align: center;" data-table-cols="2"    data-table-rows="5"><table><tbody>
       <tr>
       <th style="width: 166px;">PESO</th>
       <th>PRECIO</th>
       </tr>
       <tr>
       <td style="width: 166px;">Entre 0 y 19 kg</td>
       <td>10 €</td>
       </tr>
       <tr>
       <td style="width: 166px;">Entre 20 y 49 kg</td>
       <td>50 €</td>
       </tr>
       <tr>
       <td style="width: 166px;">Entre 50 y 79 kg</td>
       <td>80 €</td>
       </tr>
       <tr>
       <td style="width: 166px;">Mayor que 80 kg</td>
       <td>100 €</td>
       </tr>
       </tbody></table><div class="editing-ui sl-table-column-resizer" data-column-index="0" style="left: 166px;"></div></div></div>

1. Crea una subclase llamada Lavadora con las siguientes características:
   - Su atributo es `carga` ( además de los atributos heredados).
   - Por defecto, la carga es de 5 kg. Usa una constante para ello.
   - Los `constructores` que se implementaran serán:
   - Un `constructor` por defecto.
   - Un `constructor` con el `precio` y `peso`. El resto por defecto.
   - Un `constructor` con la `carga` y el resto de atributos heredados. Recuerda que debes llamar al `constructor` de la `clase` padre.
   - Los métodos que se implementara serán:
     1. Método `get` de carga.
     1. `precioFinal()`:, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. Las condiciones que hemos visto en la clase `Electrodomestico` también deben afectar al precio.
1. `Television` con las siguientes características:

   - Sus atributos son `resolución` (en pulgadas) y `smartTV` (booleano), además de los atributos heredados.
   - Por defecto, la `resolución` será de 20 pulgadas y el `smartTV` será `false`.
   - Los `constructores` que se implementaran serán:
   - Un `constructor` por defecto.
   - Un `constructor` con el precio y peso. El resto por defecto.
   - Un `constructor` con la `resolución`, `smartTV` y el resto de atributos heredados. Recuerda que debes llamar al `constructor` de la clase padre.
   - Los métodos que se implementara serán:

     - Método `get` de `resolución` y `smartTV` .

     - `precioFinal()`: si tiene una `resolución` mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene `smartTV` , aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
