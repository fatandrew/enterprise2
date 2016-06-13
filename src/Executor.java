import com.sun.javafx.tk.Toolkit;
import com.sun.jmx.snmp.tasks.Task;
import sun.security.validator.Validator;

import java.util.List;

/**
 * Created by User on 04.06.2016.
 */


public interface Executor<E> extends Iterable<E>{

    // Добавить таск на выполнение. Результат таска будет доступен через метод getValidResults().
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(Toolkit.Task task);

    // Добавить таск на выполнение и валидатор результата. Результат таска будет записан в ValidResults если validator.isValid вернет true для этого результата
    // Результат таска будет записан в InvalidResults если validator.isValid вернет false для этого результата
    // Бросает Эксепшн если уже был вызван метод execute()
    void addTask(E task, E validator);

    // Выполнить все добавленые таски
    void  execute();
E getResult();

    // Получить валидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<E> getValidResults();

    // Получить невалидные результаты. Бросает Эксепшн если не был вызван метод execute()
    List<E> getInvalidResults();

}