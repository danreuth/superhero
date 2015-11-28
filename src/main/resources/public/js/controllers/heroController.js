angular.module('heroApp').controller('heroCtrl', ['$scope', 'heroData',
    function($scope, heroData) {
        $scope.heroes = heroData.data;

}]);