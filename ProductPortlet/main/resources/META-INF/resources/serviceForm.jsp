<%@ include file="/init.jsp" %>
<%@page import="com.product.service.model.Products" %>
<%@page import="com.product.service.service.ProductsLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<% 
	Products products = null;
	long productsId = ParamUtil.getLong(renderRequest, "ProductsId");
	
	if(productsId>0){
		products = ProductsLocalServiceUtil.getProducts(productsId);
	}
%>
<div class="container mt-2">
	<h3>Service Form</h3>
	
	<portlet:renderURL var="cancelRender">
		<portlet:param name="jspPage" value="/view.jsp"></portlet:param>
	</portlet:renderURL>

	<portlet:actionURL name="addService" var="serviceAction"></portlet:actionURL>
	
	<aui:model-context bean="<%=products %>" model="<%=Products.class %>"></aui:model-context>
	
	<aui:form action="<%=serviceAction %>">
		<aui:input name="productsId" type="hidden"></aui:input>
		<aui:input label="Service Name" name="serviceName" type="text"></aui:input>
		<aui:input label="Service Description" name="serviceDes" type="text"></aui:input>
		<aui:input label="Service Price" name="servicePrice" type="text"></aui:input>
		
		<aui:button type="submit" value="Submit"></aui:button>
		<aui:button onClick="<%=cancelRender.toString()%>" value="Cancel" type="cancel"></aui:button>
	</aui:form>

</div>
