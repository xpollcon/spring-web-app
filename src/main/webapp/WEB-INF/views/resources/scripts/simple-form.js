$(document).on("click","#send",function(){
    var fullNameVal =  $("#fullName").val();
    var phoneNoVal  =  $("#phoneNo").val();
    var genderVal   =  $("#gender").val();

    $.ajax({
        type: "GET",
        url: "http://localhost:7077/addPerson",
        data: "fullName=" + fullNameVal + "&phoneNo=" + phoneNoVal + "&gender=" + genderVal,
        dataType: "json",
        success: renderResponse,
        error: function(){
            alert("FAILED")
        }
    })
});

var renderResponse = function(response){
    if(response){
        $.each(response,function(p,person){
            $("#phone-book").append("<p>" + person.fullName + "-" + person.phoneNo + "-" + person.gender + "<br/></p>") ;
        });
    }
};


