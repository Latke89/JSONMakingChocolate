angular.module('ChocolateApp', [])
    .controller('ChocolateControl', function($scope, $http, $timeout) {

        $scope.makeArray = function(arraySize) {
            var returnArray = [];
            for (var i = 0; i < arraySize; i++) {
            returnArray.push(i);
        }
            return returnArray;
        }

        $scope.testTimeout = function() {
            console.log("testTimeout() is running");
            if ($scope.numBigs > 5) {
                return;
            } else {
                $scope.numBigs+=1;
                $timeout($scope.testTimeout, 1000);
            }
        }

        $scope.numBigs = 1;
        $timeout($scope.testTimeout, 1000);

        console.log("chocolate controller initialized");
        $scope.testvar = "blargh";
});