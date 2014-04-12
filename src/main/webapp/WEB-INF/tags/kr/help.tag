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
<%@ attribute name="resourceKey" required="false" description="The resource key to use as help text." %>
<%@ attribute name="businessObjectClassName" required="false" description="The class of the business object the help text is assoicated with." %>
<%@ attribute name="attributeName" required="false" description="The name of the attribute which will have help text rendered for it; requires to be used in conjunction with the businessObjectClassName attribute." %>
<%@ attribute name="documentTypeName" required="false" description="The name of the document type to show help text for." %>
<%@ attribute name="pageName" required="false" description="The page of a specific document to show a help icon for." %>
<%@ attribute name="altText" required="false" description="The alternate text for the help icon." %>
<%@ attribute name="parameterNamespace" required="false" description="The namespace of the parameter to be used with the parameterName, parameterDetailType attributes to find the URL for the help text." %>
<%@ attribute name="parameterDetailType" required="false" description="The name of the parameter Detail which will be used with the parameterNamespace, ParameterName attributesto find the URL for the help text." %>
<%@ attribute name="parameterName" required="false" description="The name of the parameter which will be used with the parameterNamespace, parameterDetailType attributes to find the URL for the help text." %>
<%@ attribute name="searchDocumentTypeName" required="false" description="The document type name of a document being looked up to display help for." %>
<%@ attribute name="lookupBusinessObjectClassName" required="false" description="The business object looked up on the lookup page, which needs to have specific help displayed for it." %>
<%@ attribute name="alternativeHelp" required="false"%>

<%--
  this tag is formatted to prevent any spaces occuring between the <a>/</a> tags and the <img> tag representing the help icon.  Internet
  explorer sometimes renders an underline (i.e. a hyperlinked space character) if there are extra spaces, and the formatting of this tag prevents those
  spaces from occuring.  
--%>
<c:choose><
  c:when test="${(!empty alternativeHelp)}"
    ><a href="${alternativeHelp}"  target="_blank" title="[Help]${altText}"></c:when
><
  c:when test="${! empty resourceKey }"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getResourceHelpText&amp;resourceKey=${resourceKey}" tabindex="-1" target="helpWindow" title="[Help]${altText}"></c:when
  ><
  c:when test="${(! empty businessObjectClassName) && (! empty attributeName) }"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getAttributeHelpText&amp;businessObjectClassName=${businessObjectClassName}&amp;attributeName=${attributeName}" tabindex="-1" target="helpWindow"  title="[Help]${altText}"></c:when
  ><
  c:when test="${(! empty businessObjectClassName) && ( empty attributeName) }"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getBusinessObjectHelpText&amp;businessObjectClassName=${businessObjectClassName}" tabindex="-1" target="helpWindow" title="[Help]${altText}"></c:when
  ><
  c:when test="${(! empty documentTypeName) && (! empty pageName) }"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getPageHelpText&amp;documentTypeName=${documentTypeName}&amp;pageName=${pageName}" tabindex="-1" target="helpWindow"  title="[Help]${altText}"></c:when
  ><
  c:when test="${! empty documentTypeName }"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getDocumentHelpText&amp;documentTypeName=${documentTypeName}" tabindex="-1" target="helpWindow"  title="[Help]${altText}"></c:when
  ><
  c:when test="${(! empty parameterNamespace) && (! empty parameterDetailType) && (! empty parameterName)}"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getHelpUrlByNamespace&amp;helpParameterNamespace=${parameterNamespace}&amp;helpParameterDetailType=${parameterDetailType}&amp;helpParameterName=${parameterName}" tabindex="-1" target="helpWindow"></c:when
><
  c:when test="${(!empty searchDocumentTypeName)}"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getLookupHelpText&amp;searchDocumentTypeName=${searchDocumentTypeName}" tabindex="-1" target="helpWindow" title="[Help]${altText}"></c:when
><
  c:when test="${(!empty lookupBusinessObjectClassName)}"
    ><a href="${ConfigProperties.application.url}/kr/help.do?methodToCall=getLookupHelpText&amp;lookupBusinessObjectClassName=${lookupBusinessObjectClassName}" tabindex="-1" target="helpWindow" title="[Help]${altText}"></c:when
>
</c:choose
><img src="${ConfigProperties.kr.externalizable.images.url}my_cp_inf.gif" alt="[Help]${altText}" hspace=5 border=0  align="middle"></a>