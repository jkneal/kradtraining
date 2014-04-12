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

<%@ attribute name="keyMatch" required="true" description="A concatenated String with properties to match error keys with, each seperated by a comma." %>
<%@ attribute name="auditMatch" required="false" description="Audit information which errors should be matched against if no errors were matched by keyMatch." %>

<c:set var="hasErrors" value="false" scope="request" />

<c:choose>
	<c:when test="${! (empty keyMatch)}">
		<c:forEach items="${fn:split(keyMatch,',')}" var="prefix">
			<c:forEach items="${ErrorPropertyList}" var="key">
				<c:if test="${(fn:endsWith(prefix,'*') && fn:startsWith(key,fn:replace(prefix,'*',''))) || (key eq prefix)}">
					<c:set var="hasErrors" value="true" scope="request"/>
				</c:if>
			</c:forEach>
		</c:forEach>
	</c:when>

	<c:otherwise>
		<logic:messagesPresent>
			<c:set var="hasErrors" value="true" scope="request" />
		</logic:messagesPresent>
	</c:otherwise>
</c:choose>

<c:if test="${!(empty auditMatch) && !hasErrors}">
	<c:forEach items="${fn:split(auditMatch,',')}" var="prefix">
		<c:forEach items="${AuditErrors}" var="cluster">
			<c:forEach items="${cluster.value.auditErrorList}" var="audit">
				<c:if test="${(fn:endsWith(prefix,'*') && fn:startsWith(audit.errorKey,fn:replace(prefix,'*',''))) || (audit.errorKey eq prefix)}">
					<c:set var="hasErrors" value="true" scope="request"/>
				</c:if>
			</c:forEach>
		</c:forEach>
	</c:forEach>
</c:if>


