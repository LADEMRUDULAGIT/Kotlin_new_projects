package com.axis.app
import com.axis.modal.Employee
import com.axis.service.EmployeeService
fun main(args: Array<String>) {
    var employeeService=EmployeeService()
    println("===employee app====")
    var employee=Employee(1,"sourab",45000)
    employeeService.displayEmployeeDetails(employee)
    println(employeeService.addEmployee())
    employeeService.displayEmployeeCollection()
}