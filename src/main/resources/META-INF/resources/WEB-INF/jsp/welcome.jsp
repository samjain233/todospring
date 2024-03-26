<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .welcome-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }
        .welcome-container h2 {
            margin-bottom: 20px;
        }
        .welcome-container p {
            margin-bottom: 20px;
        }
        .welcome-container a {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .welcome-container a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="welcome-container">
        <h2>Welcome to Our Website</h2>
        <p>This is a simple welcome page. You can add more content here.</p>
        <a href="/login">Login</a>
    </div>
</body>
</html>
