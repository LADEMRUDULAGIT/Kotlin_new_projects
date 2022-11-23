package com.axis.service
import EmployeeUtil
import com.axis.modal.Employee
//in service call we write the business logic
class EmployeeService {
    var employeeUtil=EmployeeUtil()
    fun addEmployee():String{
        employeeUtil.employeeList().add(Employee(3,"giri",200000))
        return "employee added"
    }
    fun displayEmployeeCollection(){
        println("====employee info in collection======")
        println("id      name       salary")
        var listofemployees=employeeUtil.employeeList()
        for(emp in listofemployees){
            println("${emp.id}      ${emp.name}     ${emp.salary}")
        }
    }
    fun displayEmployeeDetails(employee: Employee) {
        println("====employee info======")
        println("id = ${employee.id}")
        println("name = ${employee.name}")
        println("salary =${employee.salary}")
    }
}