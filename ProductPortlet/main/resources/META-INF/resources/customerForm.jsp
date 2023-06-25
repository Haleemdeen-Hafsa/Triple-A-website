<%@include file="/init.jsp"%>

<%@page import="com.product.service.model.Customer" %>
<%@page import="com.product.service.service.CustomerLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<% 
	Customer customer = null;
	long customerId = ParamUtil.getLong(renderRequest, "customerId");
	
	if(customerId>0){
		customer = CustomerLocalServiceUtil.getCustomer(customerId);
	}
%>

<div class="container mt-2">
	<h1>Customer Form</h1>
	
	<portlet:renderURL var="cancelRender">
		<portlet:param name="jspPage" value="/viewCustomer.jsp"></portlet:param>
	</portlet:renderURL>

	<portlet:actionURL name="addCustomer" var="customerAction"></portlet:actionURL>
	
	<aui:model-context bean="<%=customer %>" model="<%=Customer.class %>"></aui:model-context>
	
	<aui:form action="<%=customerAction %>">
		<aui:input name="customerId" type="hidden"></aui:input>
		<aui:input label="Customer Name" name="customerName" type="text"></aui:input>
		<aui:input label="Email" name="customerEmail" type="email"></aui:input>
		<aui:input label="Address" name="customerAddress" type="text"></aui:input>
		<aui:input label="Valid Id" name="customerValidId" type="text"></aui:input>
		<aui:input label="Contact Number" name="customerConNo" type="text"></aui:input>
		<aui:select label="Service" name="productId">
			<aui:option label="Domain Name" value="1"></aui:option>
			<aui:option label="Shared Hosting" value="2"></aui:option>
			<aui:option label="Reseller Hosting" value="3"></aui:option>
			<aui:option label="Cloud Hosting" value="4"></aui:option>
			<aui:option label="VPS Hosting" value="5"></aui:option>
			<aui:option  label="Dedicated Hosting" value="6"></aui:option>
			<aui:option label="Colocation Service" value="7"></aui:option>
		</aui:select>
		
		
		
		<aui:button type="submit" value="Submit"></aui:button>
		<aui:button onClick="<%=cancelRender.toString()%>" value="Cancel" type="cancel"></aui:button>
	</aui:form>

</div>
