import com.axis.modal.Employee

class EmployeeUtil {
    var employees= mutableListOf<Employee>()
    init{
        employees.add(Employee(1,"mrudu",80000))
        employees.add(Employee(2,"sriu",90000))
    }
    fun employeeList():MutableList<Employee>{
        return employees
    }

}