function sendDeleteRequest(url, rUrl) {
    // alert(url);
    $.ajax({
        url: url,
        method: "DELETE",
        success: function() {
            window.location = rUrl;
        },
        error: function() {
            window.location.reload();
            alert("ASSSS!!!!!!!!\n" + url + "\n" + rUrl);
        }
    });
}

function acceptVisitorRequest(restaurantId) {
    var visitor = $("#acceptVisitor").val();
    var url = '/accept/' + restaurantId + '/' + visitor;
    // alert(url);
    $.ajax({
        url: url,
        method: "POST",
        success: function() {
            window.location.reload();
        },
        error: function() {
            window.location.reload();
            alert(url);
        }
    });
}

function kickVisitorRequest(restaurantId) {
    var visitor = $("#kickVisitor").val();
    var url = '/kick/' + restaurantId + '/' + visitor;
    // alert(url);
    $.ajax({
        url: url,
        method: "POST",
        success: function() {
            window.location.reload();
        },
        error: function() {
            window.location.reload();
            alert(url);
        }
    });
}

function visitRestaurantRequest(visitorId) {
    var restaurantName = $("#visitRestaurant").val();
    var url = '/accept/' + restaurantName + '/' + visitorId;
    // alert(url);
    $.ajax({
        url: url,
        method: "POST",
        success: function() {
            window.location.reload();
        },
        error: function() {
            window.location.reload();
            alert(url);
        }
    });
}

function forgetRestaurantRequest(visitorId) {
    var restaurantName = $("#forgetRestaurant").val();
    var url = '/kick/' + restaurantName + '/' + visitorId;
    // alert(url);
    $.ajax({
        url: url,
        method: "POST",
        success: function() {
            window.location.reload();
        },
        error: function() {
            window.location.reload();
            alert(url);
        }
    });
}