<html>
    <head>
        <title>Home Page</title>
    </head>

<body>
    <h1>Student Form</h1>
    
    
   <form action="addStudent">
     Student Id:<input type="text" name="sid"><br>
      Name:<input type="text" name="name"><br>
    
     <input type="submit">
 </form>
    <h2>Student Display</h2>
   <form action="getStudent">
     Student Id:<input type="text" name="sid"><br>
     <input type="submit">
 </form>
 <h1>Delete Student</h1>
<form action="deleteStudent">
    Student Id: <input type="text" name="sid"><br>
    <input type="submit" value="Delete">
</form>
<h1>Update Student details</h1>
<form action="updStudent">
id:<input type="number" name="Sid"/><br><br>
<input type="submit">

</form>
</body>
</html>