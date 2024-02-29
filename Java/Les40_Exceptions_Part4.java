package Java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Les40_Exceptions_Part4 {
    public static void main(String[] args) {
        //Урок 40: Исключения (часть 4).
        try {
            run();
        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);

        }catch (Exception e ){

        }
    }
    //Можно выбрасывать сколько угодно исключений, и их соответственно либо нужно добавить в
    //сигнатуру или обработать. Если исключения будут обрабатываться по-разному, то нужно будет
    //прописать реализацию обработки для каждого исключения. Если все исключения будут
    //обрабатываться одинаково можно воспользоваться multi catch, для этого нужно в блоке catch
    //перечислить исключения через | и прописать реализацию обработки для исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {


        //Поскольку Exception класс родитель для всех исключений, можно обработать и его,
        //соответственно все исключения будут обработаны, как и Exception, поскольку все наследуют от
        //него. Следовательно, последующая обработка других исключений после обработки Exception
        //бессмысленна и приведет к ошибке, поскольку все исключения уже были обработаны в Exception
    }
}
