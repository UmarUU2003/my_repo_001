public enum Languages {
    ENGLISH {
        public String getTextByLanguage(TextNames textName) {
            switch (textName) {
                case MENU -> {
                    return """
                        =-=-=-=-=-=-=-=-=-=
                        Choose one of the following steps:
                        1. Add contact
                        2. Show contact list
                        3. Edit contact
                        4. Delete contact
                        5. Search contact
                        6. Change language
                        0. Exit""";
                }
                case FULL_NAME -> {
                    return "Enter full name (back -> Return to main menu):";
                }
                case PHONE_NUMBER -> {
                    return "Enter phone number (back -> Return to main menu):";
                }
                case SUCCESS_ADDED -> {
                    return "New contact successfully created!";
                }
                case NOT_SUCCESS_ADD -> {
                    return "Failed to create a new contact! Such a phone number is present in the list: ";
                }
                case NO_CONTACT -> {
                    return "No any contacts";
                }
                case SHOW_MODE -> {
                    return """
                            Choose show mode:
                            1. Sorted by ABC
                            2. Sorted by date of creation: from earliest to latest
                            3. Sorted by date of creation: from latest to earliest""";
                }
                case ENTER_NAME_OR_PHONE -> {
                    return "Enter contact name or number for editing (back -> Return to main menu):";
                }
                case RENAME_OR_EDIT -> {
                    return """
                            Choose the editing method? :
                            1. Rename the contact
                            2. Changing the contact number
                            (back -> Return to main menu)""";
                }
                case SUCCESS_RENAMED -> {
                    return "The contact was successfully renamed!";
                }
                case SUCCESS_EDITED -> {
                    return "The contact successfully edited!";
                }
                case CONTACT -> {
                    return "Contact";
                }
                case NAME -> {
                    return "Name";
                }
                case PHONE -> {
                    return "Phone number";
                }
                case NOT_FOUND -> {
                    return "No such contact was found.";
                }
                case SHOW -> {
                    return """
                           Do you want to see a list of contacts?
                           1. Yes
                           2. No
                           (back -> Return to main menu)""";
                }
                case ENTER_ORDINAL -> {
                    return """
                           Enter the ordinal number of one of the above contacts (back -> Return to main menu):""";
                }
                case CONFIRM_DELETE -> {
                    return """
                           Do you confirm the complete deletion of the contact? :
                           1. Yes (confirm deletion)
                           (back -> Return to main menu (Undo deleting))""";
                }
                case SUCCESS_DELETE -> {
                    return "Contact successfully deleted completely.";
                }
                case ENTER_NAME_OR_PHONE_DEL -> {
                    return "Enter contact name or number for deleting (back -> Return to main menu):";
                }
                case ENTER_NAME_OR_PHONE_SE -> {
                    return "Enter contact name or number for searching (back -> Return to main menu):";
                }
                case SUCCESS_EXIT -> {
                    return """
                           ****************************************
                           The program was successfully terminated!
                           ****************************************""";
                }
            }

            return "ERROR";
        }
    },
    RUSSIAN {
        public String getTextByLanguage(TextNames textName) {
            switch (textName) {
                case MENU -> {
                    return """
                            =-=-=-=-=-=-=-=-=-=
                            Выберите один из следующих шагов:
                            1. Добавить контакт
                            2. Воспроизведение список контактов
                            3. Редактировать контакт
                            4. Удалить контакт
                            5. Поиск контакта
                            6. Изменить язык
                            0. Выйти""";
                }
                case FULL_NAME -> {
                    return "Введите полное имя (back -> Вернуться в главное меню):";
                }
                case PHONE_NUMBER -> {
                    return "Введите номер телефона (back -> Вернуться в главное меню):";
                }
                case SUCCESS_ADDED -> {
                    return "Новый контакт успешно создан!";
                }
                case NOT_SUCCESS_ADD -> {
                    return "Не удалось создать новый контакт! Такой номер телефона присутствует в списке: ";
                }
                case NO_CONTACT -> {
                    return "Нет контактов";
                }
                case SHOW_MODE -> {
                    return """
                            Выберите режим отображения:
                            1. Отсортировано по алфавиту
                            2. Отсортировано по дате создания: от самой ранней до самой поздней
                            3. Отсортировано по дате создания: от последней к самой ранней""";
                }
                case ENTER_NAME_OR_PHONE -> {
                    return "Введите имя или номер контакта для редактирования (back -> Вернуться в главное меню):";
                }
                case RENAME_OR_EDIT -> {
                    return """
                            Выберите способ редактирования :
                            1. Переименовать контакт
                            2. Изменение контактного номера
                            (back -> Вернуться в главное меню)""";
                }
                case SUCCESS_RENAMED -> {
                    return "Контакт успешно переименован!";
                }
                case SUCCESS_EDITED -> {
                    return "Контакт успешно отредактирован!";
                }
                case CONTACT -> {
                    return "Контакт";
                }
                case NAME -> {
                    return "Имя";
                }
                case PHONE -> {
                    return "Номер телефона";
                }
                case NOT_FOUND -> {
                    return "Такого контакта не обнаружено.";
                }
                case SHOW -> {
                    return """
                           Вы хотите просмотреть список контактов?
                           1. Да
                           2. Нет
                           (back -> Вернуться в главное меню)""";
                }
                case ENTER_ORDINAL -> {
                    return """
                           Введите порядковый номер одного из вышеуказанных контактов (back -> Вернуться в главное меню):""";
                }
                case CONFIRM_DELETE -> {
                    return """
                           Подтвердить полное удаление контакта?:
                           1. Да (подтверждение удаления)
                           (back -> Вернуться в главное меню (Отмена удаления))""";
                }
                case SUCCESS_DELETE -> {
                    return "Контакт успешно удален навсегда.";
                }
                case ENTER_NAME_OR_PHONE_DEL -> {
                    return "Введите имя или номер контакта для удаления (back -> Вернуться в главное меню):";
                }
                case ENTER_NAME_OR_PHONE_SE -> {
                    return "Введите имя или номер контакта для поиска (back -> Вернуться в главное меню):";
                }
                case SUCCESS_EXIT -> {
                    return """
                           ****************************
                           Программа успешно завершена!
                           ****************************""";
                }
            }
            return "ERROR";
        }
    },
    UZBEK {
        public String getTextByLanguage(TextNames textName) {
            switch (textName) {
                case MENU -> {
                    return """
                            =-=-=-=-=-=-=-=-=-=
                            Quyidagi amallardan birini tanlang:
                            1. Kontakt qo'shish
                            2. Kontaktlar ro'yxatini ko'rsatish
                            3. Kontaktni tahrirlash
                            4. Kontaktni o'chirish
                            5. Kontaktni qidirish
                            6. Tilni o'zgartirish
                            0. Dasturdan chiqish""";
                }
                case FULL_NAME -> {
                    return "To'liq ismini kiriting (back -> Asosiy menyuga qaytish):";
                }
                case PHONE_NUMBER -> {
                    return "Telefon raqamini kiriting (back -> Asosiy menyuga qaytish):";
                }
                case SUCCESS_ADDED -> {
                    return "Yangi kontakt muvaffaqiyatli yaratildi!";
                }
                case NOT_SUCCESS_ADD -> {
                    return "Yangi kontakt yaratilmadi! Bunday telefon raqami  ro'yxatda mavjud: ";
                }
                case NO_CONTACT -> {
                    return "Kontaktlar yo'q";
                }
                case SHOW_MODE -> {
                    return """
                            Ko'rsatish rejimini tanlang:
                            1. Alifbo bo'yicha tartiblangan
                            2. Yaratilgan sanasi bo'yicha tartiblangan: eng avvalgisidan eng oxirgisigacha
                            3. Yaratilgan sanasi bo'yicha tartiblangan: eng oxirgisidan eng avvalgisigacha""";
                }
                case ENTER_NAME_OR_PHONE -> {
                    return "Tahrirlash uchun kontakt nomini yoki raqamini kiriting (back -> Asosiy menyuga qaytish):";
                }
                case RENAME_OR_EDIT -> {
                    return """
                           Tahrirlashni qanday amalga oshirmoqchisiz ? :
                           1. Kontaktni qayta nomlash
                           2. Kontakt raqamini o'zgartirish
                           (back -> Asosiy menyuga qaytish)""";
                }
                case SUCCESS_RENAMED -> {
                    return "Kontakt muvaffaqiyatli qayta nomlandi!";
                }
                case SUCCESS_EDITED -> {
                    return "Kontakt muvaffaqiyatli tahrirlandi!";
                }
                case CONTACT -> {
                    return "Kontakt";
                }
                case NAME -> {
                    return "Ismi";
                }
                case PHONE -> {
                    return "Telefon raqami";
                }
                case NOT_FOUND -> {
                    return "Bunday kontakt topilmadi.";
                }
                case SHOW -> {
                    return """
                           Kontaktlar ro'yxati ko'rsatilsinmi?
                           1. Ha
                           2. Yo'q
                           (back -> Asosiy menyuga qaytish)""";
                }
                case ENTER_ORDINAL -> {
                    return """
                           Yuqoridagi kontaktlardan birining tartib raqamini kiriting (back -> Asosiy menyuga qaytish):""";
                }
                case CONFIRM_DELETE -> {
                    return """
                           Kontaktni butunlay o'chirishni tasdiqlaysizmi?:
                           1. Ha (o'chirib yuborishni tasdiqlash)
                           (back -> Asosiy menyuga qaytish (O'chirishni bekor qilish))""";
                }
                case SUCCESS_DELETE -> {
                    return "Kontakt butunlay o'chirildi.";
                }
                case ENTER_NAME_OR_PHONE_DEL -> {
                    return "O'chirish uchun kontakt nomini yoki raqamini kiriting (back -> Asosiy menyuga qaytish):";
                }
                case ENTER_NAME_OR_PHONE_SE -> {
                    return "Qidirish uchun kontakt nomini yoki raqamini kiriting (back -> Asosiy menyuga qaytish):";
                }
                case SUCCESS_EXIT -> {
                    return """
                           *********************************
                           Dastur muvaffaqiyatli yakunlandi!
                           *********************************""";
                }
            }
            return "ERROR";
        }
    };

    public abstract String getTextByLanguage(TextNames textName);

}
