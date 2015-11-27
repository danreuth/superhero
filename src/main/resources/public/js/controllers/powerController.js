angular.module('heroApp').controller('powerCtrl', ['$scope', 'dataService', 'powerData', 'powerTypeData',
    function($scope, dataService, powerData, powerTypeData) {
        $scope.test = "Power Screen";
        $scope.showAddPower = false;
        $scope.powers = powerData.data;
        $scope.powerTypes = powerTypeData.data;
        $scope.newPower = {};
        $scope.newPower.powerType = {};

        $scope.openAddPower = function() {
            $scope.showAddPower = true;
            $scope.newPower.powerType = $scope.powerTypes[0];
        };
        $scope.addPower = function() {
            dataService.addPower($scope.newPower)
                .then(
                    function(success) {
                        $scope.showAddPower = false;
                        return dataService.getPowers();
                    },
                    function(error) {
                    })
                .then(
                    function(success) {
                       $scope.powers = success.data;
                    },
                    function(error) {
                    });
        }
}]);