<%@include file="/init.jsp"%>

<%@page import="com.product.service.service.ProductsLocalServiceUtil" %>

<portlet:renderURL var="serviceRender">
	<portlet:param name="jspPage" value="/serviceForm.jsp"></portlet:param>
</portlet:renderURL>

<div class="container mt-3">
	<h1>Tripple-A Service and Product</h1>
	<aui:button onClick="<%=serviceRender.toString()%>" value="Add Service"></aui:button>
	<liferay-ui:search-container>
		<liferay-ui:search-container-results
		 	results="<%= ProductsLocalServiceUtil.getProducts(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
		 	
		<liferay-ui:search-container-row
			 className="com.product.service.model.Products" modelVar="products">
			<liferay-ui:search-container-column-text name="Service Name" property="serviceName"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Service Description" property="serviceDes"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Service Price" property="servicePrice"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-jsp name="Actions" align="center" path="/serviceAction.jsp"></liferay-ui:search-container-column-jsp>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator></liferay-ui:search-iterator>
	</liferay-ui:search-container>
</div>

