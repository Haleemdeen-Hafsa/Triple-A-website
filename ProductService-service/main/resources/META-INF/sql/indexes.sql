create index IX_B6E76804 on SP_Customer (groupId);
create index IX_E16BB3DA on SP_Customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_162368DC on SP_Customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_16340660 on SP_Products (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_17CAA4E2 on SP_Products (uuid_[$COLUMN_LENGTH:75$], groupId);