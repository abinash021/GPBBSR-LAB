<!DOCTYPE html>
<head>
  <title>My PHP-based Web Page</title>
  <style type="text/css">
    /* CSS styles go here */
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
    }
    h1 {
      color: #333;
      text-align: center;
      margin-top: 50px;
    }
    .container {
        width: 80%;
        margin: 0 auto;
    }
    .date {
      font-size: 20px;
      text-align: center;
      color: #555;
      margin-top: 20px;
    }
    .card {
      background-color: #fff;
      padding: 20px;
      box-shadow: 0px 0px 10px #ddd;
      border-radius: 5px;
      margin-top: 20px;
    }
    /* Adding background color on hover */
    .card:hover {
        background-color: #f9f9f9;
    }
  </style>
</head>
<body>
  <div class="container">
      <h1>Welcome to my PHP-based web page!</h1>
      <div class="card">
        <p class="date">Today's date is <?php echo date('l, F jS, Y'); ?></p>
      </div>
  </div>
</body>
</html>
