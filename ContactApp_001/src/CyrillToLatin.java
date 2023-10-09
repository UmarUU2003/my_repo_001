public class CyrillToLatin {
    private CyrillToLatin(){}
    public static String cyrillToLatin(String vtekst){
        String tekst = "";
        try
        {
            if (vtekst != null && !vtekst.isEmpty())
            {
                if (vtekst.charAt(0) != ' ')
                {
                    tekst = " " + vtekst;
                }
                else tekst = vtekst;
                if (vtekst.charAt(vtekst.length() - 1) != ' ')
                {
                    tekst += "  ";
                }
                String ltekst = "";
                for (int i = 0; i < tekst.length(); i++)
                {
                    char sym = tekst.charAt(i);
                    String mx = "";
                    switch (sym)
                    {
                        case 'А': sym = 'A'; break;
                        case 'Б': sym = 'B'; break;
                        case 'Д': sym = 'D'; break;
                        case 'Э': sym = 'E'; break;
                        case 'Ф': sym = 'F'; break;
                        case 'Г': sym = 'G'; break;
                        case 'Ҳ': sym = 'H'; break;
                        case 'И': sym = 'I'; break;
                        case 'Ж': sym = 'J'; break;
                        case 'К': sym = 'K'; break;
                        case 'Л': sym = 'L'; break;
                        case 'М': sym = 'M'; break;
                        case 'Н': sym = 'N'; break;
                        case 'О': sym = 'O'; break;
                        case 'П': sym = 'P'; break;
                        case 'Қ': sym = 'Q'; break;
                        case 'Р': sym = 'R'; break;
                        case 'С':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'Ҳ': mx = "Sʼ"; break;
                                case 'ҳ': mx = "Sʼ"; break;
                                default: sym = 'S'; break;
                            }
                            break;
                        case 'Т': sym = 'T'; break;
                        case 'У': sym = 'U'; break;
                        case 'В': sym = 'V'; break;
                        case 'Х': sym = 'X'; break;
                        case 'Й': sym = 'Y'; break;
                        case 'З': sym = 'Z'; break;
                        case 'Ў': mx = "Oʻ"; break;
                        case 'Ғ': mx = "Gʻ"; break;
                        case 'Ш': mx = "Sh"; break;
                        case 'Ч': mx = "Ch"; break;
                        case 'Ц':
                            if (i > 0)
                            {
                                switch (tekst.charAt(i - 1))
                                {
                                    case 'А': mx = "TS"; break;
                                    case 'Э': mx = "TS"; break;
                                    case 'И': mx = "TS"; break;
                                    case 'О': mx = "TS"; break;
                                    case 'У': mx = "TS"; break;
                                    case 'Ў': mx = "TS"; break;
                                    case 'Е': mx = "TS"; break;
                                    case 'Ю': mx = "TS"; break;
                                    case 'Я': mx = "TS"; break;
                                    case 'а': mx = "TS"; break;
                                    case 'э': mx = "TS"; break;
                                    case 'и': mx = "TS"; break;
                                    case 'о': mx = "TS"; break;
                                    case 'у': mx = "TS"; break;
                                    case 'ў': mx = "TS"; break;
                                    case 'е': mx = "TS"; break;
                                    case 'ю': mx = "TS"; break;
                                    case 'я': mx = "TS"; break;
                                    default: mx = "S"; break;
                                }
                            }
                            else mx = "S"; break;
                        case 'Е':
                            if (i > 0)
                            {
                                switch (tekst.charAt(i - 1))
                                {
                                    case 'А': mx = "Ye"; break;
                                    case 'Э': mx = "Ye"; break;
                                    case 'И': mx = "Ye"; break;
                                    case 'О': mx = "Ye"; break;
                                    case 'У': mx = "Ye"; break;
                                    case 'Ў': mx = "Ye"; break;
                                    case 'Е': mx = "Ye"; break;
                                    case 'Ю': mx = "Ye"; break;
                                    case 'Я': mx = "Ye"; break;
                                    case 'а': mx = "Ye"; break;
                                    case 'э': mx = "Ye"; break;
                                    case 'и': mx = "Ye"; break;
                                    case 'о': mx = "Ye"; break;
                                    case 'у': mx = "Ye"; break;
                                    case 'ў': mx = "Ye"; break;
                                    case 'е': mx = "Ye"; break;
                                    case 'ю': mx = "Ye"; break;
                                    case 'я': mx = "Ye"; break;
                                    case 'ъ': mx = "Ye"; break;
                                    case 'ь': mx = "Ye"; break;
                                    case 'Ъ': mx = "Ye"; break;
                                    case 'Ь': mx = "Ye"; break;
                                    case ' ': mx = "Ye"; break;
                                    case '@': mx = "Ye"; break;
                                    case '$': mx = "Ye"; break;
                                    case '|': mx = "Ye"; break;
                                    case '~': mx = "Ye"; break;
                                    case '&': mx = "Ye"; break;
                                    case ':': mx = "Ye"; break;
                                    case ';': mx = "Ye"; break;
                                    case '#': mx = "Ye"; break;
                                    case '+': mx = "Ye"; break;
                                    case '.': mx = "Ye"; break;
                                    case '!': mx = "Ye"; break;
                                    case '?': mx = "Ye"; break;
                                    case '*': mx = "Ye"; break;
                                    case ',': mx = "Ye"; break;
                                    case '-': mx = "Ye"; break;
                                    case '_': mx = "Ye"; break;
                                    case '=': mx = "Ye"; break;
                                    case '(': mx = "Ye"; break;
                                    case ')': mx = "Ye"; break;
                                    case '[': mx = "Ye"; break;
                                    case ']': mx = "Ye"; break;
                                    case '{': mx = "Ye"; break;
                                    case '}': mx = "Ye"; break;
                                    case '/': mx = "Ye"; break;
                                    case '"': mx = "Ye"; break;
                                    case '\\': mx = "Ye"; break;
                                    case '\n': mx = "Ye"; break;
                                    default: mx = "E"; break;
                                }
                            }
                            else mx = "Ye"; break;
                        case 'Ю':
                            mx = "Yu"; break;
                            /*if (i > 0)
                            {
                                switch (tekst[i - 1])
                                {
                                    case 'А': mx = "Yu"; break;
                                    case 'Э': mx = "Yu"; break;
                                    case 'И': mx = "Yu"; break;
                                    case 'О': mx = "Yu"; break;
                                    case 'У': mx = "Yu"; break;
                                    case 'Ў': mx = "Yu"; break;
                                    case 'Е': mx = "Yu"; break;
                                    case 'Ю': mx = "Yu"; break;
                                    case 'Я': mx = "Yu"; break;
                                    case 'а': mx = "Yu"; break;
                                    case 'э': mx = "Yu"; break;
                                    case 'и': mx = "Yu"; break;
                                    case 'о': mx = "Yu"; break;
                                    case 'у': mx = "Yu"; break;
                                    case 'ў': mx = "Yu"; break;
                                    case 'е': mx = "Yu"; break;
                                    case 'ю': mx = "Yu"; break;
                                    case 'я': mx = "Yu"; break;
                                    case ' ': mx = "Yu"; break;
                                    case '@': mx = "Yu"; break;
                                    case '$': mx = "Yu"; break;
                                    case '|': mx = "Yu"; break;
                                    case '~': mx = "Yu"; break;
                                    case '&': mx = "Yu"; break;
                                    case ':': mx = "Yu"; break;
                                    case ';': mx = "Yu"; break;
                                    case '#': mx = "Yu"; break;
                                    case '+': mx = "Yu"; break;
                                    case '.': mx = "Yu"; break;
                                    case '!': mx = "Yu"; break;
                                    case '?': mx = "Yu"; break;
                                    case '*': mx = "Yu"; break;
                                    case ',': mx = "Yu"; break;
                                    case '-': mx = "Yu"; break;
                                    case '_': mx = "Yu"; break;
                                    case '=': mx = "Yu"; break;
                                    case '(': mx = "Yu"; break;
                                    case ')': mx = "Yu"; break;
                                    case '[': mx = "Yu"; break;
                                    case ']': mx = "Yu"; break;
                                    case '{': mx = "Yu"; break;
                                    case '}': mx = "Yu"; break;
                                    case '/': mx = "Yu"; break;
                                    case '"': mx = "Yu"; break;
                                    case '\\': mx = "Yu"; break;
                                    case '\n': mx = "Yu"; break;
                                    default: mx = "U"; break;
                                }
                            }
                            else mx = "Yu"; break;*/
                        case 'Я':
                            mx = "Ya"; break;
                            /*if (i > 0)
                            {
                                switch (tekst[i - 1])
                                {
                                    case 'А': mx = "Ya"; break;
                                    case 'Э': mx = "Ya"; break;
                                    case 'И': mx = "Ya"; break;
                                    case 'О': mx = "Ya"; break;
                                    case 'У': mx = "Ya"; break;
                                    case 'Ў': mx = "Ya"; break;
                                    case 'Е': mx = "Ya"; break;
                                    case 'Ю': mx = "Ya"; break;
                                    case 'Я': mx = "Ya"; break;
                                    case 'а': mx = "Ya"; break;
                                    case 'э': mx = "Ya"; break;
                                    case 'и': mx = "Ya"; break;
                                    case 'о': mx = "Ya"; break;
                                    case 'у': mx = "Ya"; break;
                                    case 'ў': mx = "Ya"; break;
                                    case 'е': mx = "Ya"; break;
                                    case 'ю': mx = "Ya"; break;
                                    case 'я': mx = "Ya"; break;
                                    case ' ': mx = "Ya"; break;
                                    case '@': mx = "Ya"; break;
                                    case '$': mx = "Ya"; break;
                                    case '|': mx = "Ya"; break;
                                    case '~': mx = "Ya"; break;
                                    case '&': mx = "Ya"; break;
                                    case ':': mx = "Ya"; break;
                                    case ';': mx = "Ya"; break;
                                    case '#': mx = "Ya"; break;
                                    case '+': mx = "Ya"; break;
                                    case '.': mx = "Ya"; break;
                                    case '!': mx = "Ya"; break;
                                    case '?': mx = "Ya"; break;
                                    case '*': mx = "Ya"; break;
                                    case ',': mx = "Ya"; break;
                                    case '-': mx = "Ya"; break;
                                    case '_': mx = "Ya"; break;
                                    case '=': mx = "Ya"; break;
                                    case '(': mx = "Ya"; break;
                                    case ')': mx = "Ya"; break;
                                    case '[': mx = "Ya"; break;
                                    case ']': mx = "Ya"; break;
                                    case '{': mx = "Ya"; break;
                                    case '}': mx = "Ya"; break;
                                    case '/': mx = "Ya"; break;
                                    case '"': mx = "Ya"; break;
                                    case '\\': mx = "Ya"; break;
                                    case '\n': mx = "Ya"; break;
                                    default: mx = "A"; break;
                                }
                            }
                            else mx = "Ya"; break;*/
                        case 'Ё':
                            mx = "Yo"; break;
                            /*if (i > 0)
                            {
                                switch (tekst[i - 1])
                                {
                                    case 'А': mx = "Yo"; break;
                                    case 'Э': mx = "Yo"; break;
                                    case 'И': mx = "Yo"; break;
                                    case 'О': mx = "Yo"; break;
                                    case 'У': mx = "Yo"; break;
                                    case 'Ў': mx = "Yo"; break;
                                    case 'Е': mx = "Yo"; break;
                                    case 'Ю': mx = "Yo"; break;
                                    case 'Я': mx = "Yo"; break;
                                    case 'а': mx = "Yo"; break;
                                    case 'э': mx = "Yo"; break;
                                    case 'и': mx = "Yo"; break;
                                    case 'о': mx = "Yo"; break;
                                    case 'у': mx = "Yo"; break;
                                    case 'ў': mx = "Yo"; break;
                                    case 'е': mx = "Yo"; break;
                                    case 'ю': mx = "Yo"; break;
                                    case 'я': mx = "Yo"; break;
                                    case 'ъ': mx = "Yo"; break;
                                    case ' ': mx = "Yo"; break;
                                    case '@': mx = "Yo"; break;
                                    case '$': mx = "Yo"; break;
                                    case '|': mx = "Yo"; break;
                                    case '~': mx = "Yo"; break;
                                    case '&': mx = "Yo"; break;
                                    case ':': mx = "Yo"; break;
                                    case ';': mx = "Yo"; break;
                                    case '#': mx = "Yo"; break;
                                    case '+': mx = "Yo"; break;
                                    case '.': mx = "Yo"; break;
                                    case '!': mx = "Yo"; break;
                                    case '?': mx = "Yo"; break;
                                    case '*': mx = "Yo"; break;
                                    case ',': mx = "Yo"; break;
                                    case '-': mx = "Yo"; break;
                                    case '_': mx = "Yo"; break;
                                    case '=': mx = "Yo"; break;
                                    case '(': mx = "Yo"; break;
                                    case ')': mx = "Yo"; break;
                                    case '[': mx = "Yo"; break;
                                    case ']': mx = "Yo"; break;
                                    case '{': mx = "Yo"; break;
                                    case '}': mx = "Yo"; break;
                                    case '/': mx = "Yo"; break;
                                    case '"': mx = "Yo"; break;
                                    case '\\': mx = "Yo"; break;
                                    case '\n': mx = "Yo"; break;
                                    default: mx = "O"; break;
                                }
                            }
                            else mx = "Yo"; break;*/

                        case 'а': sym = 'a'; break;
                        case 'б': sym = 'b'; break;
                        case 'д': sym = 'd'; break;
                        case 'э': sym = 'e'; break;
                        case 'ф': sym = 'f'; break;
                        case 'г': sym = 'g'; break;
                        case 'ҳ': sym = 'h'; break;
                        case 'и': sym = 'i'; break;
                        case 'ж': sym = 'j'; break;
                        case 'к': sym = 'k'; break;
                        case 'л': sym = 'l'; break;
                        case 'м': sym = 'm'; break;
                        case 'н': sym = 'n'; break;
                        case 'о': sym = 'o'; break;
                        case 'п': sym = 'p'; break;
                        case 'қ': sym = 'q'; break;
                        case 'р': sym = 'r'; break;
                        case 'с':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'Ҳ': mx = "sʼ"; break;
                                case 'ҳ': mx = "sʼ"; break;
                                default: sym = 's'; break;
                            }
                            break;
                        case 'т': sym = 't'; break;
                        case 'у': sym = 'u'; break;
                        case 'в': sym = 'v'; break;
                        case 'х': sym = 'x'; break;
                        case 'й': sym = 'y'; break;
                        case 'з': sym = 'z'; break;
                        case 'ў': mx = "oʻ"; break;
                        case 'ғ': mx = "gʻ"; break;
                        case 'ш': mx = "sh"; break;
                        case 'ч': mx = "ch"; break;
                        case 'ц':
                            if (i > 0)
                            {
                                switch (tekst.charAt(i - 1))
                                {
                                    case 'А': mx = "ts"; break;
                                    case 'Э': mx = "ts"; break;
                                    case 'И': mx = "ts"; break;
                                    case 'О': mx = "ts"; break;
                                    case 'У': mx = "ts"; break;
                                    case 'Ў': mx = "ts"; break;
                                    case 'Е': mx = "ts"; break;
                                    case 'Ю': mx = "ts"; break;
                                    case 'Я': mx = "ts"; break;
                                    case 'а': mx = "ts"; break;
                                    case 'э': mx = "ts"; break;
                                    case 'и': mx = "ts"; break;
                                    case 'о': mx = "ts"; break;
                                    case 'у': mx = "ts"; break;
                                    case 'ў': mx = "ts"; break;
                                    case 'е': mx = "ts"; break;
                                    case 'ю': mx = "ts"; break;
                                    case 'я': mx = "ts"; break;
                                    default: mx = "s"; break;
                                }
                            }
                            else mx = "s"; break;
                        case 'е':
                            if (i > 0)
                            {
                                switch (tekst.charAt(i - 1))
                                {
                                    case 'А': mx = "ye"; break;
                                    case 'Э': mx = "ye"; break;
                                    case 'И': mx = "ye"; break;
                                    case 'О': mx = "ye"; break;
                                    case 'У': mx = "ye"; break;
                                    case 'Ў': mx = "ye"; break;
                                    case 'Е': mx = "ye"; break;
                                    case 'Ю': mx = "ye"; break;
                                    case 'Я': mx = "ye"; break;
                                    case 'а': mx = "ye"; break;
                                    case 'э': mx = "ye"; break;
                                    case 'и': mx = "ye"; break;
                                    case 'о': mx = "ye"; break;
                                    case 'у': mx = "ye"; break;
                                    case 'ў': mx = "ye"; break;
                                    case 'е': mx = "ye"; break;
                                    case 'ю': mx = "ye"; break;
                                    case 'я': mx = "ye"; break;
                                    case 'ъ': mx = "ye"; break;
                                    case 'ь': mx = "ye"; break;
                                    case 'Ъ': mx = "ye"; break;
                                    case 'Ь': mx = "ye"; break;
                                    case ' ': mx = "ye"; break;
                                    case '@': mx = "ye"; break;
                                    case '$': mx = "ye"; break;
                                    case '|': mx = "ye"; break;
                                    case '~': mx = "ye"; break;
                                    case '&': mx = "ye"; break;
                                    case ':': mx = "ye"; break;
                                    case ';': mx = "ye"; break;
                                    case '#': mx = "ye"; break;
                                    case '+': mx = "ye"; break;
                                    case '.': mx = "ye"; break;
                                    case '!': mx = "ye"; break;
                                    case '?': mx = "ye"; break;
                                    case '*': mx = "ye"; break;
                                    case ',': mx = "ye"; break;
                                    case '-': mx = "ye"; break;
                                    case '_': mx = "ye"; break;
                                    case '=': mx = "ye"; break;
                                    case '(': mx = "ye"; break;
                                    case ')': mx = "ye"; break;
                                    case '[': mx = "ye"; break;
                                    case ']': mx = "ye"; break;
                                    case '{': mx = "ye"; break;
                                    case '}': mx = "ye"; break;
                                    case '/': mx = "ye"; break;
                                    case '"': mx = "ye"; break;
                                    case '\\': mx = "ye"; break;
                                    case '\n': mx = "ye"; break;
                                    default: mx = "e"; break;
                                }
                            }
                            else mx = "ye"; break;
                        case 'ю':
                            mx = "yu"; break;
                            /*if (i > 0)
                            {
                                switch (tekst[i - 1])
                                {
                                    case 'А': mx = "yu"; break;
                                    case 'Э': mx = "yu"; break;
                                    case 'И': mx = "yu"; break;
                                    case 'О': mx = "yu"; break;
                                    case 'У': mx = "yu"; break;
                                    case 'Ў': mx = "yu"; break;
                                    case 'Е': mx = "yu"; break;
                                    case 'Ю': mx = "yu"; break;
                                    case 'Я': mx = "yu"; break;
                                    case 'а': mx = "yu"; break;
                                    case 'э': mx = "yu"; break;
                                    case 'и': mx = "yu"; break;
                                    case 'о': mx = "yu"; break;
                                    case 'у': mx = "yu"; break;
                                    case 'ў': mx = "yu"; break;
                                    case 'е': mx = "yu"; break;
                                    case 'ю': mx = "yu"; break;
                                    case 'я': mx = "yu"; break;
                                    case ' ': mx = "yu"; break;
                                    case '@': mx = "yu"; break;
                                    case '$': mx = "yu"; break;
                                    case '|': mx = "yu"; break;
                                    case '~': mx = "yu"; break;
                                    case '&': mx = "yu"; break;
                                    case ':': mx = "yu"; break;
                                    case ';': mx = "yu"; break;
                                    case '#': mx = "yu"; break;
                                    case '+': mx = "yu"; break;
                                    case '.': mx = "yu"; break;
                                    case '!': mx = "yu"; break;
                                    case '?': mx = "yu"; break;
                                    case '*': mx = "yu"; break;
                                    case ',': mx = "yu"; break;
                                    case '-': mx = "yu"; break;
                                    case '_': mx = "yu"; break;
                                    case '=': mx = "yu"; break;
                                    case '(': mx = "yu"; break;
                                    case ')': mx = "yu"; break;
                                    case '[': mx = "yu"; break;
                                    case ']': mx = "yu"; break;
                                    case '{': mx = "yu"; break;
                                    case '}': mx = "yu"; break;
                                    case '/': mx = "yu"; break;
                                    case '"': mx = "yu"; break;
                                    case '\\': mx = "yu"; break;
                                    case '\n': mx = "yu"; break;
                                    default: mx = "u"; break;
                                }
                            }
                            else mx = "yu"; break;*/
                        case 'я':
                            mx = "ya"; break;
                            /*if (i > 0)
                            {
                                switch (tekst[i - 1])
                                {
                                    case 'А': mx = "ya"; break;
                                    case 'Э': mx = "ya"; break;
                                    case 'И': mx = "ya"; break;
                                    case 'О': mx = "ya"; break;
                                    case 'У': mx = "ya"; break;
                                    case 'Ў': mx = "ya"; break;
                                    case 'Е': mx = "ya"; break;
                                    case 'Ю': mx = "ya"; break;
                                    case 'Я': mx = "ya"; break;
                                    case 'а': mx = "ya"; break;
                                    case 'э': mx = "ya"; break;
                                    case 'и': mx = "ya"; break;
                                    case 'о': mx = "ya"; break;
                                    case 'у': mx = "ya"; break;
                                    case 'ў': mx = "ya"; break;
                                    case 'е': mx = "ya"; break;
                                    case 'ю': mx = "ya"; break;
                                    case 'я': mx = "ya"; break;
                                    case ' ': mx = "ya"; break;
                                    case '@': mx = "ya"; break;
                                    case '$': mx = "ya"; break;
                                    case '|': mx = "ya"; break;
                                    case '~': mx = "ya"; break;
                                    case '&': mx = "ya"; break;
                                    case ':': mx = "ya"; break;
                                    case ';': mx = "ya"; break;
                                    case '#': mx = "ya"; break;
                                    case '+': mx = "ya"; break;
                                    case '.': mx = "ya"; break;
                                    case '!': mx = "ya"; break;
                                    case '?': mx = "ya"; break;
                                    case '*': mx = "ya"; break;
                                    case ',': mx = "ya"; break;
                                    case '-': mx = "ya"; break;
                                    case '_': mx = "ya"; break;
                                    case '=': mx = "ya"; break;
                                    case '(': mx = "ya"; break;
                                    case ')': mx = "ya"; break;
                                    case '[': mx = "ya"; break;
                                    case ']': mx = "ya"; break;
                                    case '{': mx = "ya"; break;
                                    case '}': mx = "ya"; break;
                                    case '/': mx = "ya"; break;
                                    case '"': mx = "ya"; break;
                                    case '\\': mx = "ya"; break;
                                    case '\n': mx = "ya"; break;
                                    default: mx = "a"; break;
                                }
                            }
                            else mx = "ya"; break;*/
                        case 'ё':
                            mx = "yo"; break;
                            /*if (i > 0)
                            {
                                switch (tekst[i - 1])
                                {
                                    case 'А': mx = "yo"; break;
                                    case 'Э': mx = "yo"; break;
                                    case 'И': mx = "yo"; break;
                                    case 'О': mx = "yo"; break;
                                    case 'У': mx = "yo"; break;
                                    case 'Ў': mx = "yo"; break;
                                    case 'Е': mx = "yo"; break;
                                    case 'Ю': mx = "yo"; break;
                                    case 'Я': mx = "yo"; break;
                                    case 'а': mx = "yo"; break;
                                    case 'э': mx = "yo"; break;
                                    case 'и': mx = "yo"; break;
                                    case 'о': mx = "yo"; break;
                                    case 'у': mx = "yo"; break;
                                    case 'ў': mx = "yo"; break;
                                    case 'е': mx = "yo"; break;
                                    case 'ю': mx = "yo"; break;
                                    case 'я': mx = "yo"; break;
                                    case ' ': mx = "yo"; break;
                                    case '@': mx = "yo"; break;
                                    case '$': mx = "yo"; break;
                                    case '|': mx = "yo"; break;
                                    case '~': mx = "yo"; break;
                                    case '&': mx = "yo"; break;
                                    case ':': mx = "yo"; break;
                                    case ';': mx = "yo"; break;
                                    case '#': mx = "yo"; break;
                                    case '+': mx = "yo"; break;
                                    case '.': mx = "yo"; break;
                                    case '!': mx = "yo"; break;
                                    case '?': mx = "yo"; break;
                                    case '*': mx = "yo"; break;
                                    case ',': mx = "yo"; break;
                                    case '-': mx = "yo"; break;
                                    case '_': mx = "yo"; break;
                                    case '=': mx = "yo"; break;
                                    case '(': mx = "yo"; break;
                                    case ')': mx = "yo"; break;
                                    case '[': mx = "yo"; break;
                                    case ']': mx = "yo"; break;
                                    case '{': mx = "yo"; break;
                                    case '}': mx = "yo"; break;
                                    case '/': mx = "yo"; break;
                                    case '"': mx = "yo"; break;
                                    case '\\': mx = "yo"; break;
                                    case '\n': mx = "yo"; break;
                                    default: mx = "o"; break;
                                }
                            }
                            else mx = "yo"; break;*/

                        case 'ъ': sym = 'ʼ'; break;
                        case 'ь': sym = 'ʼ'; break;
                    }
                    if (mx == "")
                    {
                        ltekst += sym;
                    }
                    else
                    {
                        ltekst += mx;
                    }
                }
                return ltekst.trim();
            }
        }
        catch (Exception e)
        {
            return "Dasturda xatolik yuz berdi. Dasturchiga murojaat qiling!";
        }
        return "ABC";
    }
}
