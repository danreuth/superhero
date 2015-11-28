angular.module('heroApp').config(
    function($stateProvider,$urlRouterProvider) {
        $urlRouterProvider.otherwise('/teamView');

        $stateProvider
            .state('teamView', {
                url: '/teamView',
                templateUrl: 'templates/teamView.html',
                controller: 'teamCtrl'
            })
            .state('heroView', {
                url: '/heroView',
                templateUrl: 'templates/heroView.html',
                controller: 'heroCtrl',
                resolve: {
                    heroData: function(dataService) {
                        return dataService.getHeroes().then(
                            function(success) {
                                return success;
                            },
                            function(error) {
                                return error;
                            }
                        );
                    }
                }
            })
            .state('powerView', {
                url: '/powerView',
                templateUrl: 'templates/powerView.html',
                controller: 'powerCtrl',
                resolve: {
                    powerData: function(dataService) {
                        return dataService.getPowers().then(
                            function(success) {
                                return success;
                            },
                            function(error) {
                                return error;
                            }
                        );
                    },

                    powerTypeData: function(dataService) {
                        return dataService.getPowerTypes().then(
                            function(success) {
                                return success;
                            },
                            function(error) {
                                return error;
                            }
                        );
                    }
                }
            });
    });