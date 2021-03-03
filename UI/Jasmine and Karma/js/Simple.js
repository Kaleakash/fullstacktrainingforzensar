 var myApp = angular.module("myApp",[]);
	 myApp.controller("SimpleController",["$scope",function($scope){
		$scope.x=10;
		$scope.y=20;
		$scope.sum='';
		
		$scope.dis=function($scope){
				return 'welcome';
		}
	 }])