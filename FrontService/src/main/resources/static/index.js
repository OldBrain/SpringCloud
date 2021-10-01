angular.module('market-front',[]).controller('indexController', function ($rootScope, $scope, $http) {

    $scope.loadProducts = function () {
        $http.get('http://localhost:8190/market/get-products')
        .then(function (response) {
           console.log(response);
            $scope.products = response.data;
        });
    };

    $scope.loadProducts();
});