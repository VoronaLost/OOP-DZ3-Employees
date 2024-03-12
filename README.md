- Доработал базовый класс Employee и производные от него, классы Worker и Freelancer, добавив дополнительное поле "номер телефона", а также для наглядного вывода изменил перегрузку метода toString() на более наглядную, добавив в вывод наименование специализации работника для текущего экземпляра (штатный работник для класса Worker, либо фрилансер для класса Freelancer).
- Переработал метод EmployeeFabric, так чтобы генерировались как представителей класса Freelancer, так и Worker в соотношении 20% к 80%. В зависимости от сгенерированного класса, отличается генерация полей salary. Для штатного работника это будет месячный оклад, для фрилансера - почасовой оклад. Соответственно метод месячного оклада также считается по различным формулам для этих двух классов.
    - Дополнительное поле phoneNumber генерирует семизначный набор цифр строкового типа, сгенерированное поле общее для любых экземпляров наследственных классов.
- В качестве собственного компоратора был написан PhoneComparator для сравнения строковых полей номеров телефона.
- В main-функции при выводе результатов сортировки, я сделал два вывода - отдельно по каждому классу, и как один отстортированный массив.
