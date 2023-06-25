<%@include file="/init.jsp"%>

<%@page import="com.product.service.service.CustomerLocalServiceUtil" %>

<portlet:renderURL var="customerRender">
	<portlet:param name="jspPage" value="/customerForm.jsp"></portlet:param>
</portlet:renderURL>

<div class="container mt-3">
	<h1>Customer List</h1>
	<aui:button onClick="<%=customerRender.toString()%>" value="Add Customer"></aui:button>
	<liferay-ui:search-container>
		<liferay-ui:search-container-results
		 	results="<%= CustomerLocalServiceUtil.getCustomer(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
		 	
		<liferay-ui:search-container-row
			 className="com.product.service.model.Customer" modelVar="customer">
			<liferay-ui:search-container-column-text name="Name" property="customerName"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Email" property="customerEmail"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Address" property="customerAddress"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Valid Id" property="customerValidId"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Contact Number" property="customerConNo"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text name="Service Buy" property="productsId"></liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-jsp name="Actions" align="center" path="/customerAction.jsp"></liferay-ui:search-container-column-jsp>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator></liferay-ui:search-iterator>
	</liferay-ui:search-container>
</div>

