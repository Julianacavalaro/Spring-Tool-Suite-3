var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

  $scope.manutencoes = new Object();


$scope.salvar = function() {
  $http.post("http://localhost:8080/test/manutencoes", {
    'id':$scope.id,
    'nome':$scope.nome,
    'data':$scope.data,
    'categoria':$scope.categoria,
    	'pago':$scope.pago
    
  })
  };   
  
  $scope.buscarTodos = function() {
	  $http.get("http://localhost:8080/test/manutencoes").then(function(resposta) {
		  $scope.manutencoes = resposta.data;
	  }) 
  }
  $scope.buscarTodos();
  
});

