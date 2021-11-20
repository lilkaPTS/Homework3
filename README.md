# Homework3

##Задача: 
* Разработать пользовательскую структуру данных MyLinkedList

##Комментарии:
>С разработкой пользовательской структуры я справился успешно. Была
> проведена проверка основного функционала в классе
> "TestMainFunctionality". Переходя ко второй части домашнего задания, а
> именно к тестированию производительности я столкнулся с проблемой,
> замеряя время с помощью System.nanoTime() или любым другим подобным инструментом,
> значения получались некорректные для следующих после первой структур
> данных, это происходило потому что я не изолировал работу с коллекциями друг от друга, поэтому при 
> переходе к следующим после первой коллекциям не могло гарантироваться как минимум отработка сборщика
> мусора который при таких объемах данных съедает ощутимую часть времени. Вроде как я нашёл, как правильно
> тестировать производительность кода с помощью JMH, но для работы с ним потребуется как минимум сборщик
> проекта, поэтому эту идею я откинул. Подумал про отделение этих операций с помощью создания разных потоков, но
> потом вспомнил, что тестируемые структуры данных не потокобезопасны и я подумал, что особой разницы, как костылять
> нет, поэтому решил отделить работу с каждой коллекцией с помощью switch. В плане юзабилити получилось не очень, так
> как для проверки результатов надо всегда перезапускать программу и выбирать нужный пункт, зато результат, выдаваемый
> моими тестами достоверен. Это было объяснение, почему класс "TestPerformance" такой некрасивый, странный и тд.
##Выводы:
1. Пользовательская струкрута данных была разработана, для тестирования основного функционала

