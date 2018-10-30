var init = function() {
    var btn = document.querySelector("#getMessage");
    btn.addEventListener("click", getPersonalizedMessage);

    var btn2 = document.querySelector("#getMessage");
    btn.addEventListener("click", getWeather);

}

var getPersonalizedMessage = function() {
    var xhr = new XMLHttpRequest();

    //let url = "http://www.geonames.org/search.html?";

    var url = "http://api.geonames.org/postalCodeSearchJSON";
    var params = "?postalcode=" + document.querySelector("#zip").value + "&username=cclark5";

    xhr.open("get", url + params);

    xhr.onreadystatechange = function() {
        if(xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);
            var obj = JSON.parse(xhr.responseText);

            console.log(obj.postalCodes[0].lng);
            console.log(obj.postalCodes[0].lat);
            var lng = obj.postalCodes[0].lng;
            var lat = obj.postalCodes[0].lat;

            getWeather(lat, lng);


        }
    }
    xhr.send(null);
}

    var getWeather = function(lat, lng) {
    var xhr = new XMLHttpRequest();

    var url = " http://api.geonames.org/findNearByWeatherJSON";
    var params2 = "?lat=" + lat + "&lng=" + lng + "&username=cclark5";

    xhr.open("post", url + params2);
    xhr.onreadystatechange = function() {
        if(xhr.readyState == 4 && xhr.status == 200) {
            console.log(xhr.responseText);

            var obj = JSON.parse(xhr.responseText);

            var clouds = obj.weatherObservation.clouds;
            console.log("Clouds: " + clouds);
            document.getElementById("content7").innerHTML = "Clouds: " + clouds;
            if(clouds == "few clouds") {
                var cloud = document.createElement("IMG");
                cloud.setAttribute("src", "images/lightClouds.png");
                cloud.setAttribute("width", "100");
                cloud.setAttribute("height", "100");
                cloud.setAttribute("alt", "one cloud for light cloud coverage");
                document.getElementById("cloudImage").appendChild(cloud);
            }
            if(clouds == "many clouds") {
                var manyCloud = document.createElement("IMG");
                manyCloud.setAttribute("src", "images/clouds.png");
                manyCloud.setAttribute("width", "100");
                manyCloud.setAttribute("height", "100");
                manyCloud.setAttribute("alt", "many clouds for heavy cloud coverage");
                document.getElementById("cloudImage").appendChild(manyClouds);
            }

            var wind = obj.weatherObservation.windSpeed;
            console.log("Wind Speed: " + wind);
            document.getElementById("content5").innerHTML = "Wind Speed: " + wind;
            if(wind >= 15) {
                var windy = document.createElement("IMG");
                windy.setAttribute("src", "images/wind.jpg");
                windy.setAttribute("width", "100");
                windy.setAttribute("height", "100");
                windy.setAttribute("alt", "strong wind image");
                document.getElementById("windImage").appendChild(windy);
            }

            var Farenheit = obj.weatherObservation.temperature * (9/5) + 32;
            console.log("Temperature: " + Farenheit);
            document.getElementById("content3").innerHTML = "Temperature: " + Math.round(Farenheit);
            if (Farenheit > 83) {
                var hot = document.createElement("IMG");
                hot.setAttribute("src", "images/hot.jpg");
                hot.setAttribute("width", "100");
                hot.setAttribute("height", "100");
                hot.setAttribute("alt", "sun describing hot weather");
                document.getElementById("tempImage").appendChild(hot);
            }
            if (Farenheit < 34) {
                var cold = document.createElement("IMG");
                cold.setAttribute("src", "images/cold.jpg");
                cold.setAttribute("width", "100");
                cold.setAttribute("height", "100");
                cold.setAttribute("alt", "snowflake describing cold weather");
                document.getElementById("tempImage").appendChild(cold);
            }

            var humidity = obj.weatherObservation.humidity;
            console.log("Humidity: " + humidity);
            document.getElementById("content4").innerHTML = "Humidity: " + humidity;

            var condition = obj.weatherObservation.weatherCondition;
            console.log("Weather Condition: " + condition);
            document.getElementById("content6").innerHTML = "Weather Condition: " + condition;
            if (condition == "light rain") {
                var lightRain = document.createElement("IMG");
                lightRain.setAttribute("src", "images/lightRain.png");
                lightRain.setAttribute("width", "100");
                lightRain.setAttribute("height", "100");
                lightRain.setAttribute("alt", "cloud with light rain drop");
                document.getElementById("weatherConditionImage").appendChild(lightRain);
            }
            if (condition == "heavy rain") {
                var Rain = document.createElement("IMG");
                lightRain.setAttribute("src", "images/rain.png");
                lightRain.setAttribute("width", "100");
                lightRain.setAttribute("height", "100");
                lightRain.setAttribute("alt", "cloud with light rain drop");
                document.getElementById("weatherConditionImage").appendChild(Rain);
            }

            var date = obj.weatherObservation.datetime;
            console.log("Date: " + date);
            document.getElementById("content2").innerHTML = "Date: " + date;

            var dewPoint = obj.weatherObservation.dewPoint;
            console.log("Dew Point: " + dewPoint);
            document.getElementById("content8").innerHTML = "Dew Point: " + dewPoint;

            var seaLevelPressure = obj.weatherObservation.seaLevelPressure;
            console.log("Sea Level Pressure: " + seaLevelPressure);
            document.getElementById("content9").innerHTML = "Sea Level Pressure: " + seaLevelPressure;

            var elevation = obj.weatherObservation.elevation;
            console.log("Elevation: " + elevation);
            document.getElementById("content10").innerHTML = "Elevation: " + elevation;

            var location = obj.weatherObservation.stationName;
            console.log("Location : " + location);
            document.getElementById("content11").innerHTML = "Location: " + location;

        }
    }

    xhr.send(null);
}