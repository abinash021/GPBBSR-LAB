<?php

// Use the built-in cURL library to make an API request
$curl = curl_init();

curl_setopt_array($curl, array(
  CURLOPT_URL => "https://api.example.com/endpoint",
  CURLOPT_RETURNTRANSFER => true,
  CURLOPT_ENCODING => "",
  CURLOPT_MAXREDIRS => 10,
  CURLOPT_TIMEOUT => 0,
  CURLOPT_FOLLOWLOCATION => true,
  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
  CURLOPT_CUSTOMREQUEST => "GET",
));

$response = curl_exec($curl);
curl_close($curl);


// Decode the JSON response
$data = json_decode($response);

// Access the data
echo $data->key;

