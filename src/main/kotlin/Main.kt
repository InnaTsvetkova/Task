
class Task(val name: String)

//Добавление задач
fun AddTask( list : ArrayList<Task>) {
    println("Введите задачу: ")
    val input = readLine()!!
    val task: Task = Task(input)
    list.add(task)
}

//Вывести все задачи на экран
fun ReadTask(list: ArrayList<Task>)
{
    println("Ваши задачи:")
    for (task in list) {println(task.name)}
}

//Удаление задачи
fun DeleteTask(list : ArrayList<Task>) {

    println("Какую задачу вы хотите удалить?")
    var line = readLine()

    var task: Task? = list.find { item -> line == item.name }
    list.remove(task)

    println("Задача удалена!")
}

fun main(args: Array<String>) {
    val tasks : ArrayList<Task> = arrayListOf()

    if (tasks.size == 0){println("На данный момент в списке задач нет.")}

    while (true)
    {
        println("Чтобы добавить задачу, нажмите 1, удалить - 2, просмотреть задачи - 3: ")
        val doing = readLine()!!.toInt()

        if (doing == 1)
        {AddTask(tasks)}

        else if (doing == 2)
        {DeleteTask(tasks)}

        else if (doing == 3)
        {ReadTask(tasks)}

        else
        {println("Некорректный ввод")}
    }
}