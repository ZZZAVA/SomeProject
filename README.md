# SomeProject
http4s+slick+docker+2 object


It remains to deal with the tapir. 
Problem with foreign keys, but solved the problem with a weak crutch. 

====================================================================

Task below



{RU}
Входные данные: 
2 бизнес объекта\модели, например: организации и сотрудники, у каждого сотрудника есть организация

Что требуется сделать:
Поднять http rest сервер используя scala библиотеки (play или http4s + tapir)
Для работы с БД использовать slick или  doobie
Реализовать CRUD API для всех бизнес объектов
Реализовать API для получения всего списка сотрудников и организация, сортировка по наименованию.

Примечания:
Желательно добавить swagger документацию (tapir это умеет делать)
Если frontend также интересует - можно добавить простой front для angular/react.


======================================================================
Steps:
1.Run docker in project package
2.In "main" run def main
3.Run server

links for requests:

localhost:8080 //Get worklist(id,CompanyId, EmployeeId)

localhost:8080/employee //Get employee(id,name)

localhost:8080/company  //Get company(id,company)


Query results are output to the Server terminal


==============================THE END=================================
