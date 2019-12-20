$(document).ready(function () {



    /*
    var updatePage = function (resp) {
        $('').html(resp.people[0].name);
    };


    var printError = function (req, status, err) {
        console.log('something went wrong', status, err);
    };


    var ajaxOptions = {
        url: 'https://api.exchangeratesapi.io/latest',
        dataType: 'json',
        success: updatePage,
        error: printError
    };


    $.ajax(ajaxOptions);

    */


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