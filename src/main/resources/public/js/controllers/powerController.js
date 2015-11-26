angular.module('heroApp').controller('powerCtrl', ['$scope', 'dataService', 'powerData',
    function($scope, dataService, powerData) {
        $scope.test = "Power Screen";
        $scope.showAddPower = false;
        $scope.powers = powerData.data;
        $scope.newPower = {};

        $scope.openAddPower = function() {
            $scope.showAddPower = true;
        };
        $scope.addPower = function() {
            $scope.newPower.powerType = { "id":1, "powerType":"Movement"};
            
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

            console.log($scope.newPowerName);
        }
}]);