<%@include file="/init.jsp"%>

<%@page import="com.product.service.model.Customer" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow" %>

<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Customer customer = (Customer)row.getObject();
%>

<portlet:actionURL name="deleteCustomer" var="deleteActionURL">
	<portlet:param name="customerId" value="<%=String.valueOf(customer.getCustomerId()) %>"></portlet:param>
</portlet:actionURL>

<portlet:renderURL var="editRenderURL">
	<portlet:param name="customerId" value="<%=String.valueOf(customer.getCustomerId()) %>"></portlet:param>
	<portlet:param name="jspPage" value="/customerForm.jsp"></portlet:param>
</portlet:renderURL>

<liferay-ui:icon-menu>
	<liferay-ui:icon image="delete" label="Delete" url="<%=deleteActionURL.toString() %>"></liferay-ui:icon>
	
	<liferay-ui:icon image="edit" label="Edit" url="<%=editRenderURL.toString() %>"></liferay-ui:icon>
</liferay-ui:icon-menu>