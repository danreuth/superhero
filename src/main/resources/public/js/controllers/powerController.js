angular.module('heroApp').controller('powerCtrl', ['$scope', 'dataService', 'powerData', 'powerTypeData',
    function($scope, dataService, powerData, powerTypeData) {
        $scope.test = "Power Screen";
        $scope.showAddPower = false;
        $scope.powers = powerData.data;
        $scope.powerTypes = powerTypeData.data;
        $scope.newPower = {};
        $scope.newPower.powerType = {};
        $scope.editing = false;

        $scope.openAddPower = function() {
            $scope.editing = false;
            $scope.showAddPower = true;
            $scope.newPower.powerType = $scope.powerTypes[0];
        };
        $scope.addPower = function() {
            var promise;
            if($scope.editing === false) {
                promise = dataService.addPower($scope.newPower);
            } else {
                promise = dataService.editPower($scope.newPower);
            }
            promise
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
        $scope.editPower = function(powerToEdit) {
            $scope.editing = true;
            $scope.showAddPower = true;
            $scope.newPower = powerToEdit;
        };
}]);