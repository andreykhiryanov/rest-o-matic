

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
        }
    });
}