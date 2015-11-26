angular.module('heroApp').controller('powerCtrl', ['$scope', 'dataService',
    function($scope, dataService) {
        $scope.test = "Power Screen";
        dataService.getPowers().then(
            function(data) {
                $scope.powers = data;
        });
}]);