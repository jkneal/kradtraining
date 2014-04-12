<%--
 Copyright 2005-2014 The Kuali Foundation
 
 Licensed under the Educational Community License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
 http://www.opensource.org/licenses/ecl2.php
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
--%>
<%@ include file="/kr/WEB-INF/jsp/tldHeader.jsp"%>


<%@ attribute name="attributeEntry" required="true" type="java.util.Map" description="A Map of data dictionary information about the property which is having its input rendered." %>
<%@ attribute name="property" required="true" description="The property associated that should have a date input rendered for it." %>
<%@ attribute name="tabindexOverride" required="false" description="If set, this will be used as the tab index on the control." %>
<%@ attribute name="accessibilityHint" required="false"
        description="Use this to attach further information to the title attribute of a field
        if present"%>

<%-- Define variable that will hold the Title of the html control --%>
<c:set var="accessibleTitle" value="${attributeEntry.label}"/>
<c:if test="${!(empty accessibilityHint)}">
<c:set var="accessibleTitle" value="${accessibleTitle} ${accessibilityHint}"/>
</c:if>


<kul:checkErrors keyMatch="${property}"/>

 <c:choose>
  <c:when test="${!empty tabindexOverride}">
    <c:set var="tabindex" value="${tabindexOverride}"/>
  </c:when>
  <c:otherwise>
   <c:set var="tabindex" value="${KualiForm.currentTabIndex}"/>
    <c:set var="dummyIncrementVar" value="${kfunc:incrementTabIndex(KualiForm, tabKey)}" />
  </c:otherwise>
</c:choose>
<c:if test="${attributeEntry.control.text != true}">
  <font color="red">The given attributeEntry does not specify a text control</font>
</c:if>
<c:if test="${attributeEntry.control.text == true}">
    <html:text property="${property}" styleId="${property}" title="${accessibleTitle}" tabindex="${tabindex}" size="${attributeEntry.control.size}" maxlength="${attributeEntry.maxLength}" style="${textStyle} "/>
    <c:if test="${hasErrors==true}">
  		<kul:fieldShowErrorIcon />
	</c:if>

	<img src="${ConfigProperties.kr.externalizable.images.url}cal.gif" id="${property}_datepicker" style="cursor: pointer;" alt="Date selector" title="Date selector" onmouseover="this.style.background='red';" onmouseout="this.style.background='';" />    
    <script type="text/javascript">
      Calendar.setup(
      {
         inputField : "${property}", // ID of the input field
         ifFormat : "%m/%d/%Y", // the date format
         button : "${property}_datepicker" // ID of the button
      }
      );
    </script>
  
</c:if>
