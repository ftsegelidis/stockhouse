<?php
if(isset($_POST['productText']) && isset($_POST['productPrice']) && isset($_POST['productId'])) {
  require_once('config.inc.php');
	$productText = $_POST['productText'];
  $productPrice = $_POST['productPrice'];
  $productId = $_POST['productId'];
	$statement = $connection->prepare("UPDATE product SET productTitle = :productText,productPrice = :productPrice WHERE productid = :productId ");
	$statement->execute(array(':productText' => $productText,':productPrice' => $productPrice,':productId' => $productId) );
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
