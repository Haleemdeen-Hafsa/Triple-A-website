<%@include file="/init.jsp"%>

<div class="container">
	<liferay-ui:tabs names="Customer, Service" refresh="false" tabsValues="Customer, Service">
		<liferay-ui:section>
			<%@include file="/viewCustomer.jsp" %>
		</liferay-ui:section>
		
		<liferay-ui:section>
			<%@include file="/viewService.jsp" %>
		</liferay-ui:section>
	</liferay-ui:tabs>
</div>
