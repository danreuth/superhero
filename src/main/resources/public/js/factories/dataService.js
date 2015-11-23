angular.module("heroApp").factory("dataService", ["$q", "$http", function($q, $http) {
    return {
        getPowers: function() {
            var deferred = $q.defer();
            $http({
                method: 'GET',
                url: '/powers'
            }).then(function(response) {
                deferred.resolve(response.data);
            }, function(error) {
                deferred.rejected(error);
            });

            return deferred.promise;
        }
    }
}]);