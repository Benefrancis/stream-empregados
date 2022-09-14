--------------------------------------------------------
--  Arquivo criado - domingo-setembro-11-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table DDD_CUSTOMER
--------------------------------------------------------

CREATE TABLE "DDD_CUSTOMER" (
    "ID"   NUMBER(19, 0),
    "NAME" VARCHAR2(255 BYTE),
    "TIER" VARCHAR2(255 BYTE)
);
--------------------------------------------------------
--  DDL for Table DDD_ORDER_PRODUCT_RELATIONSHIP
--------------------------------------------------------

CREATE TABLE "DDD_ORDER_PRODUCT_RELATIONSHIP" (
    "ORDER_ID"   NUMBER(19, 0),
    "PRODUCT_ID" NUMBER(19, 0)
);
--------------------------------------------------------
--  DDL for Table DDD_PRODUCT
--------------------------------------------------------

CREATE TABLE "DDD_PRODUCT" (
    "ID"       NUMBER(19, 0),
    "CATEGORY" VARCHAR2(255 BYTE),
    "NAME"     VARCHAR2(255 BYTE),
    "PRICE"    NUMBER(19, 2)
);
--------------------------------------------------------
--  DDL for Table DDD_PRODUCT_ORDER
--------------------------------------------------------

CREATE TABLE "DDD_PRODUCT_ORDER" (
    "ID"          NUMBER(19, 0),
    "ORDER_DATE"  DATE,
    "CUSTOMER_ID" NUMBER(19, 0)
);
--------------------------------------------------------
--  DDL for Index DDD_CUSTOMER_PK
--------------------------------------------------------

CREATE UNIQUE INDEX "DDD_CUSTOMER_PK" ON
    "DDD_CUSTOMER" (
        "ID"
    );
--------------------------------------------------------
--  DDL for Index DDD_ORDER_PRODUCT_PK
--------------------------------------------------------

CREATE UNIQUE INDEX "DDD_ORDER_PRODUCT_PK" ON
    "DDD_ORDER_PRODUCT_RELATIONSHIP" (
        "ORDER_ID",
        "PRODUCT_ID"
    );
--------------------------------------------------------
--  DDL for Index PRODUCT_PK
--------------------------------------------------------

CREATE UNIQUE INDEX "PRODUCT_PK" ON
    "DDD_PRODUCT" (
        "ID"
    );
--------------------------------------------------------
--  DDL for Index DDD_PRODUCT_ORDER_PK
--------------------------------------------------------

CREATE UNIQUE INDEX "DDD_PRODUCT_ORDER_PK" ON
    "DDD_PRODUCT_ORDER" (
        "ID"
    );
--------------------------------------------------------
--  Constraints for Table DDD_CUSTOMER
--------------------------------------------------------

ALTER TABLE "DDD_CUSTOMER" MODIFY (
    "ID"
        NOT NULL ENABLE
);

ALTER TABLE "DDD_CUSTOMER" ADD CONSTRAINT "DDD_CUSTOMER_PK" PRIMARY KEY ( "ID" );
--------------------------------------------------------
--  Constraints for Table DDD_ORDER_PRODUCT_RELATIONSHIP
--------------------------------------------------------

ALTER TABLE "DDD_ORDER_PRODUCT_RELATIONSHIP" MODIFY (
    "ORDER_ID"
        NOT NULL ENABLE
);

ALTER TABLE "DDD_ORDER_PRODUCT_RELATIONSHIP" MODIFY (
    "PRODUCT_ID"
        NOT NULL ENABLE
);

ALTER TABLE "DDD_ORDER_PRODUCT_RELATIONSHIP" ADD CONSTRAINT "DDD_ORDER_PRODUCT_PK" PRIMARY KEY ( "ORDER_ID",
                                                                                                 "PRODUCT_ID" );
--------------------------------------------------------
--  Constraints for Table DDD_PRODUCT
--------------------------------------------------------

ALTER TABLE "DDD_PRODUCT" MODIFY (
    "ID"
        NOT NULL ENABLE
);

ALTER TABLE "DDD_PRODUCT" ADD CONSTRAINT "PRODUCT_PK" PRIMARY KEY ( "ID" );
--------------------------------------------------------
--  Constraints for Table DDD_PRODUCT_ORDER
--------------------------------------------------------

ALTER TABLE "DDD_PRODUCT_ORDER" MODIFY (
    "ID"
        NOT NULL ENABLE
);

ALTER TABLE "DDD_PRODUCT_ORDER" ADD CONSTRAINT "DDD_PRODUCT_ORDER_PK" PRIMARY KEY ( "ID" );
--------------------------------------------------------
--  Ref Constraints for Table DDD_ORDER_PRODUCT_RELATIONSHIP
--------------------------------------------------------

ALTER TABLE "DDD_ORDER_PRODUCT_RELATIONSHIP"
    ADD CONSTRAINT "DDD_ORDER_PRODUCT_RELATIONSHIP_FK1" FOREIGN KEY ( "PRODUCT_ID" )
        REFERENCES "DDD_PRODUCT" ( "ID" )
    ENABLE;

ALTER TABLE "DDD_ORDER_PRODUCT_RELATIONSHIP" ADD constraint "DDD_ORDER_PRODUCT_RELATIONSHIP_FK2" FOREIGN
key("ORDER_ID");
--------------------------------------------------------
--  Ref Constraints for Table DDD_PRODUCT_ORDER
--------------------------------------------------------

ALTER TABLE "DDD_PRODUCT_ORDER"
    ADD CONSTRAINT "DDD_PRODUCT_ORDER_FK1" FOREIGN KEY ( "CUSTOMER_ID" )
        REFERENCES "DDD_CUSTOMER" ( "ID" )
    ENABLE;
