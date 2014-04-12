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
<%@ attribute name="includeDocumentHeaderFields" required="false" description="Whether to include the document number as a hidden field." %>
<%@ attribute name="includeEditMode" required="false" description="Whether to include the current edit modes as hidden fields." %>

<c:set var="documentTypeName" value="${KualiForm.docTypeName}" />
<c:set var="documentEntry" value="${DataDictionary[documentTypeName]}" />

<%-- set default values --%>
<c:if test="${empty includeDocumentHeaderFields}">
    <c:set var="includeDocumentHeaderFields" value="true" />
</c:if>
<c:if test="${empty includeEditMode}">
    <c:set var="includeEditMode" value="true" />
</c:if>

<html:hidden property="docId" />
<html:hidden property="document.documentNumber" />

<c:if test="${includeDocumentHeaderFields}">
  <html:hidden property="document.documentHeader.documentNumber" />  
</c:if>
<c:if test="${includeEditMode}">
    <c:forEach items="${KualiForm.editingMode}" var="mode">
      <html:hidden property="editingMode(${mode.key})"/>
    </c:forEach>
</c:if>
