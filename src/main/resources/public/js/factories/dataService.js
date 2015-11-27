angular.module("heroApp").factory("dataService", ["$q", "$http", function($q, $http) {
    return {
        getPowers: function() {
            return $http.get('/powers');
        },

        addPower: function(data) {
            return $http.post('/powers', data);
        },

        getPowerTypes: function() {
            return $http.get('/powerTypes');
        },

        editPower: function(data) {
            return $http.put('/powers', data);
        }
    }
}]);