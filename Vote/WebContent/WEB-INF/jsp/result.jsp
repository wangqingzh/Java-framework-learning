<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<style type="text/css">
.chart {
	width: 100%;
	max-height: 400px;
	height: 100vh;
}
.row{
	margin-left:0px; 
	margin-right:0px
}
#chart2 {
	margin-top: 50px
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-offset-3 col-md-6 text-center">
				<h1 class="page-header">投票结果分析</h1>
				<p class="pull-left">投票成功</p>
				<a class="pull-right" href="logout">退出登录 </a>
			</div>
		</div>
		<div class="row" style="margin-top: 30px">
			<div class="row" id="chart1">
				<div class="col-md-offset-3 col-md-4">

					<div id="chartdiv" class="chart"></div>
					<div class="col-md-2"></div>
				</div>
			</div>

			<div class="row" id="chart2">
				<div class="col-md-offset-3 col-md-4">
					
					<div id="chartColumn" class="chart"></div>
					<div class="col-md-2"></div>
				</div>
			</div>
		</div>
		<div class="row" style="margin-top:100px"></div>
	</div>
</body>
<script type="text/javascript" src="js/amcharts4/core.js"></script>
<script type="text/javascript" src="js/amcharts4/charts.js"></script>
<script type="text/javascript" src="js/amcharts4/animated.js"></script>
<script type="text/javascript">
	//Set theme
	am4core.useTheme(am4themes_animated);

	// Create chart
	var chartPie = am4core.createFromConfig({
		// Set inner radius
		"innerRadius" : "40%",

		// Set data
		"data" : [ {
			"country" : "咸党",
			"value" : "${requestScope['salty']}"
		}, {
			"country" : "甜党",
			"value" : "${requestScope['sweet']}"
		} ],

		// Create series
		"series" : [ {
			"type" : "PieSeries",
			"dataFields" : {
				"value" : "value",
				"category" : "country"
			},
			"slices" : {
				"cornerRadius" : 10,
				"innerCornerRadius" : 7
			},
			"hiddenState" : {
				"properties" : {
					// this creates initial animation
					"opacity" : 1,
					"endAngle" : -90,
					"startAngle" : -90
				}
			}
		} ],

		// Add legend
		"legend" : {}
	}, "chartdiv", "PieChart");
</script>
<script type="text/javascript">
	am4core.useTheme(am4themes_animated);

	var chart = am4core.createFromConfig({
		// Reduce saturation of colors to make them appear as toned down
		"colors" : {
			"saturation" : 0.4
		},

		// Setting data
		"data" : [ {
			"country" : "男/咸党",
			"visits" : "${requestScope['fsaltyCount']}"
		}, {
			"country" : "男/甜党",
			"visits" : "${requestScope['fsweetCount']}"
		}, {
			"country" : "女/咸党",
			"visits" : "${requestScope['msaltyCount']}"
		}, {
			"country" : "女/甜党",
			"visits" : "${requestScope['msweetCount']}"
		} ],

		// Add Y axis
		"yAxes" : [ {
			"type" : "ValueAxis",
			"renderer" : {
				"maxLabelPosition" : 0.98
			}
		} ],

		// Add X axis
		"xAxes" : [ {
			"type" : "CategoryAxis",
			"renderer" : {
				"minGridDistance" : 20,
				"grid" : {
					"location" : 0
				}
			},
			"dataFields" : {
				"category" : "country"
			}
		} ],

		// Add series
		"series" : [ {
			// Set type
			"type" : "ColumnSeries",

			// Define data fields
			"dataFields" : {
				"categoryX" : "country",
				"valueY" : "visits"
			},

			// Modify default state
			"defaultState" : {
				"ransitionDuration" : 1000
			},

			// Set animation options
			"sequencedInterpolation" : true,
			"sequencedInterpolationDelay" : 100,

			// Modify color appearance
			"columns" : {
				// Disable outline
				"strokeOpacity" : 0,

				// Add adapter to apply different colors for each column
				"adapter" : {
					"fill" : function(fill, target) {
						return chart.colors.getIndex(target.dataItem.index);
					}
				}
			}
		} ],

		// Enable chart cursor
		"cursor" : {
			"type" : "XYCursor",
			"behavior" : "zoomX"
		}
	}, "chartColumn", "XYChart");
</script>
</html>