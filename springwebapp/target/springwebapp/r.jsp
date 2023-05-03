<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 
 <style>legend{
      border: 2px solid black;
      padding: 10px;
      background-color: red;
      color: white;
      border-radius: 0 30px;

    }
    fieldset{
      width:400px;
      margin: 5px auto;
      background-color: aqua;
    }
    form{
      margin-left: 60px;
    }
    input:hover{
      background-color: burlywood;
      border-radius: 0 10px;
    }
    </style>
</head>
<body>
 <fieldset>
    <legend>Registration Form</legend>
  <form action="saveRegisterDetails">
    <table>
        <tr>
            <td><label for="">First Name</label></td>
            <td><input type="text"></td> 
            </tr>
   <tr>
    <td> <label for="">Last Name</label>  </td>
    <td><input type="text"></td>
    </tr>
    <tr>
    <td><label for="">E-mail id</label></td>
    <td> <input type="email"></td>
  </tr>
  <tr>
    <td><label>Password</label></td>
    <td> <input type="password"></td>
  </tr>
  <tr>
    <td><label>Gender</label></td>
    <td> <input type="radio" name="male">Male
     <input type="radio" name="male">Female </td>
  </tr>
  <tr>
    <td><label>DOB</label></td>
    <td><input type="date"></td> 
  </tr>
  <tr>
    <td><label>Age</label></td>
    <td><input type="number"></td>
  </tr>
  <tr>
    <td><label>Mob no</label></td>
    <td><input type="tel"></td>
  </tr>
  <tr>
    <td>Address</td>
      <td><textarea cols="30" rows="7"></textarea></td>
  </tr>
  <tr>
    <td><label>Country</label></td>
    <td><select>
      <option>choose your Country Name</option>
      <option>India</option>
      <option>pakistan</option>
      <option>china</option>
      <option>america</option>
    </select></td>
  </tr>
  <tr>
    <td><label>Hobbies</label></td>
    <td><input type="checkbox">Singing
      <input type="checkbox">Dancing
      <input type="checkbox">Sports
      <input type="checkbox">Instrument
    </td>
  </tr>
  <tr>
    <td>Resume</td>
    <td><input type="file"></td>
  </tr>

  <tr>
    <td><button>Submit</button></td>
    <td><input type="Reset"></td>
  </tr>

</table>
</form>
</fieldset> 
</body>
</html>