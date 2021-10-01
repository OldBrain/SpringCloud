(function () {
    angular
        .module('market-front', ['ngRoute', 'ngStorage' ])
        .config(config)
        .run(run);

    function config($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'welcome/welcome.html',
                controller: 'welcomeController'
            })
            .when('/store', {
                templateUrl: 'store/store.html',
                controller: 'storeController'
            })
            .otherwise({
                redirectTo: '/'
            });
    }

    function run($rootScope, $http, $localStorage) {

    }

})();


angular.module('market-front').controller('indexController', function ($rootScope, $scope, $http, $localStorage, $location) {
    // const contextPath = 'http://localhost:8190/market/';


});