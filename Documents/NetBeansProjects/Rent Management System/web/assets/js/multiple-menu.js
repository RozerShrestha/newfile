// ------------------------------------------------
// 	jquery.dropdown.js	(depends on: jquery.hoverIntent.js)
// ------------------------------------------------
$.fn.dropdown = function(options) 
{
	var defaults = {};
	var opts = $.extend(defaults, options);
	// Apply class=hasChildren on those items with children
	this.each(function(){
		$(this).find('li').each(function() 
		{
			if( $(this).find('ul').length > 0) 
			{
				$(this).addClass('hasChildren');
			}
		});
	});
	return this;
};
// ------------------------------------------------
// MENU MAIN
$(function(){
	var navMainId = '#navMain';
	// Calling the jquery dropdown
	$(navMainId).dropdown();
	// -------------------
		// ouverture/fermeture sous-menu (click/touch)
		$(navMainId+' ul > li').on( 'click', function(event) 
    {
      $(this).parent().find('li:not(:hover)').removeClass('open');
      $(this).parent().find('li:not(:hover) ul').slideUp('fast');
      if( $(this).hasClass('hasChildren') )
      {
        $(this).children('ul').slideToggle('fast');
      }
      if( $(this).hasClass('open') )
      {
        $(this).removeClass('open');
      } else {
        $(this).addClass('open');
      }
      event.stopPropagation(); /* important */
		});
		// IMPORTANT : on supprime les liens des Menus AVEC Sous-Menus
		$(navMainId+' > ul > li.hasChildren > a').attr('href','javascript:void(0);');
	// -------------------
		$(navMainId+' #navMainClose').on( 'click', function() 
    {
      $(navMainId+' ul ul').slideUp('fast');
		});
});
