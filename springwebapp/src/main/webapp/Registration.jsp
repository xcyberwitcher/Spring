<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title></title>
  <style><%@include file="css/reg.css"%></style>
</head>
<body>
 <form action="saveRegisterDetails">
      <div class="container">
        <h1>Register</h1>
        <p>Kindly fill in this form to register.</p>
        <label for="name"><b>Name</b></label>
        <input
          type="text"
          placeholder="Enter name"
          name="name"
          id="name"
          required
        />

        <label for="email"><b>Email</b></label>
        <input
          type="text"
          placeholder="Enter Email"
          name="email"
          id="email"
          required
        />

        <label for="number"><b>ContactNumber</b></label>
        <input
          type="text"
          placeholder="Enter Contact Number"
          name="number"
          id="number"
          required
        />
         <label for="gender"><b>Gender</b></label>
        <input
          type="text"
          placeholder="Enter your Gender"
          name="gender"
          id="gender"
          required
        />
        
        <label for="city"><b>City</b></label>
        <input
          type="text"
          placeholder="Enter City"
          name="city"
          id="city"
          required
        />
         <label for="country"><b>Country</b></label>
        <input
          type="text"
          placeholder="Enter Country"
          name="country"
          id="country"
          required
        />
         <label for="pincode"><b>PinCode</b></label>
        <input
          type="text"
          placeholder="Enter Pin Code"
          name="pincode"
          id="pincode"
          required
        />

        <button type="submit">Register</button>
      </div>
    </form>

</body>
</html>