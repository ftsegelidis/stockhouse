<?php

if(isset($_POST['productText']) && isset($_POST['productPrice']) ) {
  require_once('config.inc.php');
	$productText = $_POST['productText'];
  $productPrice = $_POST['productPrice'];

	$statement = $connection->prepare("INSERT INTO product(productTitle,productPrice) VALUES(:productText,:productPrice) ");
	$statement->execute(array(':productText' => $productText,':productPrice' => $productPrice) );
  if($statement->rowCount()){
		//$row_all = $statement->fetchall(PDO::FETCH_ASSOC);
		//header('Content-type: application/json');
   	//echo json_encode($row_all);

  }
    elseif(!$statement->rowCount()){
			echo "no rows";
    }
}

?>
