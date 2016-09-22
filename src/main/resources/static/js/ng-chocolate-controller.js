angular.module('ChocolateApp', [])
    .controller('ChocolateControl', function($scope, $http, $timeout) {

        $scope.finishedChocolate;

        $scope.makeArray = function(arraySize) {
            var returnArray = [];
            for (var i = 0; i < arraySize; i++) {
            returnArray.push(i);
        }
            return returnArray;
        }

//        $scope.testTimeout = function() {
//            console.log("testTimeout() is running");
//            if ($scope.numBigs > 5) {
//                return;
//            } else {
//                $scope.numBigs+=1;
//                $timeout($scope.testTimeout, 1000);
//            }
//        }
//
//        $scope.numBigs = 1;
//        $timeout($scope.testTimeout, 1000);

           $scope.solveChocolate = function(numSmalls, numBigs, numGoal) {
               console.log("About to go make chocolate!");

               $http.get("http://localhost:8080/chocolate.json?small=" + numSmalls + "&big=" + numBigs + "&goal=" + numGoal)
                   .then(
                       function successCallback(response) {
                           console.log(response.data);
                           console.log("Adding data to scope");
                           $scope.finishedChocolate = response.data;
                           console.log($scope.finishedChocolate);
                       },
                       function errorCallback(response) {
                           console.log("Unable to get data");
                       });
               console.log("Done with the promise, waiting for the callback")
           };


        console.log("chocolate controller initialized");
});