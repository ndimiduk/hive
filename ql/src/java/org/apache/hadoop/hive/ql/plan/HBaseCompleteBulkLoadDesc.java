package org.apache.hadoop.hive.ql.plan;

import org.apache.hadoop.fs.Path;

public class HBaseCompleteBulkLoadDesc extends LoadDesc {
  private TableDesc table;

  public HBaseCompleteBulkLoadDesc(Path sourcePath, TableDesc table) {
    super(sourcePath);
    this.table = table;
  }

  @Explain(displayName = "table")
  public TableDesc getTable() { return table; }

  public void setTable(TableDesc table) { this.table = table; }
}
