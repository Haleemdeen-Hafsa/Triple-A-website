create table SP_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	customerName VARCHAR(75) null,
	customerEmail VARCHAR(75) null,
	customerAddress VARCHAR(75) null,
	customerValidId VARCHAR(75) null,
	customerConNo VARCHAR(75) null,
	productsId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table SP_Products (
	uuid_ VARCHAR(75) null,
	productsId LONG not null primary key,
	serviceName VARCHAR(75) null,
	serviceDes VARCHAR(75) null,
	servicePrice VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);