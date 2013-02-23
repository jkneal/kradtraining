<#macro appheader element>

<header>
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid" style="">
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>

                <a class="brand" href="index.html">
                    <div class="logoBrand">
                        <h1><span>Kuali Rice - Krad</span></h1>
                    </div>
                </a>

                <div class="nav-collapse collapse">
                    <ul class="nav">
                        <li><a href="${ConfigProperties['application.url']}/app/menu?viewId=Krtrain-MenuView&methodToCall=start">Home</a></li>
                        <li><a href="${ConfigProperties['application.url']}/kew/DocumentSearch.do">Doc Search</a></li>
                        <li><a href="${ConfigProperties['application.url']}/kew/ActionList.do">Action List</a></li>
                        <li><a href="http://env1.rice.kuali.org/kr-krad/kradsampleapp?viewId=KradSampleAppHome&methodToCall=start">Component Library</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</header>

<section>
    <div class="sectionContents1">

    <div class="container-fluid">
      <div class="row-fluid" style=" margin-top:56px">
        <div class="span12" style="text-align:right; padding:6px">
         <strong>Logged in User:&nbsp;${UserSession.loggedInUserPrincipalName}</strong>
         <form action="/krtrain/app/menu" method="post" style="margin:0; display:inline">
          <div class="input-append">
              <input class="backdoor" style="
                  -webkit-appearance: none;
               -webkit-box-shadow: rgba(0, 0, 0, 0.0742188) 0px 1px 1px 0px inset;
               -webkit-rtl-ordering: logical;
               -webkit-transition-delay: 0s, 0s;
               -webkit-transition-duration: 0.20000000298023224s, 0.20000000298023224s;
               -webkit-transition-property: border, box-shadow;
               -webkit-transition-timing-function: linear, linear;
               -webkit-user-select: text;
               background-color: rgb(255, 255, 255);
               border-bottom-color: rgb(204, 204, 204);
               border-bottom-left-radius: 3px;
               border-bottom-right-radius: 0px;
               border-bottom-style: solid;
               border-bottom-width: 1px;
               border-left-color: rgb(204, 204, 204);
               border-left-style: solid;
               border-left-width: 1px;
               border-right-color: rgb(204, 204, 204);
               border-right-style: solid;
               border-right-width: 1px;
               border-top-color: rgb(204, 204, 204);
               border-top-left-radius: 3px;
               border-top-right-radius: 0px;
               border-top-style: solid;
               border-top-width: 1px;
               box-shadow: rgba(0, 0, 0, 0.0742188) 0px 1px 1px 0px inset;
               color: rgb(85, 85, 85);
               cursor: auto;
               display: inline-block;
               font-family: Arial, Helvetica, sans-serif;
               font-size: 14px;
               font-style: normal;
               font-variant: normal;
               font-weight: normal;
               height: 20px;
               letter-spacing: normal;
               line-height: 20px;
               margin-bottom: 0px;
               margin-left: 0px;
               margin-right: 0px;
               margin-top: 0px;
               padding-bottom: 4px;
               padding-left: 6px;
               padding-right: 6px;
               padding-top: 4px;
               position: relative;
               text-align: -webkit-auto;
               text-indent: 0px;
               text-shadow: none;
               text-transform: none;
               vertical-align: top;
               white-space: nowrap;
               width: 150px;
               word-spacing: 0px;" type="text" id="backdoor" name="backdoorId">
            <button class="btn btn-danger">backdoor</button>
            <input name="methodToCall" type="hidden" value="login" />
            <input name="viewId" type="hidden" value="Krtrain-MenuView" />
           </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</#macro>