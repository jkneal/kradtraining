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
<%@ tag body-content="empty" %>

<%@ attribute name="attributeEntry" required="false" type="java.util.Map" description="A map of attribute information from the data dictionary." %>
<%@ attribute name="attributeEntryName" required="false"
              description="The full name of the DataDictionary entry to use,
              e.g., 'DataDictionary.Budget.attributes.budgetProjectDirectorUniversalIdentifier'.
              Either attributeEntry or attributeEntryName is required." %>
<%@ attribute name="readOnly" required="false" description="Whether the label is for a read only attribute; if it is, then no 'required' icon will be displayed."  %>
<%@ attribute name="useShortLabel" required="false" description="Whether the short label for the control should be used." %>
<%@ attribute name="labelFor" required="false" description="The control name which this label is associated with; typically the property name will be sent in here." %>
<%@ attribute name="includeHelpUrl" required="false" description="If set to true, then the help link will render a help URL regardless of the skipHelpUrl parameter value." %>
<%@ attribute name="skipHelpUrl" required="false" description="If set to true and includeHelpUrl is set to false, then the help link will not be rendered for this attribute.  If both
              this attribute and includeHelpUrl are set to false, then the KualiForm.fieldLevelHelpEnabled will control whether to render the help link." %>
<%@ attribute name="noColon" required="false" description="Whether a colon should be rendered after the label or not." %>
<%@ attribute name="forceRequired" required="false" description="Whether the required icon should be forced to be rendered." %>
<%@ attribute name="labelLink" required="false" description="Allows for the label to be turned into a link for sorting purposes. Excludes the ability to include a help url" %>

<c:if test="${not empty attributeEntryName}">
    <dd:evalNameToMap mapName="${attributeEntryName}" returnVar="attributeEntry"/>
</c:if>

<%-- There are no spaces between the tags in the middle of this file,
    to make effective the non-breaking space after the REQUIRED_FIELD_SYMBOL,
    and to eliminate any space before the colon. --%>
<c:if test="${not empty labelFor}"><label for="${labelFor}"></c:if
><c:if test="${(attributeEntry.required == true || forceRequired) && readOnly != true}">
  <font color="">${Constants.REQUIRED_FIELD_SYMBOL}&nbsp;</font></c:if
><c:if test="${not empty labelLink && includeHelpUrl || (!skipHelpUrl && KualiForm.fieldLevelHelpEnabled)}"><a
        href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getAttributeHelpText&amp;businessObjectClassName=${attributeEntry.fullClassName}&amp;attributeName=${attributeEntry.name}"
        tabindex="${KualiForm.nextArbitrarilyHighIndex}" target="helpWindow" title="[Help] ${attributeEntry.label}"></c:if
>
<c:if test="${not empty labelLink}">
    <a href="${labelLink}" tabindex="${KualiForm.nextArbitrarilyHighIndex}" title="${attributeEntry.label}">
</c:if>
<c:if test="${useShortLabel == true}"><c:out value="${attributeEntry.shortLabel}" /></c:if
><c:if test="${useShortLabel != true}"><c:out value="${attributeEntry.label}" /></c:if
><c:if test="${!noColon}">:</c:if>
<c:if test="${includeHelpUrl || (!skipHelpUrl && KualiForm.fieldLevelHelpEnabled)}"></a></c:if>
<c:if test="${not empty labelFor}"></label></c:if>
