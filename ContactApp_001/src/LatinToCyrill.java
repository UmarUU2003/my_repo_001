public class LatinToCyrill {
    private LatinToCyrill(){}
    public static String latinToCyrill(String vtekst){
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
                        case 'A': sym = 'А'; break;
                        case 'B': sym = 'Б'; break;
                        case 'C':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'H': mx = "Ч"; i++; break;
                                case 'h': mx = "Ч"; i++; break;
                                default: sym = 'С'; break;
                            }
                            break;
                        case 'D': sym = 'Д'; break;
                        case 'E':
                            if (i > 0)
                            {
                                switch (tekst.charAt(i - 1))
                                {
                                    case 'B': mx = "Е"; break;
                                    case 'b': mx = "Е"; break;
                                    case 'D': mx = "Е"; break;
                                    case 'd': mx = "Е"; break;
                                    case '\'': mx = "Е"; break;
                                    case '`': mx = "Е"; break;
                                    case 'F': mx = "Е"; break;
                                    case 'f': mx = "Е"; break;
                                    case 'G': mx = "Е"; break;
                                    case 'g': mx = "Е"; break;
                                    case 'H': mx = "Е"; break;
                                    case 'h': mx = "Е"; break;
                                    case 'J': mx = "Е"; break;
                                    case 'j': mx = "Е"; break;
                                    case 'K': mx = "Е"; break;
                                    case 'k': mx = "Е"; break;
                                    case 'L': mx = "Е"; break;
                                    case 'l': mx = "Е"; break;
                                    case 'M': mx = "Е"; break;
                                    case 'm': mx = "Е"; break;
                                    case 'N': mx = "Е"; break;
                                    case 'n': mx = "Е"; break;
                                    case 'P': mx = "Е"; break;
                                    case 'p': mx = "Е"; break;
                                    case 'Q': mx = "Е"; break;
                                    case 'q': mx = "Е"; break;
                                    case 'R': mx = "Е"; break;
                                    case 'r': mx = "Е"; break;
                                    case 'S': mx = "Е"; break;
                                    case 's': mx = "Е"; break;
                                    case 'T': mx = "Е"; break;
                                    case 't': mx = "Е"; break;
                                    case 'U': mx = "Е"; break;
                                    case 'u': mx = "Е"; break;
                                    case 'V': mx = "Е"; break;
                                    case 'v': mx = "Е"; break;
                                    case 'X': mx = "Е"; break;
                                    case 'x': mx = "Е"; break;
                                    case 'Z': mx = "Е"; break;
                                    case 'z': mx = "Е"; break;
                                    case 'ғ': mx = "Е"; break;
                                    case 'Ҳ': mx = "Е"; break;
                                    case 'ҳ': mx = "Е"; break;
                                    case 'ʼ': mx = "Е"; break;
                                    case '´': mx = "Е"; break;
                                    case 'ʹ': mx = "Е"; break;
                                    case 'ʻ': mx = "Е"; break;
                                    case 'ʽ': mx = "Е"; break;
                                    case 'ˈ': mx = "Е"; break;
                                    case '’': mx = "Е"; break;
                                    default: sym = 'Э'; break;
                                }
                            }
                            else { mx = "Э"; }
                            break;
                        case 'F': sym = 'Ф'; break;
                        case 'G':
                            switch (tekst.charAt(i + 1))
                            {
                                case '`': mx = "Ғ"; i++; break;
                                case '\'': mx = "Ғ"; i++; break;
                                case '´': mx = "Ғ"; i++; break;
                                case 'ʹ': mx = "Ғ"; i++; break;
                                case 'ʻ': mx = "Ғ"; i++; break;
                                case 'ʼ': mx = "Ғ"; i++; break;
                                case 'ʽ': mx = "Ғ"; i++; break;
                                case 'ˈ': mx = "Ғ"; i++; break;
                                case '’': mx = "Ғ"; i++; break;
                                default: sym = 'Г'; break;
                            }
                            break;
                        case 'H': sym = 'Ҳ'; break;
                        case 'I': sym = 'И'; break;
                        case 'J': sym = 'Ж'; break;
                        case 'K': sym = 'К'; break;
                        case 'L': sym = 'Л'; break;
                        case 'M': sym = 'М'; break;
                        case 'N': sym = 'Н'; break;
                        case 'O':
                            switch (tekst.charAt(i + 1))
                            {
                                case '`': mx = "Ў"; i++; break;
                                case '\'': mx = "Ў"; i++; break;
                                case '´': mx = "Ў"; i++; break;
                                case 'ʹ': mx = "Ў"; i++; break;
                                case 'ʻ': mx = "Ў"; i++; break;
                                case 'ʼ': mx = "Ў"; i++; break;
                                case 'ʽ': mx = "Ў"; i++; break;
                                case 'ˈ': mx = "Ў"; i++; break;
                                case '’': mx = "Ў"; i++; break;
                                default: sym = 'О'; break;
                            }
                            break;
                        case 'P': sym = 'П'; break;
                        case 'Q': sym = 'Қ'; break;
                        case 'R': sym = 'Р'; break;
                        case 'S':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'H': mx = "Ш"; i++; break;
                                case 'h': mx = "Ш"; i++; break;
                                case '`':
                                case '\'':
                                case '´':
                                case 'ʹ':
                                case 'ʻ':
                                case 'ʼ':
                                case 'ʽ':
                                case 'ˈ':
                                case '’':
                                    if (tekst.charAt(i + 2) == 'H' || tekst.charAt(i + 2) == 'h') { mx = "С"; i++; } else { mx = "С"; }
                                    break;
                                default: sym = 'С'; break;
                            }
                            break;
                        case 'T':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'S': mx = "Ц"; i++; break;
                                case 's': mx = "Ц"; i++; break;
                                default: sym = 'Т'; break;
                            }
                            break;
                        case 'U': sym = 'У'; break;
                        case 'V': sym = 'В'; break;
                        case 'X': sym = 'Х'; break;
                        case 'Y':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'E': mx = "Е"; i++; break;
                                case 'e': mx = "Е"; i++; break;
                                case 'U': mx = "Ю"; i++; break;
                                case 'u': mx = "Ю"; i++; break;
                                case 'A': mx = "Я"; i++; break;
                                case 'a': mx = "Я"; i++; break;
                                case 'O':
                                    boolean ooo = true;
                                    switch (tekst.charAt(i + 2))
                                    {
                                        case '`': ooo = false; break;
                                        case '\'': ooo = false; break;
                                        case '´': ooo = false; break;
                                        case 'ʹ': ooo = false; break;
                                        case 'ʻ': ooo = false; break;
                                        case 'ʼ': ooo = false; break;
                                        case 'ʽ': ooo = false; break;
                                        case 'ˈ': ooo = false; break;
                                        case '’': ooo = false; break;
                                        default: ooo = true; break;
                                    }
                                    if (ooo) { mx = "Ё"; i++; }
                                    else mx = "Й"; break;
                                case 'o':
                                    ooo = true;
                                    switch (tekst.charAt(i + 2))
                                    {
                                        case '`': ooo = false; break;
                                        case '\'': ooo = false; break;
                                        case '´': ooo = false; break;
                                        case 'ʹ': ooo = false; break;
                                        case 'ʻ': ooo = false; break;
                                        case 'ʼ': ooo = false; break;
                                        case 'ʽ': ooo = false; break;
                                        case 'ˈ': ooo = false; break;
                                        case '’': ooo = false; break;
                                        default: ooo = true; break;
                                    }
                                    if (ooo) { mx = "Ё"; i++; }
                                    else mx = "Й"; break;
                                default: sym = 'Й'; break;
                            }
                            break;
                        case 'Z': sym = 'З'; break;

                        case 'a': sym = 'а'; break;
                        case 'b': sym = 'б'; break;
                        case 'c':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'H': mx = "ч"; i++; break;
                                case 'h': mx = "ч"; i++; break;
                                default: sym = 'с'; break;
                            }
                            break;
                        case 'd': sym = 'д'; break;
                        case 'e':
                            if (i > 0)
                            {
                                switch (tekst.charAt(i - 1))
                                {
                                    case 'B': mx = "е"; break;
                                    case 'b': mx = "е"; break;
                                    case 'D': mx = "е"; break;
                                    case 'd': mx = "е"; break;
                                    case '\'': mx = "е"; break;
                                    case '`': mx = "е"; break;
                                    case 'F': mx = "е"; break;
                                    case 'f': mx = "е"; break;
                                    case 'G': mx = "е"; break;
                                    case 'g': mx = "е"; break;
                                    case 'H': mx = "е"; break;
                                    case 'h': mx = "е"; break;
                                    case 'J': mx = "е"; break;
                                    case 'j': mx = "е"; break;
                                    case 'K': mx = "е"; break;
                                    case 'k': mx = "е"; break;
                                    case 'L': mx = "е"; break;
                                    case 'l': mx = "е"; break;
                                    case 'M': mx = "е"; break;
                                    case 'm': mx = "е"; break;
                                    case 'N': mx = "е"; break;
                                    case 'n': mx = "е"; break;
                                    case 'P': mx = "е"; break;
                                    case 'p': mx = "е"; break;
                                    case 'Q': mx = "е"; break;
                                    case 'q': mx = "е"; break;
                                    case 'R': mx = "е"; break;
                                    case 'r': mx = "е"; break;
                                    case 'S': mx = "е"; break;
                                    case 's': mx = "е"; break;
                                    case 'T': mx = "е"; break;
                                    case 't': mx = "е"; break;
                                    case 'U': mx = "е"; break;
                                    case 'u': mx = "е"; break;
                                    case 'V': mx = "е"; break;
                                    case 'v': mx = "е"; break;
                                    case 'X': mx = "е"; break;
                                    case 'x': mx = "е"; break;
                                    case 'Z': mx = "е"; break;
                                    case 'z': mx = "е"; break;
                                    case 'ғ': mx = "е"; break;
                                    case 'Ҳ': mx = "е"; break;
                                    case 'ҳ': mx = "е"; break;
                                    case 'ʼ': mx = "е"; break;
                                    case '´': mx = "е"; break;
                                    case 'ʹ': mx = "е"; break;
                                    case 'ʻ': mx = "е"; break;
                                    case 'ʽ': mx = "е"; break;
                                    case 'ˈ': mx = "е"; break;
                                    case '’': mx = "е"; break;
                                    default: sym = 'э'; break;
                                }
                            }
                            else { mx = "э"; }
                            break;
                        case 'f': sym = 'ф'; break;
                        case 'g':
                            switch (tekst.charAt(i + 1))
                            {
                                case '`': mx = "ғ"; i++; break;
                                case '\'': mx = "ғ"; i++; break;
                                case '´': mx = "ғ"; i++; break;
                                case 'ʹ': mx = "ғ"; i++; break;
                                case 'ʻ': mx = "ғ"; i++; break;
                                case 'ʼ': mx = "ғ"; i++; break;
                                case 'ʽ': mx = "ғ"; i++; break;
                                case 'ˈ': mx = "ғ"; i++; break;
                                case '’': mx = "ғ"; i++; break;
                                default: sym = 'г'; break;
                            }
                            break;
                        case 'h': sym = 'ҳ'; break;
                        case 'i': sym = 'и'; break;
                        case 'j': sym = 'ж'; break;
                        case 'k': sym = 'к'; break;
                        case 'l': sym = 'л'; break;
                        case 'm': sym = 'м'; break;
                        case 'n': sym = 'н'; break;
                        case 'o':
                            switch (tekst.charAt(i + 1))
                            {
                                case '`': mx = "ў"; i++; break;
                                case '\'': mx = "ў"; i++; break;
                                case '´': mx = "ў"; i++; break;
                                case 'ʹ': mx = "ў"; i++; break;
                                case 'ʻ': mx = "ў"; i++; break;
                                case 'ʼ': mx = "ў"; i++; break;
                                case 'ʽ': mx = "ў"; i++; break;
                                case 'ˈ': mx = "ў"; i++; break;
                                case '’': mx = "ў"; i++; break;
                                default: sym = 'о'; break;
                            }
                            break;
                        case 'p': sym = 'п'; break;
                        case 'q': sym = 'қ'; break;
                        case 'r': sym = 'р'; break;
                        case 's':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'H': mx = "ш"; i++; break;
                                case 'h': mx = "ш"; i++; break;
                                case '`':
                                case '\'':
                                case '´':
                                case 'ʹ':
                                case 'ʻ':
                                case 'ʼ':
                                case 'ʽ':
                                case 'ˈ':
                                case '’':
                                    if (tekst.charAt(i + 2) == 'H' || tekst.charAt(i + 2) == 'h') { mx = "с"; i++; } else { mx = "с"; }
                                    break;
                                default: sym = 'с'; break;
                            }
                            break;
                        case 't':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'S': mx = "ц"; i++; break;
                                case 's': mx = "ц"; i++; break;
                                default: sym = 'т'; break;
                            }
                            break;
                        case 'u': sym = 'у'; break;
                        case 'v': sym = 'в'; break;
                        case 'x': sym = 'х'; break;
                        case 'y':
                            switch (tekst.charAt(i + 1))
                            {
                                case 'E': mx = "е"; i++; break;
                                case 'e': mx = "е"; i++; break;
                                case 'U': mx = "ю"; i++; break;
                                case 'u': mx = "ю"; i++; break;
                                case 'A': mx = "я"; i++; break;
                                case 'a': mx = "я"; i++; break;
                                case 'O':
                                    boolean ooo = true;
                                    switch (tekst.charAt(i + 2))
                                    {
                                        case '`': ooo = false; break;
                                        case '\'': ooo = false; break;
                                        case '´': ooo = false; break;
                                        case 'ʹ': ooo = false; break;
                                        case 'ʻ': ooo = false; break;
                                        case 'ʼ': ooo = false; break;
                                        case 'ʽ': ooo = false; break;
                                        case 'ˈ': ooo = false; break;
                                        case '’': ooo = false; break;
                                        default: ooo = true; break;
                                    }
                                    if (ooo) { mx = "ё"; i++; }
                                    else mx = "й"; break;
                                case 'o':
                                    ooo = true;
                                    switch (tekst.charAt(i + 2))
                                    {
                                        case '`': ooo = false; break;
                                        case '\'': ooo = false; break;
                                        case '´': ooo = false; break;
                                        case 'ʹ': ooo = false; break;
                                        case 'ʻ': ooo = false; break;
                                        case 'ʼ': ooo = false; break;
                                        case 'ʽ': ooo = false; break;
                                        case 'ˈ': ooo = false; break;
                                        case '’': ooo = false; break;
                                        default: ooo = true; break;
                                    }
                                    if (ooo) { mx = "ё"; i++; }
                                    else mx = "й"; break;
                                default: sym = 'й'; break;
                            }
                            break;
                        case 'z': sym = 'з'; break;

                        case '\'': sym = 'ъ'; break;
                        case 'ʼ': sym = 'ъ'; break;
                        case '`': sym = 'ъ'; break;
                        case '´': sym = 'ъ'; break;
                        case 'ʹ': sym = 'ъ'; break;
                        case 'ʻ': sym = 'ъ'; break;
                        case 'ʽ': sym = 'ъ'; break;
                        case 'ˈ': sym = 'ъ'; break;
                        case '’': sym = 'ъ'; break;
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
