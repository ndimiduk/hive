-- -*- mode:sql -*-

DROP TABLE IF EXISTS hbase_bulk;

CREATE TABLE hbase_bulk (key INT, value STRING)
STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler'
WITH SERDEPROPERTIES ('hbase.columns.mapping' = ':key,cf:string');

INSERT OVERWRITE TABLE hbase_bulk SELECT * FROM src;

SET hive.hbase.bulkload = true;
SET hfile.family.path = /tmp/bulk_hfiles/f;
EXPLAIN INSERT OVERWRITE TABLE hbase_bulk SELECT * FROM src CLUSTER BY key;
