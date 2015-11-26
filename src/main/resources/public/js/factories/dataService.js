angular.module("heroApp").factory("dataService", ["$q", "$http", function($q, $http) {
    return {
        getPowers: function() {
            return $http({
                method: 'GET',
                url: '/powers'
            });
        },

        addPower: function(data) {
            return $http.post('/powers', data);
        }
    }
}]);