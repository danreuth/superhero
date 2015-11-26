angular.module('heroApp').controller('powerCtrl', ['$scope', 'dataService',
    function($scope, dataService) {
        $scope.test = "Power Screen";
        dataService.getPowers().then(
            function(success) {
                $scope.powers = success.data;
        },
            // TODO Handle Error
            function(error) {
                console.log(error);
        });
}]);