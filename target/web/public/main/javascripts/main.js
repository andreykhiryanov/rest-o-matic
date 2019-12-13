// function sendDeleteRequest(url, rUrl) {
//     // alert(url);
//     $.ajax({
//         url: url,
//         method: "DELETE",
//         success: function() {
//             window.location = rUrl;
//         },
//         error: function() {
//             window.location.reload();
//         }
//     });
// }

function acceptVisitorRequest(restaurant) {
    var visitor = $("#acceptVisitor").val();
    var url = '/accept/' + restaurant + '/' + visitor;
    // alert(url);
    $.ajax({
        url: url,
        method: "POST",
        success: function() {
            window.location.reload();
        },
        error: function() {
            window.location.reload();
            alert("url");
        }
    });
}

function kickVisitorRequest(restaurant) {
    var visitor = $("#kickVisitor").val();
    var url = '/kick/' + restaurant + '/' + visitor;
    // alert(url);
    $.ajax({
        url: url,
        method: "POST",
        success: function() {
            window.location.reload();
        },
        error: function() {
            window.location.reload();
            alert("url");
        }
    });
}

function visitRestaurantRequest(visitorName) {
    var restaurantName = $("#visitRestaurant").val();
    var url = '/accept/' + restaurantName + '/' + visitorName;
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

function forgetRestaurantRequest(visitorName) {
    var restaurantName = $("#forgetRestaurant").val();
    var url = '/kick/' + restaurantName + '/' + visitorName;
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