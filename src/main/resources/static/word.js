
$(document).ready(function(){

    $('#word-table td').mouseenter(function () {
        var ft = $(this).attr("ft");
        // alert($(this).attr("ft"));
        if(ft) {
            $(this).text(ft);
        }
    });

    $('#word-table td').mouseleave(function () {
        var jt = $(this).attr("jt");
        if(jt) {
            $(this).text(jt);
        }
    });

    $("#word-table td").click(function () {
        $(this).toggleClass("slt");
    });
});