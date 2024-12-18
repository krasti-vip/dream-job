
### Эта коллекция хранит числа в ArrayList, капасити 10, размер по умолчанию 0

* Конструктор CustomArrayList() создает пустой список с начальной ёмкостью 10

* Конструктор CustomArrayList(int capacity) позволяет пользователю задать начальную емкость списка при создании объекта. Если ожидается,
что список будет содержать много элементов, можно сразу задать большое значение capacity,
чтобы избежать расширений массива

* Метод add() добавляет новый элемент в конец списка: 1. увеличение размера: Сначала увеличивается счетчик размера size.
Это нужно, чтобы показать, что список увеличивается на один элемент.
Проверка емкости: Если после увеличения size равно capacity (то есть список заполнен), то емкость массива
удваивается (массив увеличивается вдвое). Создается новый массив с удвоенной емкостью, и все элементы из старого
массива копируются в новый с помощью метода System.arraycopy().
Добавление элемента: После проверки и возможного увеличения емкости новый элемент elem добавляется в массив на
позицию size - 1.
 
* Метод addAll() добавляет все элементы из массива elements в текущий список, используя метод add().
Он перебирает переданный массив и добавляет каждый его элемент в список.
   
* Метод get() позволяет полученить элемент по индексу: сначала проверяется, находится ли индекс в пределах текущего
размера списка (index < size). Если индекс выходит за границы, выбрасывается исключение IllegalArgumentException.
Возврат элемента: Если индекс корректен, метод возвращает элемент по этому индексу.

* Метод getSize()  просто возвращает количество элементов в списке, которое хранится в переменной size.

* Метод remove() производит удаление элемента по индексу: проверка индекса: как и в методе get(), проверяется, 
является ли индекс допустимым. Сдвиг элементов: все элементы, следующие за удаленным, сдвигаются влево. Это происходит в цикле, начиная с
удаляемого индекса и заканчивая предпоследним элементом.
Обнуление последнего элемента: Последний элемент массива (который был продублирован после сдвига) обнуляется.
Уменьшение размера: Размер списка уменьшается на 1, чтобы отразить удаление элемента.

* Метод update() 
производит обновление элемента по индексу: проверка индекса: проверяется, что индекс находится в 
пределах списка. Если индекс выходит за пределы списка, выбрасывается исключение. Замена элемента: Если индекс 
корректен, элемент в массиве заменяется на новое значение elem.
  

    
