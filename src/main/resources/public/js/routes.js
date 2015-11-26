angular.module('heroApp').config(
    function($stateProvider,$urlRouterProvider) {
        $urlRouterProvider.otherwise('/teamView');

        $stateProvider
            .state('teamView', {
                url: '/teamView',
                templateUrl: 'templates/teamView.html',
                controller: 'teamCtrl'
            })
            .state('powerView', {
                url: '/powerView',
                templateUrl: 'templates/powerView.html',
                controller: 'powerCtrl'
            })
    });