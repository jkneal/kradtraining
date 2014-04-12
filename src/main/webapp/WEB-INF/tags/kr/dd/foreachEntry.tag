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
<%@ tag body-content="scriptless" %> 

<%@ include file="/kr/WEB-INF/jsp/tldHeader.jsp"%>

<%@ attribute name="map" required="true" type="java.util.Map" description="The Map to iterate they keys over." %>
<%@ attribute name="valueVar" required="true" rtexprvalue="false" description="The name of the variable to put the values in the map attribute into, as the Map is iterated over." %>
<%@ variable name-from-attribute="valueVar" alias="valueHolder" scope="NESTED" %>

<c:forEach items='${map}' var='mapEntry' >
    <c:set var='valueHolder' value="${mapEntry.value}" />

    <jsp:doBody/>
</c:forEach>
