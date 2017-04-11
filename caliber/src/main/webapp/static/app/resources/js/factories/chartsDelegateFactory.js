/**
 * 
 * @param $log
 * @param hbarChartFactory
 * @param radarChartFactory
 * @param lineChartFactory
 * @returns {{}}
 */
angular.module("delegate")
		.factory(
				"chartsDelegate",
				function($log, doughnutChartFactory, doughnutChartDataFactory, 
						barChartFactory, barChartDataFactory, 
						radarChartFactory, radarChartDataFactory
						, lineChartFactory, lineChartDataFactory) {
					$log.debug("Booted charts delegate");

					var delegate = {};
					delegate.doughnut = {};
					delegate.doughnut.data = {};
					delegate.bar = {};
					delegate.bar.data = {};
					delegate.radar = {};
					delegate.radar.data = {};
					delegate.line = {};
					delegate.line.data = {};

					/**
					 * ********************* Doughnut
					 * *************************************
					 */
					delegate.doughnut.getQCStats = function(dataArray) {
						return doughnutChartFactory.batchWeekQCPie(dataArray);
					};

					delegate.doughnut.data.getQCStatsData = function(batchId,
							weekId) {
						return doughnutChartDataFactory.batchWeekQCPie(batchId,
								weekId);
					};
					
					/**
					 * ************************* Bar *************************
					 */
				
					/*delegate.bar.getAverageTraineeScoresWeekly = function(dataArray){
						return barChartFactory.(dataArray);
					};
					
					delegate.bar.data.getAverageTraineeScoresWeeklyData = function(){
						return barChartDataFactory.();
					};*/
					
					/*delegate.bar.getAssessmentAveragesBatchWeekly = function(dataArray){
						return barChartFactory.(dataArray);
					};
					
					delegate.bar.data.getAssessmentAveragesBatchWeeklyData = function(){
						return barChartDataFactory.();
					};*/
					
					delegate.bar.getAverageTraineeScoresOverall = function(dataArray){
						return barChartFactory.getBatchOverallBarChart(dataArray);
					};
					
					delegate.bar.data.getAverageTraineeScoresOverallData = function(){
						return barChartDataFactory.getBatchOverallBarChart(batchId);
					};
					
					/*delegate.bar.getAssessmentAveragesTraineeWeekly = function(dataArray){
						return barChartFactory.(dataArray);
					};
					
					delegate.bar.data.getAssessmentAveragesTraineeWeeklyData = function(){
						return barChartDataFactory.();
					}*/

					
					/*delegate.bar.getAssessmentAveragesTraineeOverall = function(dataArray){
						return barChartFactory.(dataArray);
					};
					
					delegate.bar.data.getAssessmentAveragesTraineeOverallData = function(){
						return barChartDataFactory.();
					};*/
					
					
					/**
					 * ************************ Radar ************************
					 */
					
					/*delegate.radar.getTechnicalSkillsBatchOverall = function(dataArray){
						return radarChartFactory.(dataArray);
					};
					
					delegate.radar.data.getTechnicalSkillsBatchOverallData = function(){
						return radarChartDataFactory.();
					};*/
					
					/*delegate.radar.getTechnicalSkillsTraineeWeekly = function(dataArray){
						return radarChartFactory.(dataArray);
					};
					
					delegate.radar.data.getTechnicalSkillsTraineeWeeklyData = function(){
						return radarChartDataFactory.();
					};*/
					
					/*delegate.radar.getTechnicalSkillsTraineeOverall = function(dataArray){
						return radarChartFactory.(dataArray);
					};
					
					delegate.radar.data.getTechnicalSkillsTraineeOverallData = function(){
						return radarChartDataFactory.();
					};*/
					
					
					/**
					 * ************************ Line ************************
					 */
					
					/*delegate.line.getWeeklyProgressBatchOverall = function(dataArray){
						return lineChartFactory.(dataArray);
					};
					
					delegate.line.data.getWeeklyProgressBatchOverallData = function(){
						return lineChartDataFactory.();
					};*/
					
					/*delegate.line.getWeeklyProgressTraineeWeekly = function(dataArray){
						return lineChartFactory.(dataArray);
					};
					
					delegate.line.data.getWeeklyProgressTraineeWeeklyData = function(){
						return lineChartDataFactory.();
					};*/
					
					/*delegate.line.getWeeklyProgressTraineeOverall = function(dataArray){
						return lineChartFactory.(dataArray);
					};
					
					delegate.line.data.getWeeklyProgressTraineeOverallData = function(){
						return lineChartDataFactory.();
					};*/
					
					return delegate;
				});