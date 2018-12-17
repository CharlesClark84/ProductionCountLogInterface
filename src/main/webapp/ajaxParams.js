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


            var wind = obj.weatherObservation.windSpeed;
            console.log("Wind Speed: " + wind);
            document.getElementById("content5").innerHTML = "Wind Speed: " + wind;

            if (wind > 2) {
                document.getElementById("wind").innerHTML = "-Turn on backup generator";

            }

            var Farenheit = obj.weatherObservation.temperature * (9/5) + 32;
            console.log("Temperature: " + Farenheit);
            document.getElementById("content3").innerHTML = "Temperature: " + Math.round(Farenheit);


            if (Farenheit < 34) {
                document.getElementById("temp").innerHTML = "-Warm up machine for ten minutes before running";

            }

            if (Farenheit > 80) {
                document.getElementById("temp").innerHTML = "-Check all fluid levels and fill if necessary -Fill all grease points";

            }


            var humidity = obj.weatherObservation.humidity;
            console.log("Humidity: " + humidity);
            document.getElementById("content4").innerHTML = "Humidity: " + humidity;

            if (humidity > 50) {
                document.getElementById("glue").innerHTML = "-Recalibrate glue machine";

            }

            var condition = obj.weatherObservation.weatherCondition;
            console.log("Weather Condition: " + condition);
            document.getElementById("content6").innerHTML = "Weather Condition: " + condition;


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
        if (xhr.status == 404) {
            document.getElementById("content").innerHtml = "Error retrieving data. Please try again"
        }

    }
    xhr.send(null);
}