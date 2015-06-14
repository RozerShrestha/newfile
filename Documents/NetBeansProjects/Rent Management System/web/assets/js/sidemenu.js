
$("#side-menu .menu-item").on("click", function() {
  $("#side-menu .menu-item").removeClass("active");
  $(this).addClass("active");
  
  var page = $(this).data("page");
  $("#content .page-content").removeClass("active");
  $("#content").find("." + page).addClass("active");
});


