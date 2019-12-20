$(document).ready(function () {




    fetchData(processResults);

    function fetchData(cb) {
        $.ajax({
            url: 'https://api.exchangeratesapi.io/latest',
            type: 'GET',
            dataType: 'json',
            success: function (results) { cb(null, results) },
            error: function (request, statusText, httpError) { cb(httpError || statusText) }
        });
    }



    function renderResults(){
        $("input").keypup(function (event) {
            var value = $( this ).val();
            $("p").text(value);
        });
    }

    function renderError() {

   

    }

    function processResults(error, data) {
        if (error) {
            renderError();
        } 

        renderResults();
    }
    

});