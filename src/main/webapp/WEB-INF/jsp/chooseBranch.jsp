 <%@include file="../taglib.jsp" %>
<style>
        .ui-corner-all
        {
            -moz-border-radius: 4px 4px 4px 4px;
        }
        .ui-widget-content
        {
            border: 1px solid black;
            /* color: #222222;
            background-color: Red; */
        }
        .ui-widget
        {
            font-family: Verdana,Arial,sans-serif;
            font-size: 15px;
        }
        .ui-menu
        {
            display: block;
            float: left;
            list-style: none outside none;
            margin: 0;
            padding: 2px;
        }
        .ui-autocomplete
        {
            cursor: default;
            position: absolute;
        }
        .ui-menu .ui-menu-item
        {
            clear: left;
            float: left;
            margin: 0;
            padding: 0;
            width: 100%;
        }
        .ui-menu .ui-menu-item a
        {
            display: block;
            padding: 3px 3px 3px 3px;
            text-decoration: none;
            cursor: pointer;
            background-color: WHITE;
        }
        .ui-menu .ui-menu-item a:hover
        {
            display: block;
            padding: 3px 3px 3px 3px;
            text-decoration: none;
            color: White;
            cursor: pointer;
            background-color: ButtonText;
        }
        .ui-widget-content a
        {
            color: #222222;
        }
    </style>
    
  <script>
    $(document).ready(function(){
    	
    	
        $( "#chooseBranch" ).autocomplete({
		      minLength: 1,
		      source: function (request, response) {
		          $.getJSON("/branch/findBranchByName.html", { name: $('#chooseBranch').val().toUpperCase() } ,
		        	  function (data) {
		              response($.map(data, function (value) {
		                  return {
		                      label: value.branchName ,
		                      value: value.branchId
		                  };
		              }));
		          });
		      },
		      messages: {
		          noResults: '',
		          results: function() {}
		      },
		      delay: 100,
		      focus: function( event, ui ) {
		    	  	$(".ui-helper-hidden-accessible").hide();
			        $( "#chooseBranch" ).val( ui.item.label );
			        return false;
			  },
		      select: function( event, ui ) {
		        $( "#chooseBranch" ).val( ui.item.label );
		        $( "#chooseBranchHidden" ).val( ui.item.value );
		 
		        return false;
		      } 
		});
        
        
        
    }); 
    </script>
 
 
 
 
 <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Choose Branch</div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="chooseBranchForm" class="form-horizontal" role="form" action="/chooseBranch.html" method="POST">
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="chooseBranch" type="text" class="form-control" name="chooseBranch" value="" placeholder="Choose Branch">                                        
                            			<input id="chooseBranchHidden" type="hidden"/>
                            </div>
                                
                            
                       
                             <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <button id="btn-login" href="#" class="btn btn-success" type="submit">Login</button>
                                    </div>
                                </div>
                            </form>     
                           </div>                     
                    </div>  
        </div>
    </div>
    
    
    
    
   